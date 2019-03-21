package com.yourcompany.tests;

import com.yourcompany.Pages.InventoryPage;
import org.testng.annotations.Test;

public class InventoryTest extends BaseWebDriverTest {
    @Test
    public void addOneItemToCart() {
        InventoryPage page = new InventoryPage();
        page.isOnPage();
    }
}
