package aivkin.rw.by.pages.home.authorizationform.registration;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage() { driver = Driver.getDriver(); }

    public String getTitleRegistrationText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.TITLE_REGISTRATION)).getText();
    }

    public String getRegistrationInformationText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.REGISTRATION_INFORMATION)).getText();
    }

    public String getLabelInputLastnameText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LABEL_INPUT_LASTNAME)).getText();
    }

    public void InputLastname(String lastname) {
        driver.findElement(By.xpath(RegistrationPageLocator.INPUT_LASTNAME)).sendKeys(lastname);
    }

    public String getLabelInputFirstnameText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LABEL_INPUT_FIRSTNAME)).getText();
    }

    public void InputFirstname(String firstname) {
        driver.findElement(By.xpath(RegistrationPageLocator.INPUT_FIRSTNAME)).sendKeys(firstname);
    }

    public String getLabelInputEmailText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LABEL_INPUT_EMAIL)).getText();
    }

    public void InputEmail(String email) {
        driver.findElement(By.xpath(RegistrationPageLocator.INPUT_EMAIL)).sendKeys(email);
    }

    public String getLabelInputPasswordText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LABEL_INPUT_PASSWORD)).getText();
    }

    public void InputPassword(String password) {
        driver.findElement(By.xpath(RegistrationPageLocator.INPUT_PASSWORD)).sendKeys(password);
    }

    public String getLabelInputRepeatPasswordText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LABEL_INPUT_REPEAT_PASSWORD)).getText();
    }

    public void InputRepeatPassword(String repeatPassword) {
        driver.findElement(By.xpath(RegistrationPageLocator.INPUT_REPEAT_PASSWORD)).sendKeys(repeatPassword);
    }

    public String getRegistrationInformationRulesText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.REGISTRATION_INFORMATION_RULES)).getText();
    }

    public String getLinkRulesText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LINK_RULES)).getText();
    }

    public void clickLinkRules() {
        driver.findElement(By.xpath(RegistrationPageLocator.LINK_RULES)).click();
    }

    public String getButtonRegistrationText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.BUTTON_REGISTRATION)).getText();
    }

    public void clickButtonRegistration() {
        driver.findElement(By.xpath(RegistrationPageLocator.BUTTON_REGISTRATION)).click();
    }

    public String getLinkAlreadyHaveAccountText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LINK_ALREADY_HAVE_ACCOUNT)).getText();
    }

    public void clickLinkAlreadyHaveAccountText() {
        driver.findElement(By.xpath(RegistrationPageLocator.LINK_ALREADY_HAVE_ACCOUNT)).click();
    }

    public String getRegistrationPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getLinkRulesAttributeHrefText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.LINK_RULES)).getDomAttribute("href");
    }

    public boolean isDisplayedModalWindowAuthorization() {
        return driver.findElement(By.xpath(RegistrationPageLocator.MODAL_WINDOW_AUTHORIZATION)).isDisplayed();
    }

    public boolean isDisplayedErrorMessageInputLastname() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_LASTNAME)).isDisplayed();
    }

    public String getErrorMessageInputLastnameText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_LASTNAME)).getText();
    }

    public boolean isDisplayedErrorMessageInputFirstname() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_FIRSTNAME)).isDisplayed();
    }

    public String getErrorMessageInputFirstnameText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_FIRSTNAME)).getText();
    }

    public boolean isDisplayedErrorMessageInputEmail() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_EMAIL)).isDisplayed();
    }

    public String getErrorMessageInputEmailText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_EMAIL)).getText();
    }

    public boolean isDisplayedErrorMessageInputPassword() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_PASSWORD)).isDisplayed();
    }

    public String getErrorMessageInputPasswordText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_PASSWORD)).getText();
    }

    public boolean isDisplayedErrorMessageInputRepeatPassword() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_REPEAT_PASSWORD)).isDisplayed();
    }

    public String getErrorMessageInputRepeatPasswordText() {
        return driver.findElement(By.xpath(RegistrationPageLocator.ERROR_MESSAGE_INPUT_REPEAT_PASSWORD)).getText();
    }
}
