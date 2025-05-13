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

    public String getTextTitleRegistration() {
        WebElement titleRegistration = driver.findElement(By.xpath(LoginLocator.TITLE_REGISTRATION));
        return titleRegistration.getText();
    }

    public void clickButtonContinue() {
        WebElement buttonContinue = driver.findElement(By.xpath(LoginLocator.BUTTON_CONTINUE));
        buttonContinue.click();
    }
}
