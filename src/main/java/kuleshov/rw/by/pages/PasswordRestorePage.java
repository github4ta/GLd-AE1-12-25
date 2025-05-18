package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRestorePage {

    private final By pageTitle = By.xpath("//h1[@class=\"small\"]");
    private final By informationTextBlock = By.xpath("//div[@class=\"registration__desc\"]");
    private final By emailFieldNameLabel  = By.xpath("(//label[@class=\"form-label\"]//div[@class=\"name\"])[1]");
    private final By emailFieldInput = By.xpath("//input[@id=\"restore-email\"]");
    private final By restoreSubmitButton  = By.xpath("//button[@class=\"btn btn-index btn_submit\"]");

    protected WebDriver driver;

    public PasswordRestorePage() {
        driver = Driver.getDriver();
    }

    public String getTextPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public String getTextInformationTextBlock() {
        return driver.findElement(informationTextBlock).getText();
    }

    public String getTextEmailFieldNameLabel() {
        return driver.findElement(emailFieldNameLabel).getText();
    }

    public String getTextRestoreSubmitButton() {
        return driver.findElement(restoreSubmitButton).getText();
    }

    public void sendKeysEmailFieldInput(String emailValue) {
        driver.findElement(emailFieldInput).sendKeys(emailValue);
    }

    public void clickRestoreSubmitButton() {
        driver.findElement(restoreSubmitButton).click();
    }
}
