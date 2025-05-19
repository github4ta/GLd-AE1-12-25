package evminova.rw.by.pages.registration;

import evminova.rw.by.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage() {
        driver = Driver.getDriver();
    }

    public String getTextFieldNameLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement fieldNameLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.FIELD_NAME_LOGIN)));
        return fieldNameLogin.getText();
    }

    public String getTextFieldNamePassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement fieldNamePassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.FIELD_NAME_PASSWORD)));
        return fieldNamePassword.getText();
    }

    public String getTextButtonSubmit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement textButtonSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.BUTTON_SUBMIT)));
        return textButtonSubmit.getText();
    }

    public String getLinkTitleRestore() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement linkTitleRestore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.LINK_REGISTRATION_RESTORE)));
        return linkTitleRestore.getText();
    }

    public String getTitleSocialList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleSocialList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.TITLE_SOCIAL_LIST)));
        return titleSocialList.getText();
    }

    public String getTitleNoAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleNoAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationLocators.TITLE_NO_ACCOUNT)));
        return titleNoAccount.getText();
    }

    public String enterFieldLogin(String login) {
        WebElement fieldLogin = driver.findElement(By.xpath(RegistrationLocators.INPUT_FIELD_LOGIN));
        fieldLogin.click();
        fieldLogin.sendKeys(login);

        WebElement buttonSubmit = driver.findElement(By.xpath(RegistrationLocators.BUTTON_SUBMIT));
        buttonSubmit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(RegistrationLocators.MESSAGE_PASSWORD_ERROR)));

        return errorMessage.getText();
    }
}
