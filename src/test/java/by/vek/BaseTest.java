package by.vek;

import by.vek.driver.Driver;
import by.vek.pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public  void openHomePageAndCloseCookie() {
        BasePage bp = new BasePage();
        bp.open();
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
