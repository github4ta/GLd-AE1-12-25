package kuleshov.rw.by;

import by.vek.driver.Driver;
import kuleshov.rw.by.pages.Header;
import kuleshov.rw.by.pages.PasswordRestoreModalWindow;
import kuleshov.rw.by.pages.PasswordRestorePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordRestorePageTest {

    private final String PAGE_TITLE_TEXT = "Восстановление логина или пароля";
    private final String INFORMATION_BLOCK_TEXT = "Введите адрес электронной почты, который был указан при регистрации. " +
            "На него будет выслан Ваш логин и новый пароль.";
    private final String EMAIL_FIELD_NAME_LABEL_TEXT = "E-mail";
    private final String RESTORE_SUBMIT_BUTTON_TEXT = "ВОССТАНОВИТЬ";
    private final String TEST_EMAIL_VALUE = "q@q";

    private PasswordRestorePage passwordRestorePage;

    @BeforeEach
    public void setup() {
        new BasePage().openHomePage();
        passwordRestorePage = new Header().clickOwnCabinetButton().clickForgotPasswordButton();
    }

    @Test
    public void testVerifyRedirectToCorrectURL() {
        assertEquals("https://pass.rw.by/ru/registration/pwd_restore/", Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testPasswordRestoreUIElementsText() {
        assertAll(
                () -> assertEquals(PAGE_TITLE_TEXT, passwordRestorePage.getTextPageTitle()),
                () -> assertEquals(INFORMATION_BLOCK_TEXT, passwordRestorePage.getTextInformationTextBlock()),
                () -> assertEquals(EMAIL_FIELD_NAME_LABEL_TEXT, passwordRestorePage.getTextEmailFieldNameLabel()),
                () -> assertEquals(RESTORE_SUBMIT_BUTTON_TEXT, passwordRestorePage.getTextRestoreSubmitButton())
        );
    }

    @Test
    public void testVerifyPasswordRestoreModalWindowIsDisplayed() {
        passwordRestorePage.sendKeysEmailFieldInput(TEST_EMAIL_VALUE);
        passwordRestorePage.clickRestoreSubmitButton();

        PasswordRestoreModalWindow passwordRestoreModalWindow = new PasswordRestoreModalWindow();
        passwordRestoreModalWindow.waitUntilPasswordRestoreModalWindowIsDisplayed();

        assertTrue(passwordRestoreModalWindow.isPasswordRestoreModalWindowDisplayed());
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
