package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorizationTest {
    private final String HEADER_TEXT_CORRECT = "Авторизация";
    private final String LOGIN_OR_EMAIL_FIELD_NAME_CORRECT = "Логин/E-mail";
    private final String PASSWORD_FIELD_NAME_CORRECT = "Пароль";
    private final String LOGIN_BUTTON_TEXT_CORRECT = "Войти";
    private final String FORGOT_PASSWORD_TEXT_CORRECT = "Забыли пароль?";
    private final String LOGIN_VIA_SOCIAL_TITLE_TEXT_CORRECT = "Войти с помощью соцсетей:";
    private final String NO_ACCOUNT_YET_CAPTION_TEXT_CORRECT = "Нет аккаунта?";
    private final String REGISTER_LINK_TEXT_CORRECT = "Зарегистрироваться";

    //может дописать NON_EXISTENT
    private final String LOGIN_OR_EMAIL_VALUE_CORRECT_1 = "login";
    private final String PASSWORD_VALUE_CORRECT = "123456";

    private final String LOGIN_ERROR_MESSAGE_TEXT_CORRECT = "Заполните поле";
    private final String PASSWORD_ERROR_MESSAGE_TEXT_CORRECT = "Заполните поле";
    private final String USER_NOT_FOUND_ERROR_MESSAGE_TEXT_CORRECT = "Пользователь не найден";

    @BeforeEach
    public void openAuthorizationModal() {
        TestUtils.openAuthorizationModal();
    }

    @Test
    public void testContent() {
        Assertions.assertEquals(HEADER_TEXT_CORRECT, AuthorizationModal.getHeaderText());
        Assertions.assertEquals(LOGIN_OR_EMAIL_FIELD_NAME_CORRECT, AuthorizationModal.getLoginOrEmailFieldNameText());
        Assertions.assertEquals(PASSWORD_FIELD_NAME_CORRECT, AuthorizationModal.getPasswordFieldNameText());
        Assertions.assertEquals(LOGIN_BUTTON_TEXT_CORRECT, AuthorizationModal.getLoginButtonText());
        Assertions.assertEquals(FORGOT_PASSWORD_TEXT_CORRECT, AuthorizationModal.getForgotPasswordLinkText());
        Assertions.assertEquals(LOGIN_VIA_SOCIAL_TITLE_TEXT_CORRECT, AuthorizationModal.getLoginViaSocialTitleText());
        Assertions.assertTrue(AuthorizationModal.getNoAccountYetCaptionText().contains(NO_ACCOUNT_YET_CAPTION_TEXT_CORRECT));
        Assertions.assertEquals(REGISTER_LINK_TEXT_CORRECT, AuthorizationModal.getRegisterLinkText());
    }

    @Test
    public void testTryLoginWithNonExistentCredentials() {
        AuthorizationModal.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        AuthorizationModal.fillPasswordField(PASSWORD_VALUE_CORRECT);
        AuthorizationModal.clickLoginButton();
        Assertions.assertEquals(USER_NOT_FOUND_ERROR_MESSAGE_TEXT_CORRECT, AuthorizationModal.getUserNotFoundErrorText());
    }

    @Test
    public void testTryLoginWithOnlyLoginOrEmailFieldFilled() {
        AuthorizationModal.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        AuthorizationModal.clickLoginButton();
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, AuthorizationModal.getPasswordErrorText());
    }

    @Test
    public void testTryLoginWithOnlyPasswordFieldFilled() {
        AuthorizationModal.fillPasswordField(PASSWORD_VALUE_CORRECT);
        AuthorizationModal.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, AuthorizationModal.getLoginOrEmailErrorText());
    }

    @Test
    public void testTryLoginWithNoFieldsFilled() {
        AuthorizationModal.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, AuthorizationModal.getLoginOrEmailErrorText());
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, AuthorizationModal.getPasswordErrorText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
