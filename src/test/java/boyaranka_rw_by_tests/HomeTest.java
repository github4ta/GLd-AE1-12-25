package boyaranka_rw_by_tests;

import boyaranka_rw_by.HomePage;
import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class HomeTest {

    @BeforeEach
    public void openHomePageAndCloseCheckboxAndCookie() {
        HomePage homePage = new HomePage();
        homePage.open();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}