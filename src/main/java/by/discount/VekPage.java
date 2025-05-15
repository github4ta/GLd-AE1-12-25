package by.discount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static by.discount.DiscountLocator.*;

public class VekPage {
    private WebDriver driver;

    public VekPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinkDiscount(){
        driver.findElement(By.xpath(LINK_DISCOUNT)).click();
    }
}
