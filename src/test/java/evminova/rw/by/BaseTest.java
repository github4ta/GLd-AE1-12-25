package evminova.rw.by;

import evminova.rw.by.driver.Driver;
import evminova.rw.by.pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void openHomePageAndCloseModalAndSubmitCookies() {
        BasePage bp = new BasePage();
        bp.open();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
