package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class EquipmentRepairPage {
    private WebDriver driver;

    public EquipmentRepairPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(EquipmentRepairLocator.SUBMIT_BUTTON_COOKIE))).click();
    }

    public void goToEquipmentRepair() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By locator = By.xpath(EquipmentRepairLocator.BUTTON_EQUIPMENT_REPAIR);
        // Прокрутка до элемента
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
        // Ожидание кликабельности и клик
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

}