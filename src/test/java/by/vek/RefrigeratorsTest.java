package by.vek;

import by.vek.pages.LoginPage;
import by.vek.pages.RefrigeratorsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RefrigeratorsTest {

    private WebDriver driver;
    private RefrigeratorsPage refrigeratorsPage;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.21vek.by");
        refrigeratorsPage = new RefrigeratorsPage(driver);
        refrigeratorsPage.clickSubmitButtonCookie();
        refrigeratorsPage.clickLinkRefrigerators();
    }

    @Test
    public void checkTitleRefrigeratorsText() {
        Assertions.assertEquals("Холодильники", refrigeratorsPage.getTitleRefrigeratorsPageText());
    }

    @Test
    public void checkAdditionGoodsLinkText() {
        Assertions.assertEquals("Морозильники", refrigeratorsPage.getLinkFreezersText());
        Assertions.assertEquals("Холодильники встраиваемые", refrigeratorsPage.getLinkBuiltinRefrigeratorsText());
        Assertions.assertEquals("Автохолодильники", refrigeratorsPage.getLinkBagsRefrigeratorsText());
        Assertions.assertEquals("Морозильные лари", refrigeratorsPage.getLinkFreezersLariText());
        Assertions.assertEquals("Магниты грифельные", refrigeratorsPage.getLinkSlateMagnetsText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
