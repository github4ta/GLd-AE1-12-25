package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String BUTTON_LOGIN_SUBMIT_LOCATOR = "//button[@data-testid='loginSubmit']";
    private static final String COMMENT_LOCATOR = "//*[@id='login-%s']/parent::div/parent::div//span[@class='ErrorMessage-module__message']";
    private static final String FIELD_LOCATOR = "//input[@id='login-%s']";
    private static final String LINK_BUTTON_REGISTRATION_LOCATOR = "//span[@class='ErrorMessage-module__message']//a[contains(@class,'LinkButton-module__wrapper')]";
    private static final String TITLE_REGISTRATION_LOCATOR = "//h5[@class='Form-module__formTitle']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterSubmitLoginButton() {
        WebElement submitLoginButton = driver.findElement(By.xpath(BUTTON_LOGIN_SUBMIT_LOCATOR));
        submitLoginButton.click();
    }

    public void enterField(String credInfo, String locatorField) {
        WebElement fieldAddEmail = driver.findElement(By.xpath(String.format(FIELD_LOCATOR, locatorField)));
        fieldAddEmail.click();
        fieldAddEmail.sendKeys(credInfo);
    }

    public void enterLinkButtonRegistration() {
        WebElement linkButtonRegistration = driver.findElement(By.xpath(LINK_BUTTON_REGISTRATION_LOCATOR));
        linkButtonRegistration.click();
    }

    public String getComment(String locatorComment) {
        WebElement comment = driver.findElement(By.xpath(String.format(COMMENT_LOCATOR, locatorComment)));
        return comment.getText();
    }

    public String getTitleRegistration() {
        WebElement titleRegistration = driver.findElement(By.xpath(TITLE_REGISTRATION_LOCATOR));
        return titleRegistration.getText();
    }
}

