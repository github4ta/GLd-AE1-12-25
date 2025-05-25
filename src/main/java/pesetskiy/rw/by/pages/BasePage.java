package pesetskiy.rw.by.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pesetskiy.rw.by.driver.Driver;
import pesetskiy.rw.by.pages.authorizationForm.AuthorizationFormLocator;

import java.time.Duration;

public class BasePage {

    private static final String BUTTON_ACCEPT_COOKIE = "//button[@class=\"btn btn-default mc-btn-all\"]";
    private static final String BUTTON_CABINET = "//li[@class=\"item_1 cabinet\"]";
    private static final String AUTHORIZATION_MODAL_WINDOW = "//*[@id=\"auth-popup\"]//div[@class=\"modal-content\"]";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get( "https://pass.rw.by/ru/");
        try {
            clickButtonAcceptCookie();
            clickButtonCabinet();
            getAuthorizationForm();
            getAuthorizationFormAndWait();
        } catch (Exception ignored) {
        }
    }

    public void clickButtonAcceptCookie() {
        driver.findElement(By.xpath(BUTTON_ACCEPT_COOKIE)).click();
    }

    public void clickButtonCabinet() {
        driver.findElement(By.xpath(BUTTON_CABINET)).click();
    }

    public WebElement getAuthorizationForm() {
        return driver.findElement(By.xpath(AUTHORIZATION_MODAL_WINDOW));
    }

    public void getAuthorizationFormAndWait() {
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(d -> getAuthorizationForm().isDisplayed());
    }
}
