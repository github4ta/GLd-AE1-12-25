package by.vek;

import by.vek.pages.LoginPage;
import by.vek.pages.TVPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TVTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private TVPage tvPage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by");

        loginPage = new LoginPage(driver);
        loginPage.clickSubmitButtonCookie();

        tvPage = new TVPage(driver);
        tvPage.clickTVCategoryHeaderButton();
    }

    @Test
    @DisplayName("TV page - Verify title text")
    public void testTVPageTitleText() {

        assertEquals("Телевизоры", tvPage.getTextTVPageTitle());
    }

    @Test
    @DisplayName("TV page - Verify titles text in content block")
    public void testTVPageCategoryContentTitleText() {

        assertTrue(tvPage.isCategoryContentTitlesContainText("Особенности телевизоров"));
        assertTrue(tvPage.isCategoryContentTitlesContainText("Телевизор для дачи"));
        assertTrue(tvPage.isCategoryContentTitlesContainText("Какой телевизор купить в Минске?"));
    }

    @Test
    @DisplayName("TV page - Verify that all items contains category text in the name")
    public void testTVPageItemsNamesText() {

        assertTrue(tvPage.areTVPageItemsContainText("Телевизор"));
    }

    @Test
    @DisplayName("TV page - Verify that all items contains selected brand text in the name")
    public void testTVPageManufacturerFilter() throws InterruptedException {
        String brand = "Витязь";

        tvPage.clickShowAllBrandsButton();
        Thread.sleep(2000);
        tvPage.clickTVBrandFilter(brand);
        Thread.sleep(2000);

        assertTrue(tvPage.areTVPageItemsContainText(brand));
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}
