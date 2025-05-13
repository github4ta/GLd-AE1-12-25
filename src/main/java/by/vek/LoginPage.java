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
        WebElement submitButtonCookie = driver.findElement(By.xpath(LoginLocator.BUTTON_USER_ACCOUNT));
        submitButtonCookie.click();
    }

    public void clickRadioButtonChooseEmail() {
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(LoginLocator.RADIO_BUTTON_CHOOSE_EMAIL));
    }

    public String getErrorMessageEmailEmailInputText() {
        WebElement errorMessageEmailEmailInput = driver.findElement(By.xpath(LoginLocator.ERROR_MESSAGE_EMAIL_INPUT));

        return errorMessageEmailEmailInput.getText();
    }
}
