package pesetskiy.rw.by.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pesetskiy.rw.by.driver.Driver;

public class BasePage {

    private static final String BUTTON_ACCEPT_COOKIE = "//button[@class=\"btn btn-default mc-btn-all\"]";
    private static final String BUTTON_CABINET = "//li[@class=\"item_1 cabinet\"]";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get( "https://pass.rw.by/ru/");
        try {
            clickButtonAcceptCookie();
            clickButtonCabinet();
        } catch (Exception ignored) {
        }
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(BUTTON_ACCEPT_COOKIE)).click();
    }

    public void clickButtonCabinet() {
        driver.findElement(By.xpath(BUTTON_CABINET)).click();
    }
}