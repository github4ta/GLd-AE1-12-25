package by.vek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EquipmentRepairTest {
    private WebDriver driver;
    private EquipmentRepairPage loginPage;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        loginPage = new EquipmentRepairPage(driver);
    }

    @Test
    public void testVekVacancies() {
        driver.get("https://www.21vek.by");
        loginPage.acceptCookies();
        loginPage.goToEquipmentRepair();

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

