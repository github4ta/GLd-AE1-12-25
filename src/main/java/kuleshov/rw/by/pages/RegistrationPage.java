package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private final By PAGE_TITLE = By.xpath("//h1");
    private final By INFORMATION_TEXT_BLOCK = By.xpath("//div[@class=\"registration__desc\"]");
    private final By LAST_NAME_FIELD_LABEL = By.xpath("(//form[@class=\"registration__form\"]//div[@class=\"name\"])[1]");
    private final By LAST_NAME_FIELD_INPUT = By.xpath("//input[@id=\"lastName\"]");
    private final By LAST_NAME_FIELD_ERROR_MESSAGE = By.xpath("//label[@id=\"lastName-error\"]");
    private final By FIRST_NAME_FIELD_LABEL = By.xpath("(//form[@class=\"registration__form\"]//div[@class=\"name\"])[2]");
    private final By FIRST_NAME_FIELD_INPUT = By.xpath("//input[@id=\"firstName\"]");
    private final By FIRST_NAME_FIELD_ERROR_MESSAGE = By.xpath("//label[@id=\"firstName-error\"]");
    private final By EMAIL_FIELD_LABEL = By.xpath("(//form[@class=\"registration__form\"]//div[@class=\"name\"])[3]");
    private final By EMAIL_FIELD_INPUT = By.xpath("//input[@id=\"login\"]");
    private final By EMAIL_FIELD_ERROR_MESSAGE = By.xpath("//label[@id=\"login-error\"]");
    private final By PASSWORD_FIELD_LABEL = By.xpath("(//form[@class=\"registration__form\"]//div[@class=\"name\"])[4]");
    private final By PASSWORD_FIELD_INPUT = By.xpath("//input[@id=\"password\"]");
    private final By PASSWORD_REQUIREMENT_TEXT_BLOCK = By.xpath("//form[@class=\"registration__form\"]//p[@class=\"help-block\"]");
    private final By PASSWORD_FIELD_ERROR_MESSAGE = By.xpath("//label[@id=\"password-error\"]");
    private final By REPEAT_PASSWORD_FIELD_LABEL = By.xpath("(//form[@class=\"registration__form\"]//div[@class=\"name\"])[5]");
    private final By REPEAT_PASSWORD_FIELD_INPUT = By.xpath("//input[@id=\"password2\"]");
    private final By REPEAT_PASSWORD_FIELD_ERROR_MESSAGE = By.xpath("//label[@id=\"password2-error\"]");
    private final By RULES_OF_PAYMENT_TEXT_BLOCK = By.xpath("//div[@class=\"registration__confirm\"]");
    private final By RULES_OF_PAYMENT_LINK = By.xpath("//a[@href=\"https://cms.rw.by/upload/order-rules-full-ru.pdf\"]");
    private final By SUBMIT_REGISTRATION_BUTTON = By.xpath("//button[@class=\"btn btn-default registration__submit\"]");
    private final By HAS_PROFILE_LINK = By.xpath("//a[@class=\"registration__enter-link\"]");

    protected WebDriver driver;

    public RegistrationPage() {
        driver = Driver.getDriver();
    }

    public String getTextPageTitle() {
        return driver.findElement(PAGE_TITLE).getText();
    }

    public String getTextInformationTextBlock() {
        return driver.findElement(INFORMATION_TEXT_BLOCK).getText();
    }

    public String getTextLastNameFieldLabel() {
        return driver.findElement(LAST_NAME_FIELD_LABEL).getText();
    }

    public String getTextLastNameFieldErrorMessage() {
        return driver.findElement(LAST_NAME_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextFirstNameFieldLabel() {
        return driver.findElement(FIRST_NAME_FIELD_LABEL).getText();
    }

    public String getTextFirstNameFieldErrorMessage() {
        return driver.findElement(FIRST_NAME_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextEmailFieldLabel() {
        return driver.findElement(EMAIL_FIELD_LABEL).getText();
    }

    public String getTextEmailFieldErrorMessage() {
        return driver.findElement(EMAIL_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextPasswordFieldLabel() {
        return driver.findElement(PASSWORD_FIELD_LABEL).getText();
    }

    public String getTextPasswordRequirementTextBlock() {
        return driver.findElement(PASSWORD_REQUIREMENT_TEXT_BLOCK).getText();
    }

    public String getTextPasswordFieldErrorMessage() {
        return driver.findElement(PASSWORD_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextRepeatPasswordFieldLabel() {
        return driver.findElement(REPEAT_PASSWORD_FIELD_LABEL).getText();
    }

    public String getTextRepeatPasswordFieldErrorMessage() {
        return driver.findElement(REPEAT_PASSWORD_FIELD_ERROR_MESSAGE).getText();
    }

    public String getTextRulesOfPaymentTextBlock() {
        return driver.findElement(RULES_OF_PAYMENT_TEXT_BLOCK).getText();
    }

    public String getTextSubmitRegistrationButton() {
        return driver.findElement(SUBMIT_REGISTRATION_BUTTON).getText();
    }

    public String getTextHasProfileLink() {
        return driver.findElement(HAS_PROFILE_LINK).getText();
    }

    public void sendKeysEmailFieldInput(String emailValue) {
        driver.findElement(EMAIL_FIELD_INPUT).sendKeys(emailValue);
    }

    public void sendKeysPasswordFieldInput(String passwordValue) {
        driver.findElement(PASSWORD_FIELD_INPUT).sendKeys(passwordValue);
    }

    public void sendKeysRepeatPasswordFieldInput(String repeatPasswordValue) {
        driver.findElement(REPEAT_PASSWORD_FIELD_INPUT).sendKeys(repeatPasswordValue);
    }

    public void clickSubmitRegistrationButton() {
        driver.findElement(SUBMIT_REGISTRATION_BUTTON).click();
    }

    public AuthorizationForm clickHasProfileLink() {
        driver.findElement(HAS_PROFILE_LINK).click();

        return new AuthorizationForm();
    }

    public String getBaseURIAttributeRulesOfPaymentLink() {
        return driver.findElement(RULES_OF_PAYMENT_LINK).getDomAttribute("href");
    }
}
