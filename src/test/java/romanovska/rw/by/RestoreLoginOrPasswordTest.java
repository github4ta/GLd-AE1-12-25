package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import romanovska.rw.by.pages.RestoreLoginOrPasswordPage;

public class RestoreLoginOrPasswordTest {
    private final String HEADER_TEXT_CORRECT = "Восстановление логина или пароля";

    @BeforeEach
    public void openRestoreLoginOrPasswordPage() {
        TestUtils.openRestoreLoginOrPasswordPage();
    }

    @Test
    public void testContent() {
        Assertions.assertEquals(HEADER_TEXT_CORRECT, RestoreLoginOrPasswordPage.getHeaderText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
