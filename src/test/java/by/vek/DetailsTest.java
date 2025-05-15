package by.vek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetailsTest {
    private WebDriver driver;
    private DetailsPage detailsPage;
    private static Actions actions;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        actions = new Actions(driver);
        driver.get("https://www.21vek.by");

        detailsPage = new DetailsPage(driver);
        detailsPage.clickSubmitButtonCookie();
    }

    @Test
    public void testParagraphDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(detailsPage.getAnchorDetailsElement()));
        actions.scrollToElement(temp).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(temp));
        actions.scrollToElement(temp).moveToElement(temp).build().perform();
        temp.click();

        Assertions.assertEquals(detailsPage.getUrl(), driver.getCurrentUrl());

        Assertions.assertEquals("Реквизиты", detailsPage.getHeaderDetailsText());

        Assertions.assertEquals("Владелец магазина ООО «Триовист»\n" +
                "Свидетельство о регистрации № 190806803,\n" +
                "выдано 22.02.2007 года Минским городским исполнительным комитетом.\n" +
                "УНП № 190806803\n" +
                "Интернет-магазин зарегистрирован в Торговом реестре 23 июня 2010 г.\n" +
                "Адрес для почтовых отправлений: 220020, Минск, пр. Победителей, 100, оф. 203 E-mail: 21@21vek.by\n" +
                "Контактные телефоны: +375 29 3-021-021, +375 33 3-021-021", detailsPage.getParagraphDetailsText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
