package evminova.rw.by;

import evminova.rw.by.driver.Driver;
import evminova.rw.by.pages.BasePage;
import evminova.rw.by.pages.homepage.HomePage;
import evminova.rw.by.pages.homepage.HomePageLocator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BasePage{
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        new BasePage().open();
        homePage = new HomePage();
    }

    @Test
    @DisplayName("Test modal Авторизация opens")
    public void testClickButtonCabinet() {
        homePage.clickButtonCabinet();

        boolean isAuthModalDisplayed = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(HomePageLocator.AUTH_MODAL_HEADER)
                )).isDisplayed();

        assertTrue(isAuthModalDisplayed, "Авторизация");
    }
}
