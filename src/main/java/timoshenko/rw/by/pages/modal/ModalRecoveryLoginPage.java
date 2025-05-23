package timoshenko.rw.by.pages.modal;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalRecoveryLoginPage {
    private WebDriver driver;

    public ModalRecoveryLoginPage() {
        driver = Driver.getDriver();
    }

    public String getTitleRecoveryModalText() {
        WebElement element = driver.findElement(By.xpath(ModalRecoveryLoginLocators.TITLE_RECOVERY_MODAL));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(d -> element.isDisplayed());
        return element.getText();
    }

    public String getCommentInfoText() {
        return driver.findElement(By.xpath(ModalRecoveryLoginLocators.COMMENT_INFO_TEXT)).getText();
    }

    public String getButtonCloseSubmitText() {
        return driver.findElement(By.xpath(ModalRecoveryLoginLocators.BUTTON_CLOSE_SUBMIT)).getText();
    }

    public void VisibilityButtonCloseSubmit() {
        driver.findElement(By.xpath(ModalRecoveryLoginLocators.BUTTON_CLOSE_SUBMIT)).isDisplayed();
    }

    public void VisibilityButtonClose() {
        driver.findElement(By.xpath(ModalRecoveryLoginLocators.BUTTON_CLOSE)).isDisplayed();
    }

    public void closeButtonSubmit() {
        driver.findElement(By.xpath(ModalRecoveryLoginLocators.BUTTON_CLOSE_SUBMIT)).click();
    }

    public void closeButton() {
        driver.findElement(By.xpath(ModalRecoveryLoginLocators.BUTTON_CLOSE)).click();
    }
}
