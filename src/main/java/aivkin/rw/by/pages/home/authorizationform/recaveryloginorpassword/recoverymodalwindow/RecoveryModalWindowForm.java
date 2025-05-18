package aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.recoverymodalwindow;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryModalWindowForm {

    private WebDriver driver;

    public RecoveryModalWindowForm() { driver = Driver.getDriver(); }

    public String getTitleRecoveryFormText() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.TITLE_RECOVERY_FORM)).getText();
    }

    public String getTRecoveryFormInformationText() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.RECOVERY_FORM_INFORMATION)).getText();
    }

    public String getButtonCloseText() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CLOSE)).getText();
    }

    public boolean isButtonCloseDisplayed() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CLOSE)).isDisplayed();
    }

    public boolean isButtonCloseEnabled() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CLOSE)).isEnabled();
    }

    public boolean isButtonCrossDisplayed() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CROSS)).isDisplayed();
    }

    public boolean isButtonCrossEnabled() {
        return driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CROSS)).isEnabled();
    }

    public void clickButtonClose() {
        driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CLOSE)).click();
    }

    public void clickButtonCross() {
        driver.findElement(By.xpath(RecoveryModalWindowFormLocator.BUTTON_CROSS)).click();
    }
}
