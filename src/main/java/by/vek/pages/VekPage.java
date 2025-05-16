package by.vek.pages;

import by.vek.driver.Driver;
import by.vek.pages.discount.DiscountLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VekPage {

    private final String LINK_COFFEE = "//div[@class='styles_promoList__yozMt']//a[@href='/coffee/']";
    private final String BUTTON_CATALOG = "//button[@class=\"styles_catalogButton__z9L_j\"]";

    private WebDriver driver;

    public VekPage(){
        this.driver = Driver.getDriver();
    }

    public void clickButtonCatalog() {
        driver.findElement(By.xpath(BUTTON_CATALOG)).click();
    }

    public void clickLinkDiscount(){
        driver.findElement(By.xpath(DiscountLocator.LINK_DISCOUNT)).click();
    }

    public void clickLinkCoffee() {
        driver.findElement(By.xpath(LINK_COFFEE)).click();
    }
}
