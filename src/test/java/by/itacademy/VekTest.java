package by.itacademy;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VekTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.21vek.by");

        String submitButtonCookieLocator = "//div[@class=\"Button-module__buttonText\"]";
        String submitButtonCookieLocator = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";
        WebElement submitButtonCookie = driver.findElement(By.xpath(submitButtonCookieLocator));
        submitButtonCookie.click();
    }

    @Test
    public void test1() {
        String linAllActionsLocator = "//a[@href=\"/special_offers/promo.html\"]";
        WebElement linkAllActions = driver.findElement(By.xpath(linAllActionsLocator));
        linkAllActions.click();

        String allActionsTitleLocator = "//h1[@class=\"style_title__c0jN1 Title-module__title Title-module__h1\"]";
        WebElement allActionsTitle = driver.findElement(By.xpath(allActionsTitleLocator));
        String actual = allActionsTitle.getText();

        Assert.assertEquals("Все акции", actual);
    }

    @Test
    public void test2() {
        String legalInformationBlockLocator = "//div[@class=\"styles_legalInformationBlock__iXOVK\"]";
        WebElement legalInformationBlock = driver.findElement(By.xpath(legalInformationBlockLocator));
        String actual = legalInformationBlock.getText();

        Assert.assertTrue(actual.contains("© 2004–2025 21vek.by,"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
