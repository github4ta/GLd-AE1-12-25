package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.vek.LoginLocator.*;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitButtonCookie() {
        WebElement submitButtonCookie = driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE));
        submitButtonCookie.click();
    }

    public void clickSubmitButton(){
        WebElement submitButton = driver.findElement(By.xpath(LoginLocator.SUBMIT_BUTTON));
        submitButton.click();
    }

    public String getAllActionTitleText(){
        WebElement allActionsTitle = driver.findElement(By.xpath(LoginLocator.ALL_ACTION_TITLE));
        return allActionsTitle.getText();
    }

    public void clickButtonLogin(){
        WebElement submitButtonLogin = driver.findElement(By.xpath(BUTTON_LOGIN));
        submitButtonLogin.click();
    }

    public String getTextTitleLoginForm(){
        return driver.findElement(By.xpath(TITLE_LOGIN_FORM)).getText();
    }

    public void click () {
        WebElement linkAllActions = driver.findElement(By.xpath(LoginLocator.LINK_ALL_ACTIONS));
        linkAllActions.click();
    }

    public void clickLinkButtonRegistration() {
        WebElement linkButtonRegistration = driver.findElement(By.xpath(LoginLocator.LINK_BUTTON_REGISTRATION));
        linkButtonRegistration.click();
    }

    public String getTextTitleRegistration() {
        WebElement titleRegistration = driver.findElement(By.xpath(LoginLocator.TITLE_REGISTRATION));
        return titleRegistration.getText();
    }

    public void clickButtonContinue() {
        WebElement buttonContinue = driver.findElement(By.xpath(LoginLocator.BUTTON_CONTINUE));
        buttonContinue.click();
    }

    public String getTextErrorMessageNoRegisterEmailInput() {
        return driver.findElement(By.xpath(LoginLocator.ERROR_MESSAGE_NO_REGISTER_EMAIL_INPUT)).getText();
    }

    public void sendKeysInputEmailField(String email) {
        WebElement inputEmailField = driver.findElement(By.xpath(LoginLocator.INPUT_EMAIL_FIELD));
        inputEmailField.sendKeys(email);
    }

    public void clickRadioButtonChooseEmail() {
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(LoginLocator.RADIO_BUTTON_CHOOSE_EMAIL));
    }

    public String getTextErrorMessageEmailEmailInput() {
        WebElement errorMessageEmailEmailInput = driver.findElement(By.xpath(LoginLocator.ERROR_MESSAGE_EMAIL_INPUT));

        return errorMessageEmailEmailInput.getText();
    }

    public void setEmail(String email) {
        WebElement inputEmailField = driver.findElement(By.xpath(LoginLocator.INPUT_EMAIL_FIELD));
        inputEmailField.sendKeys(email);
    }

    public String getErrorMessagePasswordInputText() {
        WebElement getErrorMessagePasswordInputText = driver.findElement(By.xpath(LoginLocator.ERROR_MESSAGE_PASSWORD_INPUT));
        return getErrorMessagePasswordInputText.getText();
    }

    public String getErrorMessageWrongEmailText() {
        WebElement getErrorMessageWrongEmailText = driver.findElement(By.xpath(ERROR_MESSAGE_WRONG_EMAIL));
        return getErrorMessageWrongEmailText.getText();
    }

    public void sendKeysInputPasswordField(String password) {
        driver.findElement(By.xpath(LoginLocator.INPUT_PASSWORD_FIELD)).sendKeys(password);
    }

    public void clickButtonUserAccount() {
        driver.findElement(By.xpath(BUTTON_USER_ACCOUNT)).click();
    }
}
