package by.vek.pages.discount;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.vek.pages.discount.DiscountLocator.INFO_MESSAGE;
import static by.vek.pages.discount.DiscountLocator.TITLE_ALL_ACTIONS;

public class DiscountPage {

    private WebDriver driver;

    public DiscountPage(){
        driver = Driver.getDriver();
    }

    public String getAllActionTitleText(){
        return driver.findElement(By.xpath(TITLE_ALL_ACTIONS)).getText();
    }

    public String getInfoMessageText(){
        return driver.findElement(By.xpath(INFO_MESSAGE)).getText();
    }
}
