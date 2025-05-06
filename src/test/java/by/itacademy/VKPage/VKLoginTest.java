package by.itacademy.VKPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VKLoginTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Максимизируем окно браузера
    }

    @Test
    public void testLoginPageElements() {
        driver.get("https://vk.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            WebElement loginField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
            assertTrue(loginField.isDisplayed(), "Поле ввода логина не отображается");

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
            assertTrue(passwordField.isDisplayed(), "Поле ввода пароля не отображается");

            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Войти')]")));
            assertTrue(loginButton.isDisplayed(), "Кнопка 'Войти' не отображается");
        } catch (Exception e) {
            e.printStackTrace(); // Печатаем стек вызовов в случае ошибки
        }
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        if (driver != null) {
            driver.quit();
        }
    }
}