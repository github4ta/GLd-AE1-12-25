package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRestorePage {

    private final By PAGE_TITLE = By.xpath("//h1[@class=\"small\"]");
    private final By INFORMATION_TEXT_BLOCK = By.xpath("//div[@class=\"registration__desc\"]");
    private final By EMAIL_FIELD_NAME_LABEL = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[1]");
    private final By EMAIL_FIELD_INPUT = By.xpath("//input[@id=\"restore-email\"]");
    private final By RESTORE_SUBMIT_BUTTON = By.xpath("//button[@class=\"btn btn-index btn_submit\"]");

    protected WebDriver driver;

    public PasswordRestorePage() {
        driver = Driver.getDriver();
    }

    public String getTextPageTitle() {
        return driver.findElement(PAGE_TITLE).getText();
    }

    public String getTextInformationTextBlock() {
        return driver.findElement(INFORMATION_TEXT_BLOCK).getText();
    }

    public String getTextEmailFieldNameLabel() {
        return driver.findElement(EMAIL_FIELD_NAME_LABEL).getText();
    }

    public String getTextRestoreSubmitButton() {
        return driver.findElement(RESTORE_SUBMIT_BUTTON).getText();
    }

    public void sendKeysEmailFieldInput(String emailValue) {
        driver.findElement(EMAIL_FIELD_INPUT).sendKeys(emailValue);
    }

    public void clickRestoreSubmitButton() {
        driver.findElement(RESTORE_SUBMIT_BUTTON).click();
    }
}
