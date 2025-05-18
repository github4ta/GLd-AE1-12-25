package kuleshov.rw.by;

import by.vek.driver.Driver;
import kuleshov.rw.by.pages.Header;
import kuleshov.rw.by.pages.RegistrationPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationPageTest {

    private RegistrationPage registrationPage;

    @BeforeEach
    public void setup() {
        new BasePage().setup();
        registrationPage = new Header().clickOwnCabinetButton().clickRegistrationButton();
    }

    @Test
    public void VerifyRedirectToCorrectURL() {
        assertEquals("https://pass.rw.by/ru/registration/", Driver.getDriver().getCurrentUrl());
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
