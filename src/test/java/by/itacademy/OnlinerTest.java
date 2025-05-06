package by.itacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlinerTest {
    @Test
    public void test1() {
        //открыть браузер
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //перейти на url сайта
        driver.get("https://www.onliner.by/");

        //принять куки
        String xpath = "//a[@id=\"submit-button\"]";
        WebElement submitButton = driver.findElement(By.xpath(xpath));
        submitButton.click();

        //кликнуть по ссылке "о компании"
        xpath = "//a[@href=\"https://blog.onliner.by/about\"]";
        WebElement aboutCompany = driver.findElement(By.xpath(xpath));
        aboutCompany.click();

        //проверить заголовок страницы "Информация о компании"
        xpath = "//h1[text()[contains(.,'Информация о компании')]]";
        WebElement aboutCompanyTitle = driver.findElement(By.xpath(xpath));
        String aboutCompanyTitleText = aboutCompanyTitle.getText();
        assertEquals("Информация о компании", aboutCompanyTitleText);

        //закрыть браузер

    }
}
