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

    public void clickButtonLogin(){
        WebElement submitButtonLogin = driver.findElement(By.xpath(BUTTON_LOGIN));
        submitButtonLogin.click();
    }

    public String getTextTitleLoginForm(){
        WebElement titleLoginForm = driver.findElement(By.xpath(TITLE_LOGIN_FORM));
        return titleLoginForm.getText();
    }
}
