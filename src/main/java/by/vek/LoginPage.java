package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitButtonCookie() {
        WebElement submitButtonCookie = driver.findElement(By.xpath(LoginLocator.SUBMIT_BUTTON_COOKIE));
        submitButtonCookie.click();
    }

    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath(LoginLocator.SUBMIT_BUTTON));
        submitButton.click();
    }

    public void setEmail(String email) {
        WebElement inputEmailField = driver.findElement(By.xpath(LoginLocator.INPUT_EMAIL_FIELD));
        inputEmailField.sendKeys(email);
    }

    public String getErrorMessagePasswordInputText() {
        WebElement getErrorMessagePasswordInputText = driver.findElement(By.xpath(LoginLocator.ERROR_MESSAGE_PASSWORD_INPUT));
        return getErrorMessagePasswordInputText.getText();
    }
}
