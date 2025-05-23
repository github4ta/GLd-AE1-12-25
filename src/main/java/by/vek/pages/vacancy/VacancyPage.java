package by.vek.pages.vacancy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class VacancyPage {
    private WebDriver driver;

    public VacancyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(VacancyLocator.SUBMIT_BUTTON_COOKIE))).click();
    }

    public void goToVacancies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By locator = By.xpath(VacancyLocator.BUTTON_VACANCIES);
        // Прокрутка до элемента
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
        // Ожидание кликабельности и клик
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void goToSubmitApplication() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(VacancyLocator.BUTTON_SUBMIT_APPLICATION))).click();
    }
}