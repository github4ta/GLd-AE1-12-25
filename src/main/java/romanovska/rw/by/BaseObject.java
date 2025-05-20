package romanovska.rw.by;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseObject {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected BaseObject(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    protected abstract void open();

    public static WebElement getWebElementFoundByLocatorAfterWait(String locator) {
        WebElement webElement = driver.findElement(By.xpath(locator));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return webElement;
    }
}
