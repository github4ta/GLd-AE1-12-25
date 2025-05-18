package kuleshov.rw.by;

import by.vek.driver.Driver;
import kuleshov.rw.by.pages.Header;
import kuleshov.rw.by.pages.AuthorizationForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizationFormTest {

    private final String HEADER_TITLE_TEXT = "Авторизация";
    private final String LOGIN_OR_EMAIL_FIELD_NAME_LABEL_TEXT = "Логин/E-mail";
    private final String LOGIN_OR_EMAIL_FIELD_ERROR_MESSAGE_TEXT = "Заполните поле";
    private final String PASSWORD_FIELD_NAME_LABEL_TEXT = "Пароль";
    private final String PASSWORD_FIELD_ERROR_MESSAGE_TEXT = "Заполните поле";
    private final String SUBMIT_BUTTON_TEXT = "ВОЙТИ";
    private final String FORGOT_PASSWORD_BUTTON_TEXT = "Забыли пароль?";
    private final String LOGIN_WITH_SOCIAL_TITLE_TEXT = "Войти с помощью соцсетей:";
    private final String FOOTER_TITLE_TEXT = "Нет аккаунта?";
    private final String REGISTRATION_BUTTON_TEXT = "Зарегистрироваться";
    private final String USER_NOT_EXISTED_ERROR_MESSAGE_TEXT = "Пользователь не найден";
    private final String INVALID_EMAIL_OR_PASSWORD_ERROR_MESSAGE_TEXT = "Неверное имя пользователя или пароль";

    private AuthorizationForm authorizationForm;

    @BeforeEach
    public void setup() throws InterruptedException {
        new BasePage().setup();
        authorizationForm = new Header().clickOwnCabinetButton();

        Wait<WebDriver> wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(d -> authorizationForm.getAuthorizationForm().isDisplayed());
    }

    @Test
    public void testLoginFormUIElementsText() {
        assertEquals(HEADER_TITLE_TEXT, authorizationForm.getTextHeaderTitle());
        assertEquals(LOGIN_OR_EMAIL_FIELD_NAME_LABEL_TEXT, authorizationForm.getTextLoginOrEmailFieldNameLabel());
        assertEquals(PASSWORD_FIELD_NAME_LABEL_TEXT, authorizationForm.getTextPasswordFieldNameLabel());
        assertEquals(SUBMIT_BUTTON_TEXT, authorizationForm.getTextSubmitButton());
        assertEquals(FORGOT_PASSWORD_BUTTON_TEXT, authorizationForm.getTextForgotPasswordButton());
        assertEquals(LOGIN_WITH_SOCIAL_TITLE_TEXT, authorizationForm.getTextLoginWithSocialTitle());
        assertTrue(authorizationForm.getTextFooterTitle().contains(FOOTER_TITLE_TEXT));
        assertEquals(REGISTRATION_BUTTON_TEXT, authorizationForm.getTextRegistrationButton());
    }

    @Test
    public void testEmptyPasswordFieldValidationText() {
        authorizationForm.sendKeysLoginOrEmailFieldInput("login");
        authorizationForm.clickSubmitButton();

        assertEquals(PASSWORD_FIELD_ERROR_MESSAGE_TEXT, authorizationForm.getTextPasswordFieldErrorMessage());
    }

    @Test
    public void testEmptyEmailFieldValidationText() {
        authorizationForm.sendKeysPasswordFieldInput("123456");
        authorizationForm.clickSubmitButton();

        assertEquals(LOGIN_OR_EMAIL_FIELD_ERROR_MESSAGE_TEXT, authorizationForm.getTextLoginOrEmailFieldErrorMessage());
    }

    @Test
    public void testEmptyEmailAndPasswordFieldsValidationText() {
        authorizationForm.clickSubmitButton();

        assertEquals(LOGIN_OR_EMAIL_FIELD_ERROR_MESSAGE_TEXT, authorizationForm.getTextLoginOrEmailFieldErrorMessage());
        assertEquals(PASSWORD_FIELD_ERROR_MESSAGE_TEXT, authorizationForm.getTextPasswordFieldErrorMessage());
    }

    @Test
    public void testUserNotExistedValidationText() {
        authorizationForm.sendKeysLoginOrEmailFieldInput("login");
        authorizationForm.sendKeysPasswordFieldInput("123456");
        authorizationForm.clickSubmitButton();

        assertEquals(USER_NOT_EXISTED_ERROR_MESSAGE_TEXT, authorizationForm.getTextErrorMessage());
    }

    @Test
    public void testInvalidLoginOrPasswordValidationText() {
        authorizationForm.sendKeysLoginOrEmailFieldInput("ivanov");
        authorizationForm.sendKeysPasswordFieldInput("1");
        authorizationForm.clickSubmitButton();

        assertEquals(INVALID_EMAIL_OR_PASSWORD_ERROR_MESSAGE_TEXT, authorizationForm.getTextErrorMessage());
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
