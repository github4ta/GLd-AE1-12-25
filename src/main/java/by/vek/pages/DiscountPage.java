package by.vek.pages;

import by.vek.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.vek.pages.DiscountLocator.INFO_MESSAGE;
import static by.vek.pages.DiscountLocator.TITLE_ALL_ACTIONS;

public class DiscountPage {

    private WebDriver driver;

    public DiscountPage(){
        driver = MyDriver.getDriver();
    }

    public String getAllActionTitleText(){
        return driver.findElement(By.xpath(TITLE_ALL_ACTIONS)).getText();
    }

    public String getInfoMessageText(){
        return driver.findElement(By.xpath(INFO_MESSAGE)).getText();
    }
}
