package kuleshov.rw.by;

import by.vek.driver.Driver;
import by.vek.driver.Waits;
import kuleshov.rw.by.pages.Header;
import kuleshov.rw.by.pages.PasswordRestoreModalWindow;
import kuleshov.rw.by.pages.PasswordRestorePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordRestoreModalWindowTest {

    private final String TEST_EMAIL_VALUE = "q@q";
    private final String MODAL_WINDOW_TITLE_TEXT = "Восстановление логина или пароля";
    private final String MODAL_WINDOW_INFORMATION_BLOCK_TEXT = "Не удалось найти пользователя, зарегистрированного с " +
            "помощью логина или электронной почты: " + TEST_EMAIL_VALUE;
    private final String MODAL_WINDOW_CLOSE_BUTTON_TEXT = "ЗАКРЫТЬ";

    private PasswordRestorePage passwordRestorePage;
    private PasswordRestoreModalWindow passwordRestoreModalWindow;

    @BeforeEach
    public void setup() {
        new BasePage().openHomePage();
        passwordRestorePage = new Header().clickOwnCabinetButton().clickForgotPasswordButton();
        passwordRestorePage.sendKeysEmailFieldInput(TEST_EMAIL_VALUE);
        passwordRestorePage.clickRestoreSubmitButton();
        passwordRestoreModalWindow = new PasswordRestoreModalWindow();
        passwordRestoreModalWindow.waitUntilPasswordRestoreModalWindowIsDisplayed();
    }

    @Test
    public void testPasswordRestoreModalWindowUIElementsText() {
        assertAll(
                () -> assertEquals(MODAL_WINDOW_TITLE_TEXT, passwordRestoreModalWindow.getTextRestorePasswordModalWindowTitle()),
                () -> assertEquals(MODAL_WINDOW_INFORMATION_BLOCK_TEXT, passwordRestoreModalWindow.getTextInformationTextBlock()),
                () -> assertEquals(MODAL_WINDOW_CLOSE_BUTTON_TEXT, passwordRestoreModalWindow.getTextCloseButton())
        );
    }

    @Test
    public void testCloseHederButtonIsDisplayedAndActive() {
        assertTrue(passwordRestoreModalWindow.isCloseHeaderButtonDisplayed());
        assertTrue(passwordRestoreModalWindow.isCloseHeaderButtonActive());
    }

    @Test
    public void testCloseButtonIsDisplayedAndActive() {
        assertTrue(passwordRestoreModalWindow.isCloseButtonDisplayed());
        assertTrue(passwordRestoreModalWindow.isCloseButtonActive());
    }

    @Test
    public void testClickCloseHederButton() {
        passwordRestoreModalWindow.clickCloseHeaderButton();
        Waits.waitOfSeconds(5);

        assertFalse(passwordRestoreModalWindow.isPasswordRestoreModalWindowDisplayed());
    }

    @Test
    public void testClickCloseButton() {
        passwordRestoreModalWindow.clickCloseButton();
        Waits.waitOfSeconds(5);

        assertFalse(passwordRestoreModalWindow.isPasswordRestoreModalWindowDisplayed());
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
