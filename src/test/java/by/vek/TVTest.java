package by.vek;

import by.vek.driver.Driver;
import by.vek.pages.BasePage;
import by.vek.pages.tv.TVPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TVTest {

    // private TVPage tvPage;

    @BeforeEach
    public void setup() {
        new BasePage().open();

/*        tvPage = new TVPage();
        tvPage.clickTVCategoryHeaderButton();*/
    }

    @Test
    @DisplayName("TV page - Verify title text")
    public void testTVPageTitleText() {
        TVPage tvPage = new TVPage();
        tvPage.clickTVCategoryHeaderButton();
        assertEquals("Телевизоры", tvPage.getTextTVPageTitle());
    }

    @Test
    @DisplayName("TV page - Verify titles text in content block")
    public void testTVPageCategoryContentTitleText() {
        TVPage tvPage = new TVPage();
        tvPage.clickTVCategoryHeaderButton();

        assertTrue(tvPage.isCategoryContentTitlesContainText("Особенности телевизоров"));
        assertTrue(tvPage.isCategoryContentTitlesContainText("Телевизор для дачи"));
        assertTrue(tvPage.isCategoryContentTitlesContainText("Какой телевизор купить в Минске?"));
    }

    @Test
    @DisplayName("TV page - Verify that all items contains category text in the name")
    public void testTVPageItemsNamesText() {
        TVPage tvPage = new TVPage();
        tvPage.clickTVCategoryHeaderButton();

        assertTrue(tvPage.areTVPageItemsContainText("Телевизор"));
    }

    @Test
    @DisplayName("TV page - Verify that all items contains selected brand text in the name")
    public void testTVPageManufacturerFilter() throws InterruptedException {
        TVPage tvPage = new TVPage();
        tvPage.clickTVCategoryHeaderButton();

        String brand = "Витязь";

        tvPage.clickShowAllBrandsButton();
        Thread.sleep(2000);
        tvPage.clickTVBrandFilter(brand);
        Thread.sleep(2000);

        assertTrue(tvPage.areTVPageItemsContainText(brand));
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
