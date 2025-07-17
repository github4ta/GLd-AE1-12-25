package timoshenko.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void openHomePageAndCloseCheckboxAndCookie() {
        BasePage basePage = new BasePage();
        basePage.open();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
