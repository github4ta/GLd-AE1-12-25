package by.vek;

import by.vek.pages.VacuumPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VacuumTest {

    private WebDriver driver;
    private VacuumPage vacuumPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.21vek.by");

        vacuumPage = new VacuumPage(driver);
        vacuumPage.clickSubmitButtonCookie();
        vacuumPage.clickCatalogCategory();
        vacuumPage.clickCategoryVacuum();

    }

    @Test
    public void testVacuumPage() {
        Assertions.assertEquals("Пылесосы", vacuumPage.getTitleVacuumText());
        Assertions.assertEquals("Щетки, насадки для пылесосов", vacuumPage.getVacuumAttachmentsText());
        Assertions.assertEquals("Расходные материалы для пылесосов", vacuumPage.getVacuumFiltersBagsText());
        Assertions.assertEquals("Принадлежности для пылесосов", vacuumPage.getVacuumAccessoriesText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
