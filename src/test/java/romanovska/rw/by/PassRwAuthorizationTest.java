package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassRwAuthorizationTest {
    private PassRwHomePage page;

    private final String AUTHORIZATION_MODAL_HEADER_TEXT_CORRECT = "Авторизация";

    @BeforeEach
    public void openHomePage() {
        page = new PassRwHomePage();
        page.open();
    }

    @Test
    public void testAuthorizationForm() {
        page.clickProfile();

        Assertions.assertEquals(AUTHORIZATION_MODAL_HEADER_TEXT_CORRECT, page.getAuthorizationModalHeaderText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
