package aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryLoginOrPasswordPage {
    private WebDriver driver;

    public RecoveryLoginOrPasswordPage() { driver = Driver.getDriver(); }

    public String getTitleRecoveryPageText() {
        return driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.TITLE_RECOVERY_PAGE)).getText();
    }

    public String getRecoveryInformationText() {
        return driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.RECOVERY_INFORMATION)).getText();
    }

    public String getLabelInputEmailText() {
        return driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.LABEL_INPUT_EMAIL)).getText();
    }

    public String getButtonRecoveryText() {
        return driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.BUTTON_RECOVERY)).getText();
    }

    public void clickButtonRecovery() {
        driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.BUTTON_RECOVERY)).click();
    }

    public String getRecoveryPageUrl() {
        return driver.getCurrentUrl();
    }

    public void inputEmail(String email) {
        driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.INPUT_EMAIL)).sendKeys(email);
    }

    public boolean isDisplayedModalWindowRecovery() {
        return driver.findElement(By.xpath(RecoveryLoginOrPasswordPageLocator.MODAL_WINDOW_RECOVERY)).isDisplayed();
    }
}
