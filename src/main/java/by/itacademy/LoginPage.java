package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String BUTTON_LOGIN_SUBMIT_LOCATOR = "//button[@data-testid='loginSubmit']";
    private static final String COMMENT_EMAIL_LOCATOR = "//*[@id='login-email']/parent::div/parent::div//span[@class='ErrorMessage-module__message']";
    private static final String COMMENT_PASSWORD_LOCATOR = "//*[@id='login-password']/parent::div/parent::div//span[@class='ErrorMessage-module__message']";
    private static final String FIELD_ADD_EMAIL_LOCATOR = "//input[@id='login-email']";
    private static final String FIELD_ADD_PASSWORD_LOCATOR = "//input[@id='login-password']";
    private static final String LINK_BUTTON_REGISTRATION_LOCATOR = "//span[@class='ErrorMessage-module__message']//a[contains(@class,\"LinkButton-module__wrapper\")]";
    private static final String TITLE_REGISTRATION_LOCATOR = "//h5[@class=\"Form-module__formTitle\"]";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterSubmitLoginButton(){
        WebElement submitLoginButton = driver.findElement(By.xpath(BUTTON_LOGIN_SUBMIT_LOCATOR));
        submitLoginButton.click();
    }

    public void enterFieldAddEmail(){
        WebElement fieldAddEmail = driver.findElement(By.xpath(FIELD_ADD_EMAIL_LOCATOR));
        fieldAddEmail.click();
        fieldAddEmail.sendKeys("test@test.xyz");
    }

    public void enterFieldAddPassword(){
        WebElement fieldAddPassword = driver.findElement(By.xpath(FIELD_ADD_PASSWORD_LOCATOR));
        fieldAddPassword.click();
        fieldAddPassword.sendKeys("qwerty123456");
    }

    public void enterLinkButtonRegistration(){
        WebElement linkButtonRegistration = driver.findElement(By.xpath(LINK_BUTTON_REGISTRATION_LOCATOR));
        linkButtonRegistration.click();
    }

    public String getCommentEmail(){
        WebElement commentEmail = driver.findElement(By.xpath(COMMENT_EMAIL_LOCATOR));
        return commentEmail.getText();
    }

    public String getCommentPassword(){
        WebElement commentPassword = driver.findElement(By.xpath(COMMENT_PASSWORD_LOCATOR));
        return commentPassword.getText();
    }

    public String getTitleRegistration(){
        WebElement titleRegistration = driver.findElement(By.xpath(TITLE_REGISTRATION_LOCATOR));
        return titleRegistration.getText();
    }
}
