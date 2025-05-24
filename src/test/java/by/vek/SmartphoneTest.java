package by.vek;

import by.vek.pages.smartphone.SmartphonePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SmartphoneTest {

    private WebDriver driver;
    private SmartphonePage smartphonePage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.get("https://www.21vek.by");

        smartphonePage = new SmartphonePage(driver);
        smartphonePage.clickButtonAcceptCookie();
        smartphonePage.clickSmartphoneLink();
    }

    @Test
    @DisplayName("Smartphone page - Verify text title")
    public void verifySmartphoneSectionTitle() {
        Assertions.assertEquals("Смартфоны", smartphonePage.getSmartphoneHeaderText());
    }

    @Test
    @DisplayName("Smartphone page - Verify text subtitle")
    public void verifySmartphoneSectionSubtitle() {
        Assertions.assertEquals("Какой телефон выбрать", smartphonePage.getSmartphoneChooseText());
        Assertions.assertEquals("Смартфон или мобильный телефон", smartphonePage.getSmartphoneOrMobileText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
