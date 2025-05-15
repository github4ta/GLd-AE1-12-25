package by.discount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.discount.DiscountLocator.INFO_MESSAGE;
import static by.discount.DiscountLocator.TITLE_ALL_ACTIONS;

public class DiscountPage {

    private WebDriver driver;

    public DiscountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAllActionTitleText(){
        return driver.findElement(By.xpath(TITLE_ALL_ACTIONS)).getText();
    }

    public String getInfoMessageText(){
        return driver.findElement(By.xpath(INFO_MESSAGE)).getText();
    }
}
