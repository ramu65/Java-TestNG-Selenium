package com.yourcompany.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
    @FindBy(className = "header_label")
    private WebElement headerLabel;

    @FindBy(className = "product_sort_container")
    private WebElement sortList;

    public boolean isOnPage() {
        return headerLabel.isDisplayed();
    }
}
