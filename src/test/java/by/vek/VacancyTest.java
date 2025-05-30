package by.vek;

import by.vek.pages.vacancy.VacancyPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VacancyTest {
    private WebDriver driver;
    private VacancyPage loginPage;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        loginPage = new VacancyPage(driver);
    }

    @Test
    public void testVekVacancies() {
        driver.get("https://www.21vek.by");
        loginPage.acceptCookies();
        loginPage.goToVacancies();
        loginPage.goToSubmitApplication();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
