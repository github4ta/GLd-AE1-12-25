package com.onepagelove;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OnepagelovePage {

    private final String HOME_PAGE_URL = "https://onepagelove.com/";
    private final String NITROMOST_LINK = "//h2/a[@title=\"Nitromost\"]";
    private final String JAMM_LINK = "//h2/a[@title=\"Jamm\"]";
    private final String NORMA_HR_LINK = "//h2/a[@title=\"Norma HR\"]";

    private WebDriver driver;

    public OnepagelovePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get(HOME_PAGE_URL);
    }

    public String getJammLinkText() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .scrollByAmount(0, 1000)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }
}
