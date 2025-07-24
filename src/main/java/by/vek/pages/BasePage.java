package by.vek.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final String BUTTON_ACCEPT_COOKIE = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";

    //protected static final Logger logger = LogManager.getLogger();
    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get( "https://www.21vek.by");
        try {
            clickButtonAcceptCookie();
        } catch (Exception ignored) {
        }
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(BUTTON_ACCEPT_COOKIE)).click();
    }
}
