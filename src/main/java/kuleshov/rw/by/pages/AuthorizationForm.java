package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class AuthorizationForm {

    private final By AUTHORIZATION_MODAL_WINDOW = By.xpath("//*[@id=\"auth-popup\"]//div[@class=\"modal-content\"]");
    private final By HEADER_TITLE = By.xpath("//div[@class=\"auth-modal__title h3\"]");
    private final By ERROR_MESSAGE = By.xpath("//div[@class=\"danger standalone\"]");
    private final By LOGIN_OR_EMAIL_FIELD_NAME_LABEL = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[1]");
    private final By LOGIN_OR_EMAIL_FIELD_INPUT = By.xpath("//input[@name=\"login\"]");
    private final By LOGIN_OR_EMAIL_FIELD_ERROR_MESSAGE = By.id("login-error");
    private final By PASSWORD_FIELD_NAME_LABEL = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[2]");
    private final By PASSWORD_FIELD_INPUT = By.xpath("//input[@name=\"password\"]");
    private final By PASSWORD_FIELD_ERROR_MESSAGE = By.id("password-error");
    private final By FORGOT_PASSWORD_BUTTON = By.xpath("//a[@href=\"/ru/registration/pwd_restore/\"]");
    private final By SUBMIT_BUTTON = By.xpath("//input[@name=\"dologin\"]");
    private final By LOGIN_WITH_SOCIAL_TITLE = By.xpath("//div[@class=\"auth-modal__social-title\"]");
    private final By FOOTER_TITLE = By.xpath("//div[@class=\"auth-modal__caption\"]");
    private final By REGISTRATION_BUTTON = By.xpath("//a[@href=\"/ru/registration/\"]");

    protected WebDriver driver;

    public AuthorizationForm() {
        driver = Driver.getDriver();
    }

    public WebElement getAuthorizationForm() {
        return driver.findElement(AUTHORIZATION_MODAL_WINDOW);
    }

    public String getTextHeaderTitle() {
        return driver.findElement(HEADER_TITLE).getText();
    }

    public String getTextLoginOrEmailFieldNameLabel() {
        return driver.findElement(LOGIN_OR_EMAIL_FIELD_NAME_LABEL).getText();
    }

    public String getTextPasswordFieldNameLabel() {
        return driver.findElement(PASSWORD_FIELD_NAME_LABEL).getText();
    }

    public String getTextSubmitButton() {
        return driver.findElement(SUBMIT_BUTTON).getDomAttribute("value").toUpperCase(Locale.ROOT);
    }

    public String getTextForgotPasswordButton() {
        return driver.findElement(FORGOT_PASSWORD_BUTTON).getText();
    }

    public String getTextLoginWithSocialTitle() {
        return driver.findElement(LOGIN_WITH_SOCIAL_TITLE).getText();
    }

    public String getTextFooterTitle() {
        return driver.findElement(FOOTER_TITLE).getText();
    }

    public String getTextRegistrationButton() {
        return driver.findElement(REGISTRATION_BUTTON).getText();
    }

    public String getTextLoginOrEmailFieldErrorMessage() {
        return driver.findElement(LOGIN_OR_EMAIL_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextPasswordFieldErrorMessage() {
        return driver.findElement(PASSWORD_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextErrorMessage() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public void sendKeysLoginOrEmailFieldInput(String loginOrEmailValue) {
        driver.findElement(LOGIN_OR_EMAIL_FIELD_INPUT).sendKeys(loginOrEmailValue);
    }

    public void sendKeysPasswordFieldInput(String passwordValue) {
        driver.findElement(PASSWORD_FIELD_INPUT).sendKeys(passwordValue);
    }

    public void clickSubmitButton() {
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public PasswordRestorePage clickForgotPasswordButton() {
        driver.findElement(FORGOT_PASSWORD_BUTTON).click();

        return new PasswordRestorePage();
    }

    public RegistrationPage clickRegistrationButton() {
        driver.findElement(REGISTRATION_BUTTON).click();

        return new RegistrationPage();
    }

    public boolean isAuthorizationModalWindowDisplayed() {
        return driver.findElement(AUTHORIZATION_MODAL_WINDOW).isDisplayed();
    }

    public void waitUntilAuthorizationFormIsDisplayed() {
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(d -> getAuthorizationForm().isDisplayed());
    }
}
