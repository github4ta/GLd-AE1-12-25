package romanovska.rw.by;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected String URL;
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePage() {
        this.driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    public void open() {
        driver.get(URL);
    }

    public WebElement getWebElementFoundByLocatorAfterWait(String locator) {
        WebElement webElement = driver.findElement(By.xpath(locator));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }
}
