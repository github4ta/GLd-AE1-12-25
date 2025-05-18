package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class AuthorizationForm {

    private final By authorizationModalWindow = By.xpath("//*[@id=\"auth-popup\"]//div[@class=\"modal-content\"]");
    private final By headerTitle = By.xpath("//div[@class=\"auth-modal__title h3\"]");
    private final By errorMessage = By.xpath("//div[@class=\"danger standalone\"]");
    private final By loginOrEmailFieldNameLabel = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[1]");
    private final By loginOrEmailFieldInput = By.xpath("//input[@name=\"login\"]");
    private final By loginOrEmailFieldErrorMessage = By.id("login-error");
    private final By passwordFieldNameLabel = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[2]");
    private final By passwordFieldInput = By.xpath("//input[@name=\"password\"]");
    private final By passwordFieldErrorMessage = By.id("password-error");
    private final By forgotPasswordButton = By.xpath("//a[@href=\"/ru/registration/pwd_restore/\"]");
    private final By submitButton = By.xpath("//input[@name=\"dologin\"]");
    private final By loginWithSocialTitle = By.xpath("//div[@class=\"auth-modal__social-title\"]");
    private final By footerTitle = By.xpath("//div[@class=\"auth-modal__caption\"]");
    private final By registrationButton = By.xpath("//a[@href=\"/ru/registration/\"]");

    protected WebDriver driver;

    public AuthorizationForm() {
        driver = Driver.getDriver();
    }

    public WebElement getAuthorizationForm() {
        return driver.findElement(authorizationModalWindow);
    }

    public String getTextHeaderTitle() {
        return driver.findElement(headerTitle).getText();
    }

    public String getTextLoginOrEmailFieldNameLabel() {
        return driver.findElement(loginOrEmailFieldNameLabel).getText();
    }

    public String getTextPasswordFieldNameLabel() {
        return driver.findElement(passwordFieldNameLabel).getText();
    }

    public String getTextSubmitButton() {
        return driver.findElement(submitButton).getDomAttribute("value").toUpperCase(Locale.ROOT);
    }

    public String getTextForgotPasswordButton() {
        return driver.findElement(forgotPasswordButton).getText();
    }

    public String getTextLoginWithSocialTitle() {
        return driver.findElement(loginWithSocialTitle).getText();
    }

    public String getTextFooterTitle() {
        return driver.findElement(footerTitle).getText();
    }

    public String getTextRegistrationButton() {
        return driver.findElement(registrationButton).getText();
    }

    public String getTextLoginOrEmailFieldErrorMessage() {
        return driver.findElement(loginOrEmailFieldErrorMessage).getText();
    }

    public String getTextPasswordFieldErrorMessage() {
        return driver.findElement(passwordFieldErrorMessage).getText();
    }

    public String getTextErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void sendKeysLoginOrEmailFieldInput(String loginOrEmailValue) {
        driver.findElement(loginOrEmailFieldInput).sendKeys(loginOrEmailValue);
    }

    public void sendKeysPasswordFieldInput(String passwordValue) {
        driver.findElement(passwordFieldInput).sendKeys(passwordValue);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public PasswordRestorePage clickForgotPasswordButton() {
        driver.findElement(forgotPasswordButton).click();

        return new PasswordRestorePage();
    }

    public RegistrationPage clickRegistrationButton() {
        driver.findElement(registrationButton).click();

        return new RegistrationPage();
    }
}
