package by.vek;

import by.vek.driver.Driver;
import by.vek.pages.BasePage;
import by.vek.pages.smartphone.SmartphonePage;
import org.junit.jupiter.api.*;

public class SmartphoneTest {

    private SmartphonePage smartphonePage;

    @BeforeEach
    public void setUp() {
        new BasePage().open();
        smartphonePage = new SmartphonePage();
        smartphonePage.clickSmartphoneLink();
    }

    @Test
    @DisplayName("Smartphone page - Verify text title")
    public void testVerifySmartphoneSectionTitle() {
        Assertions.assertEquals("Смартфоны", smartphonePage.getSmartphoneHeaderText());
    }

    @Test
    @DisplayName("Smartphone page - Verify text subtitle")
    public void testVerifySmartphoneSectionSubtitle() {
        Assertions.assertEquals("Какой телефон выбрать", smartphonePage.getSmartphoneChooseText());
        Assertions.assertEquals("Смартфон или мобильный телефон", smartphonePage.getSmartphoneOrMobileText());
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
