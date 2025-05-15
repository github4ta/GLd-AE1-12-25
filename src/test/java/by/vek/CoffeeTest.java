package by.vek;

import by.vek.pages.coffee.CoffeePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CoffeeTest {
    private  WebDriver driver;
    private CoffeePage coffeePage;

    @BeforeEach
    public  void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.21vek.by");
        coffeePage = new CoffeePage(driver);
    }

    @Test
    public void verifyCoffeeSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = driver.findElement(By.linkText("Кофе"));
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();
        Assert.assertTrue(coffeePage.isCoffeeHeaderDisplayed());
        Assert.assertTrue(coffeePage.isCoffeeTypesDisplayed());
        Assert.assertTrue(coffeePage.isCoffeeSelectionDisplayed());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
