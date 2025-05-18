package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRestoreModalWindow {

    private final By restorePasswordModalWindow = By.xpath("//div[@class=\"reg-info-modal__content modal-content\"]");
    private final By closeHeaderButton = By.xpath("//button[@class=\"reg-info-modal__close close\"]");
    private final By restorePasswordModalWindowTitle = By.xpath("//h1[@class=\"small\"]");
    private final By informationTextBlock = By.xpath("//div[@class=\"reg-info-modal__text\"]");
    private final By closeButton = By.xpath("//button[@class=\"btn btn-default reg-info-modal__btn\"]");

    protected WebDriver driver;

    public PasswordRestoreModalWindow() {
        driver = Driver.getDriver();
    }

    public boolean isPasswordRestoreModalWindowDisplayed() {
        return driver.findElement(restorePasswordModalWindow).isDisplayed();
    }

    public boolean isCloseHeaderButtonDisplayed() {
        return driver.findElement(closeHeaderButton).isDisplayed();
    }

    public boolean isCloseHeaderButtonActive() {
        return driver.findElement(closeHeaderButton).isEnabled();
    }

    public boolean isCloseButtonDisplayed() {
        return driver.findElement(closeButton).isDisplayed();
    }

    public boolean isCloseButtonActive() {
        return driver.findElement(closeButton).isEnabled();
    }

    public String getTextRestorePasswordModalWindowTitle() {
        return driver.findElement(restorePasswordModalWindowTitle).getText();
    }

    public String getTextInformationTextBlock() {
        return driver.findElement(informationTextBlock).getText();
    }

    public String getTextCloseButton() {
        return driver.findElement(closeButton).getText();
    }

    public void clickCloseHeaderButton() {
        driver.findElement(closeHeaderButton).click();
    }

    public void clickCloseButton() {
        driver.findElement(closeButton).click();
    }
}
