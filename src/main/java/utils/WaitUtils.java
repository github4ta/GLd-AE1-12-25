package utils;

import browser.Browser;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public static void waitForElements(ExpectedCondition<Boolean> condition) {
        try {
            new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(10)).until(condition);
        } catch (Exception e) {
        }
    }
}
