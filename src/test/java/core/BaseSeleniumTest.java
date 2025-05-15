package core;

import by.discount.DiscountPage;
import by.itacademy.LoginPage;
import by.itacademy.MainPage;
import by.discount.VekPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected VekPage vekPage;
    protected DiscountPage discountPage;

    private static final String SUBMIT_BUTTON_COOKIE_LOCATOR = "//button[@class='Button-module__button Button-module__blue-primary']";

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.21vek.by");
        driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE_LOCATOR)).click();
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        vekPage = new VekPage(driver);
        discountPage = new DiscountPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
