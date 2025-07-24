package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordRestoreModalWindow {

    private final By RESTORE_PASSWORD_MODAL_WINDOW = By.xpath("//div[@class=\"reg-info-modal__content modal-content\"]");
    private final By CLOSE_HEADER_BUTTON = By.xpath("//button[@class=\"reg-info-modal__close close\"]");
    private final By RESTORE_PASSWORD_MODAL_WINDOW_TITLE = By.xpath("//h1[@class=\"small\"]");
    private final By INFORMATION_TEXT_BLOCK = By.xpath("//div[@class=\"reg-info-modal__text\"]");
    private final By CLOSE_BUTTON = By.xpath("//button[@class=\"btn btn-default reg-info-modal__btn\"]");

    protected WebDriver driver;

    public PasswordRestoreModalWindow() {
        driver = Driver.getDriver();
    }

    public boolean isPasswordRestoreModalWindowDisplayed() {
        return driver.findElement(RESTORE_PASSWORD_MODAL_WINDOW).isDisplayed();
    }

    public boolean isCloseHeaderButtonDisplayed() {
        return driver.findElement(CLOSE_HEADER_BUTTON).isDisplayed();
    }

    public boolean isCloseHeaderButtonActive() {
        return driver.findElement(CLOSE_HEADER_BUTTON).isEnabled();
    }

    public boolean isCloseButtonDisplayed() {
        return driver.findElement(CLOSE_BUTTON).isDisplayed();
    }

    public boolean isCloseButtonActive() {
        return driver.findElement(CLOSE_BUTTON).isEnabled();
    }

    public String getTextRestorePasswordModalWindowTitle() {
        return driver.findElement(RESTORE_PASSWORD_MODAL_WINDOW_TITLE).getText();
    }

    public String getTextInformationTextBlock() {
        return driver.findElement(INFORMATION_TEXT_BLOCK).getText();
    }

    public String getTextCloseButton() {
        return driver.findElement(CLOSE_BUTTON).getText();
    }

    public void clickCloseHeaderButton() {
        driver.findElement(CLOSE_HEADER_BUTTON).click();
    }

    public void clickCloseButton() {
        driver.findElement(CLOSE_BUTTON).click();
    }

    public void waitUntilPasswordRestoreModalWindowIsDisplayed() {
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(d -> isPasswordRestoreModalWindowDisplayed());
    }
}
