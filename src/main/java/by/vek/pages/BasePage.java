package by.vek.pages;

import by.vek.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final String SUBMIT_BUTTON_COOKIE_LOCATOR = "//button[@class='Button-module__button Button-module__blue-primary']";

    protected WebDriver driver;

    public BasePage() {
        driver = MyDriver.getDriver();
    }

    public void open() {
        driver.get( "https://www.21vek.by");
        clickCloseCookie();
    }

    public void clickCloseCookie() {
        driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE_LOCATOR)).click();
    }
}
