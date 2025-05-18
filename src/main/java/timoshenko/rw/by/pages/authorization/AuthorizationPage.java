package timoshenko.rw.by.pages.authorization;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage {
    private WebDriver driver;

    public AuthorizationPage() {
        driver = Driver.getDriver();
    }

    public String getElementText(String input) {
        return driver.findElement(By.xpath(String.format(AuthorizationLocators.LABEL_INPUT, input))).getText();
    }

    public String getCommentText(String comment) {
        return driver.findElement(By.xpath(String.format(AuthorizationLocators.COMMENT_OTHER_LOGIN, comment))).getText();
    }

    public String getTitleAuthorizationText() {
        WebElement element = driver.findElement(By.xpath(AuthorizationLocators.TITLE_AUTHORIZATION));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d -> element.isDisplayed());
        return element.getText();
    }

    public String getButtonLoginText() {
        WebElement element = driver.findElement(By.xpath(AuthorizationLocators.BUTTON_LOGIN));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> element.isDisplayed());
        return element.getDomAttribute("value");
    }

    public String getLinkForgotPasswordText() {
        return driver.findElement(By.xpath(AuthorizationLocators.LINK_FORGOT_PASSWORD)).getText();
    }

    public String getLinkRegistrationText() {
        return driver.findElement(By.xpath(AuthorizationLocators.LINK_REGISTRATION)).getText();
    }

    public void fillInput(String inputLocator, String value) {
        driver.findElement(By.xpath(String.format(AuthorizationLocators.INPUT_CREDENTIALS, inputLocator))).sendKeys(value);
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(AuthorizationLocators.BUTTON_LOGIN)).click();
    }

    public String getMessageError(String message) {
        return driver.findElement(By.xpath(String.format(AuthorizationLocators.MESSAGE_CREDENTIALS_ERROR, message))).getText();
    }

    public String getCommentUserNotFound() {
        return driver.findElement(By.xpath(AuthorizationLocators.COMMENT_USER_NOT_FOUND)).getText();
    }

    public void clickLinkForgotPassword() {
        driver.findElement(By.xpath(AuthorizationLocators.LINK_FORGOT_PASSWORD)).click();
    }

    public void clickLinkRegistration() {
        driver.findElement(By.xpath(AuthorizationLocators.LINK_REGISTRATION)).click();
    }
}
