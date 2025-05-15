package by.vek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EquipmentRepairTest {
    private WebDriver driver;
    private EquipmentRepairPage EquipmentRepairPage;
    private WebDriverWait wait;

    @Before
    public void Before() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by");

        EquipmentRepairPage = new EquipmentRepairPage(driver);
        EquipmentRepairPage.acceptCookies();
        EquipmentRepairPage.clikEquipmentRepair();
    }

    @Test
    public void testTitleEquipmentRepair() {
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Ремонт техники')]")));
        assert header.getText().contains("Ремонт техники");
    }

    @Test
    public void checkEquipmentRepairText_1() {
        String expectedText = "Наша компания предоставляет платные услуги по ремонту бытовой техники в г. Минске. Вы можете обращаться к нам, если поломка не относится к гарантийным случаям или срок гарантии на товар уже истёк.";
        String actualText = EquipmentRepairPage.getEquipmentRepairPageText_1();

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void checkEquipmentRepairText_2() {
        String expectedText = "Работы проводятся квалифицированными мастерами по установленным тарифам*.\n" +
                "Оформить заказ на платный ремонт, а также узнать все подробности о данной услуге можно по телефонам:\n" +
                "+375 (29) 397−02−87 (администратор);\n" +
                "+375 (44) 747−50−38.\n" +
                "При заказе просьба называть 2-часовой интервал, когда вы будете присутствовать в месте проведения работ.\n" +
                "\n" +
                "Оплата за расходные материалы рассчитывается отдельно.";
        String actualText = EquipmentRepairPage.getEquipmentRepairPageText_2();

        Assertions.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
