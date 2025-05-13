package by.itacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlinerTest {

    @Test
    public void test1() {
        //открыть браузер
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //перейти на url сайта
        driver.get("https://www.onliner.by/");

        //принять куки
        String xpath = "//a[@id=\"submit-button\"]";
        WebElement submitButton = driver.findElement(By.xpath(xpath));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        xpath = "//a[@href='https://blog.onliner.by/about']";

        //кликнуть по ссылке "о компании"
        xpath = "//a[@href=\"https://blog.onliner.by/about\"]";
        WebElement aboutCompany = driver.findElement(By.xpath(xpath));
        aboutCompany.click();

        //проверить заголовок страницы "Информация о компании"
        xpath = "//h1[text()[contains(.,'Информация о компании')]]";
        WebElement aboutCompanyTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        String aboutCompanyTitleText = aboutCompanyTitle.getText();
        assertEquals("Информация о компании", aboutCompanyTitleText);

        //закрыть браузер

    }

    @Test
    public void test3() {
        // 1. Открыть браузер.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Ввести URL сайта.
        driver.get("https://www.onliner.by");

        // 3. Принять куки
        String xpath = "//a[@id='submit-button']";
        WebElement submitButton = driver.findElement(By.xpath(xpath));
        submitButton.click();

        // ожидания появления элемента "О компании"
        // Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        xpath = "//a[@href='https://blog.onliner.by/about']";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Ждем появления элемента и заново его находим
        WebElement aboutCompany = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        aboutCompany.click();

        // 4. Проверить заголовок "Информация о компании"
        xpath = "//h1[text()[contains(.,'Информация о компании')]]";

        // Ждем появления заголовка и заново его находим
        WebElement aboutCompanyTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        String aboutCompanyTitleText = aboutCompanyTitle.getText();

        assertEquals("Информация о компании", aboutCompanyTitleText);
        // 5. Закрыть браузер.
        driver.quit();
    }
}
