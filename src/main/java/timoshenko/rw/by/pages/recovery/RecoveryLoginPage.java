package timoshenko.rw.by.pages.recovery;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecoveryLoginPage {
    private WebDriver driver;

    public RecoveryLoginPage() {
        driver = Driver.getDriver();
    }

    public String getTitleRecoveryLoginText() {
        return driver.findElement(By.xpath(RecoveryLoginLocators.TITLE_RECOVERY_PAGE)).getText();
    }

    public String getCommentInfoEmailText() {
        return driver.findElement(By.xpath(RecoveryLoginLocators.COMMENT_INFO_EMAIL)).getText();
    }

    public String getLabelEmailText() {
        return driver.findElement(By.xpath(RecoveryLoginLocators.LABEL_EMAIL)).getText();
    }

    public String getButtonRecoveryText() {
        return driver.findElement(By.xpath(RecoveryLoginLocators.BUTTON_RECOVERY)).getText();
    }

    public void inputEmail() {
        driver.findElement(By.xpath(RecoveryLoginLocators.INPUT_EMAIL)).sendKeys("q@q");
    }

    public void clickButtonRecovery() {
        WebElement element = driver.findElement(By.xpath(RecoveryLoginLocators.BUTTON_RECOVERY));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d -> element.isDisplayed());
        element.click();
    }

    public String getTitleRecoveryModalText() {
        WebElement element = driver.findElement(By.xpath(RecoveryLoginLocators.TITLE_RECOVERY_MODAL));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(d -> element.isDisplayed());
        return element.getText();
    }
}
