package by.vek.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final String SUBMIT_BUTTON_COOKIE_LOCATOR = "//button[@class='Button-module__button Button-module__blue-primary']";

    //protected static final Logger logger = LogManager.getLogger();
    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get( "https://www.21vek.by");
        try {
            clickCloseCookie();
        } catch (Exception e) {

        }
    }

    public void clickCloseCookie() {
        driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE_LOCATOR)).click();
    }
}
