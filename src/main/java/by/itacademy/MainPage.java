package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private static final String BUTTON_USER_ACCOUNT_LOCATOR = "//button[@class='styles_userToolsToggler__c2aHe']";
    private static final String BUTTON_LOGIN_LOCATOR = "//button[@data-testid='loginButton']";


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void enterAccountButton(){
        WebElement accountButton = driver.findElement(By.xpath(BUTTON_USER_ACCOUNT_LOCATOR));
        accountButton.click();
    }

    public void enterLoginButton(){
        WebElement loginButton = driver.findElement(By.xpath(BUTTON_LOGIN_LOCATOR));
        loginButton.click();
    }
}
