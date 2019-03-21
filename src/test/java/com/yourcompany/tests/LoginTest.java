package com.yourcompany.tests;

import com.yourcompany.Pages.InventoryPage;
import com.yourcompany.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseWebDriverTest {
    @Test
    public void loginTest() {
        LoginPage page = new LoginPage(getWebDriver());
        page.login("standard_user", "secret_sauce");
        Assert.assertTrue(new InventoryPage().isOnPage());
    }
}