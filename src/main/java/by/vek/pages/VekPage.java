package by.vek.pages;

import by.vek.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static by.vek.pages.DiscountLocator.*;

public class VekPage {
    private WebDriver driver;

    public VekPage(){
        this.driver = MyDriver.getDriver();
    }

    public void clickLinkDiscount(){
        driver.findElement(By.xpath(LINK_DISCOUNT)).click();
    }
}
