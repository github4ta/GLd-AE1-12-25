package pesetskiy.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private static final String BUTTON_ACCEPT_COOKIE = "//button[@class=\"btn btn-default mc-btn-all\"]";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get( "https://pass.rw.by/ru/");
        try {
            clickButtonAcceptCookie();
        } catch (Exception ignored) {
        }
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(BUTTON_ACCEPT_COOKIE)).click();
    }
}