package timoshenko.rw.by.pages.recovery;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryLoginPage {
    private WebDriver driver;

    public RecoveryLoginPage(){
        driver = Driver.getDriver();
    }

    public void clickLinkForgotPassword(){
        driver.findElement(By.xpath(RecoveryLoginLocators.LINK_FORGOT_PASSWORD)).click();
    }

    public String getTitleRecoveryLoginText(){
        return driver.findElement(By.xpath(RecoveryLoginLocators.TITLE_RECOVERY_PAGE)).getText();
    }

    public String getCommentInfoEmailText(){
        return driver.findElement(By.xpath(RecoveryLoginLocators.COMMENT_INFO_EMAIL)).getText();
    }

    public String getLabelEmailText(){
        return driver.findElement(By.xpath(RecoveryLoginLocators.LABEL_EMAIL)).getText();
    }

    public String getButtonRecoveryText(){
        return driver.findElement(By.xpath(RecoveryLoginLocators.BUTTON_RECOVERY)).getText();
    }
}
