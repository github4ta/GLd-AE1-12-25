package by.itacademy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VekTest {
    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.21vek.by");

        String submitButtonCookieLocator = "//div[@class=\"Button-module__buttonText\"]";
        WebElement submitButtonCookie = driver.findElement(By.xpath(submitButtonCookieLocator));
        submitButtonCookie.click();

        String linAllActionsLocator = "//a[@href=\"/special_offers/promo.html\"]";
        WebElement linkAllActions = driver.findElement(By.xpath(linAllActionsLocator));
        linkAllActions.click();

        String allActionsTitleLocator = "//h1[@class=\"style_title__c0jN1 Title-module__title Title-module__h1\"]";
        WebElement allActionsTitle = driver.findElement(By.xpath(allActionsTitleLocator));
        String actual = allActionsTitle.getText() ;

        Assert.assertEquals("Все акции", actual);

        driver.quit();
    }
}
