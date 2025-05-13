package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonCookie(){
        WebElement submitButtonCookie = driver.findElement(By.xpath(LoginLocator.SUBMIT_BUTTON_COOKIE));
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
}
