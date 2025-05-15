package by.vek.pages;

import by.vek.driver.Driver;
import by.vek.util.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static by.vek.pages.DiscountLocator.*;

public class VekPage {
    private WebDriver driver;

    public VekPage(){
        this.driver = Driver.getDriver();
    }

    public void clickLinkDiscount(){
        Waits.waitOfSeconds(4);
        driver.findElement(By.xpath(LINK_DISCOUNT)).click();
    }
}
