package education.tilda;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TildaTest {

    private TildaPage page;

    @BeforeEach
    public void openHomePage() {
        page = new TildaPage();
        page.open();
    }

    @Test
    public void testMailToLinkText() {
        Assertions.assertEquals("team@tilda.ru", page.getMailToLinkText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
