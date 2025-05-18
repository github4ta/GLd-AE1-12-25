package evminova.rw.by.pages.registration;

import evminova.rw.by.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage() {
        driver = Driver.getDriver();
    }

    public String getTextFieldNameLogin() {
        return driver.findElement(By.xpath(RegistrationLocators.FIELD_NAME_LOGIN)).getText();
    }

    public String getTextFieldNamePassword() {
        return driver.findElement(By.xpath(RegistrationLocators.FIELD_NAME_PASSWORD)).getText();
    }

    public String getTextButtonSubmit() {
        return driver.findElement(By.xpath(RegistrationLocators.BUTTON_SUBMIT)).getText();
    }

    public String getLinkTitleRestore() {
        return driver.findElement(By.xpath(RegistrationLocators.LINK_REGISTRATION_RESTORE)).getText();
    }

    public String getTitleSocialList() {
        return driver.findElement(By.xpath(RegistrationLocators.TITLE_SOCIAL_LIST)).getText();
    }

    public String getTitleNoAccount() {
        return driver.findElement(By.xpath(RegistrationLocators.TITLE_NO_ACCOUNT)).getText();
    }
}
