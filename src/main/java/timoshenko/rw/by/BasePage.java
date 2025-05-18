package timoshenko.rw.by;

import by.vek.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    private static final String INFO_MODAL_CLOSE_LOCATOR = "//div[@id='notification-popup']//button[@class='close close--black']";
    private static final String SUBMIT_BUTTON_COOKIE_LOCATOR = "//button[@class='btn btn-default mc-btn-all']";
    private static final String SUBMIT_BUTTON_LOGIN_PROFILE = "//a[@data-target='#auth-popup']";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get("https://pass.rw.by/ru/");
        clickCloseCookie();
        clickCloseModalCheckbox();
        clickLoginProfile();
    }

    public void clickCloseModalCheckbox() {
        WebElement element = driver.findElement(By.xpath(INFO_MODAL_CLOSE_LOCATOR));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d -> element.isDisplayed());
        element.click();
    }

    public void clickCloseCookie() {
        WebElement element = driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE_LOCATOR));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d -> element.isDisplayed());
        element.click();
    }

    public void clickLoginProfile(){
        driver.findElement(By.xpath(SUBMIT_BUTTON_LOGIN_PROFILE)).click();
    }
}
