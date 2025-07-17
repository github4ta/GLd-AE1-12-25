package kuleshov.rw.by;

import by.vek.driver.Driver;
import kuleshov.rw.by.pages.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends Header {

    private final By closeNotificationButton = By.xpath("//div[@class=\"notification-modal__header\"]//button[@class=\"close close--black\"]");
    private final By acceptCookieButton = By.xpath("//button[@class=\"btn btn-default mc-btn-all\"]");

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void openHomePage() {
        driver.get("https://pass.rw.by/ru");
        clickCloseNotificationButton();
        clickAcceptCookieButton();
    }

    public void clickCloseNotificationButton() {
        driver.findElement(closeNotificationButton).click();

    }

    public void clickAcceptCookieButton() {
        driver.findElement(acceptCookieButton).click();
    }
}
