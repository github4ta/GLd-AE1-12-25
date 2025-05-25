package pesetskiy.rw.by.pages.authorizationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pesetskiy.rw.by.driver.Driver;

import java.time.Duration;

public class AuthorizationFormPage {

    private final WebDriver driver;

    public AuthorizationFormPage() {
        driver = Driver.getDriver();
    }

    public WebElement getAuthorizationForm() {
        return driver.findElement(By.xpath(AuthorizationFormLocator.AUTHORIZATION_MODAL_WINDOW));
    }

    public void waitUntilAuthorizationFormIsDisplayed() {
        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(d -> getAuthorizationForm().isDisplayed());
    }

    public String getHeaderAuthorizationText() {
        WebElement headerAuthorizationText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_HEADER_AUTHORIZATION));
        return headerAuthorizationText.getText();
    }

    public String getLabelLoginText() {
        WebElement labelLoginText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_LOGIN));
        return labelLoginText.getText();
    }

    public String getLabelPasswordText() {
        WebElement labelPasswordText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_PASSWORD));
        return labelPasswordText.getText();
    }

    public String getButtonLoginText() {
        WebElement buttonLoginText = driver.findElement(By.xpath(AuthorizationFormLocator.BUTTON_LOGIN));
        return buttonLoginText.getAttribute("value");
    }

    public String getLinkForgotPasswordText() {
        WebElement linkForgotPasswordText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LINK_FORGOT_PASSWORD));
        return linkForgotPasswordText.getText();
    }

    public String getLabelOtherLoginText() {
        WebElement labelOtherLoginText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_OTHER_LOGIN));
        return labelOtherLoginText.getText();
    }

    public String getLabelNoAccountText() {
        WebElement labelNoAccountText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_NO_ACCOUNT));
        return labelNoAccountText.getText();
    }

    public String getLinkRegistrationText() {
        WebElement linkRegistrationText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LINK_REGISTRATION));
        return linkRegistrationText.getText();
    }

    public String getLabelNoLoginText() {
        WebElement labelNoLoginText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_NO_LOGIN));
        return labelNoLoginText.getText();
    }

    public String getLabelNoPasswordText() {
        WebElement labelNoPasswordText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_NO_PASSWORD));
        return labelNoPasswordText.getText();
    }

    public String getLabelUserNotFoundText() {
        WebElement labelUserNotFoundText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_USER_NOT_FOUND));
        return labelUserNotFoundText.getText();
    }

    public String getLabelIncorrectLoginOrPasswordText() {
        WebElement labelIncorrectLoginOrPasswordText = driver.findElement(By.xpath(AuthorizationFormLocator.TITLE_LABEL_INCORRECT_LOGIN_OR_PASSWORD));
        return labelIncorrectLoginOrPasswordText.getText();
    }
}
