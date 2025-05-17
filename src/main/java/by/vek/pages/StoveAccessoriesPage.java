package by.vek.pages;

import org.openqa.selenium.By;

public class StoveAccessoriesPage extends BasePage {

    private final String CATEGORY_NAME = "//h1[@data-testid='category-name']";
    private final String REFRIGERATOR_ACCESSORIES_LINK =  "//a[@href=\"/refrigerator_accessories/\"]";
    private final String MICROWAVE_ACCESSORIES_LINK =  "//a[@href=\"/microwave_accessories/\"]";

    public StoveAccessoriesPage() {
        super();
    }

    public String getCategoryNameText() {
        return driver.findElement(By.xpath(CATEGORY_NAME)).getText();
    }

    public String getRefrigeratorAccessoriesLinkText() {
        return driver.findElement(By.xpath(REFRIGERATOR_ACCESSORIES_LINK)).getText();
    }

    public String getMicrowaveAccessoriesLinkText() {
        return driver.findElement(By.xpath(MICROWAVE_ACCESSORIES_LINK)).getText();
    }
}
