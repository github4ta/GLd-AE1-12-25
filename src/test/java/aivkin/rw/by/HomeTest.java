package aivkin.rw.by;

import aivkin.rw.by.pages.home.HomePage;
import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class HomeTest {

    @BeforeEach
    public void openHomePageCloseModalWindowAndCookie() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
