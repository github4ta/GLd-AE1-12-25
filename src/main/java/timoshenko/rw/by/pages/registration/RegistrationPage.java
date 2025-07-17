package timoshenko.rw.by.pages.registration;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage() {
        driver = Driver.getDriver();
    }

    public String getTitleRegistrationText() {
        return driver.findElement(By.xpath(RegistrationLocators.TITLE_REGISTRATION)).getText();
    }

    public String getCommentCreateProfileText() {
        return driver.findElement(By.xpath(RegistrationLocators.COMMENT_CREATE_PROFILE)).getText();
    }

    public String getAllLabelCredentialText(String inputLocator) {
        return driver.findElement(By.xpath(String.format(RegistrationLocators.LABEL_CREDENTIAL, inputLocator))).getText();
    }

    public String getConfirmRegistrationText() {
        return driver.findElement(By.xpath(RegistrationLocators.COMMENT_CONFIRM_REGISTRATION)).getText();
    }

    public String getButtonRegistrationText() {
        return driver.findElement(By.xpath(RegistrationLocators.BUTTON_REGISTRATION)).getText();
    }

    public String getLinkRegistrationEnterText() {
        return driver.findElement(By.xpath(RegistrationLocators.LINK_REGISTRATION_ENTER)).getText();
    }

    public void clickLinkRegistrationEnter() {
        driver.findElement(By.xpath(RegistrationLocators.LINK_REGISTRATION_ENTER)).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getAttributeInLinkConfirmRegistration() {
        return driver.findElement(By.linkText("Правилами оформления и оплаты проезда")).getDomAttribute("href");
    }

    public void clickButtonRegistration() {
        driver.findElement(By.xpath(RegistrationLocators.BUTTON_REGISTRATION)).click();
    }

    public String getMessageCredentialErrorText(String inputLocator) {
        return driver.findElement(By.xpath(String.format(RegistrationLocators.MESSAGE_CREDENTIAL_ERROR, inputLocator))).getText();
    }

    public void inputCredentialRegistration(String inputLocator, String value) {
        driver.findElement(By.xpath(String.format(RegistrationLocators.INPUT_CREDENTIAL, inputLocator))).sendKeys(value);
    }
}
