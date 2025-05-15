package by.vek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static by.vek.pages.DiscountLocator.*;

public class VekPage {
    private WebDriver driver;

    public VekPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinkDiscount(){
        driver.findElement(By.xpath(LINK_DISCOUNT)).click();
    }
}
