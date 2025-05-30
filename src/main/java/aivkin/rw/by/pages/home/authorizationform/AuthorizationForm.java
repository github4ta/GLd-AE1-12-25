package aivkin.rw.by.pages.home.authorizationform;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationForm {
    private WebDriver driver;

    public AuthorizationForm() { driver = Driver.getDriver(); }

    public String getTitleAuthorizationText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_AUTHORIZATION)).getText();
    }

    public String getLabelLoginOrEmailText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LABEL_LOGIN_OR_EMAIL)).getText();
    }

    public void inputLoginOrEmail(String loginOrEmail) {
        driver.findElement(By.xpath(AuthorizationFormLocator.INPUT_LOGIN_OR_EMAIL)).sendKeys(loginOrEmail);
    }

    public String getLabelPasswordText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LABEL_PASSWORD)).getText();
    }

    public void inputPassword(String password) {
        driver.findElement(By.xpath(AuthorizationFormLocator.INPUT_PASSWORD)).sendKeys(password);
    }

    public String getLinkForgotPasswordText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LINK_FORGOT_PASSWORD)).getText();
    }

    public void clickLinkForgotPassword() {
        driver.findElement(By.xpath(AuthorizationFormLocator.LINK_FORGOT_PASSWORD)).click();
    }

    public String getButtonLoginText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.BUTTON_LOGIN)).getDomAttribute("value");
    }

    public String getButtonLoginCssValue() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.BUTTON_LOGIN)).getCssValue("text-transform");
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(AuthorizationFormLocator.BUTTON_LOGIN)).click();
    }

    public String getLabelLoginWithSocialNetworkText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LABEL_LOGIN_WITH_SOCIAL_NETWORK)).getText();
    }

    public String getLabelNoAccountText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LABEL_NO_ACCOUNT)).getText();
    }

    public String getLinkRegistrationText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.LINK_REGISTRATION)).getText();
    }

    public void clickLinkLinkRegistration() {
        driver.findElement(By.xpath(AuthorizationFormLocator.LINK_REGISTRATION)).click();
    }

    public String getErrorMessageInputPasswordText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.ERROR_MESSAGE_INPUT_PASSWORD)).getText();
    }

    public String getErrorMessageInputLoginOrEmailText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.ERROR_MESSAGE_INPUT_LOGIN_OR_EMAIL)).getText();
    }

    public String getErrorMessageLoginUserText() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.ERROR_MESSAGE_LOGIN)).getText();
    }
}
