package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static by.vek.EquipmentRepairLocator.TEXT_1_EQUIPMENT_REPAIR_PAGE;
import static by.vek.EquipmentRepairLocator.TEXT_2_EQUIPMENT_REPAIR_PAGE;

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
        By locator = By.xpath(EquipmentRepairLocator.BUTTON_LINK_EQUIPMENT_REPAIR);

        // Ждем появления элемента
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        // Прокрутка до элемента
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));

        // Ждем, пока элемент станет кликабельным
        wait.until(ExpectedConditions.elementToBeClickable(locator));

        // Попытка кликнуть через JavaScript (если обычный не срабатывает)
        try {
            driver.findElement(locator).click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            // Если мешает другой элемент, попробуем через JS
            js.executeScript("arguments[0].click();", driver.findElement(locator));
        }
    }

    public String getEquipmentRepairPageText_1() {
        return driver.findElement(By.xpath(TEXT_1_EQUIPMENT_REPAIR_PAGE)).getText();
    }

    public String getEquipmentRepairPageText_2() {
        return driver.findElement(By.xpath(TEXT_2_EQUIPMENT_REPAIR_PAGE)).getText();
    }
}
