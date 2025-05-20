package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorizationTest {
    private HomePage homePage;
    private Header header;

    private final String HEADER_TEXT_CORRECT = "Авторизация";
    private final String LOGIN_OR_EMAIL_FIELD_NAME_CORRECT = "Логин/E-mail";
    private final String PASSWORD_FIELD_NAME_CORRECT = "Пароль";
    private final String LOGIN_BUTTON_TEXT_CORRECT = "Войти";
    private final String FORGOT_PASSWORD_TEXT_CORRECT = "Забыли пароль?";
    private final String LOGIN_VIA_SOCIAL_TITLE_TEXT_CORRECT = "Войти с помощью соцсетей:";
    private final String NO_ACCOUNT_YET_CAPTION_TEXT_CORRECT = "Нет аккаунта?";
    private final String REGISTER_LINK_TEXT_CORRECT = "Зарегистрироваться";

    private final String LOGIN_OR_EMAIL_VALUE_CORRECT_1 = "login";
    private final String PASSWORD_VALUE_CORRECT = "123456";

    private final String LOGIN_ERROR_MESSAGE_TEXT_CORRECT = "Заполните поле";
    private final String PASSWORD_ERROR_MESSAGE_TEXT_CORRECT = "Заполните поле";
    private final String USER_NOT_FOUND_ERROR_MESSAGE_TEXT_CORRECT = "Пользователь не найден";

    @BeforeEach
    public void openHomePage() {
        homePage = new HomePage();
        homePage.open();
        //homePage.clickProfile();

        header = new Header();
        header.openAuthorizationModal();
    }

    @Test
    public void testContent() {
        Assertions.assertEquals(HEADER_TEXT_CORRECT, header.getAuthorizationModalHeaderText());
        Assertions.assertEquals(LOGIN_OR_EMAIL_FIELD_NAME_CORRECT, header.getAuthorizationModalLoginOrEmailFieldNameText());
        Assertions.assertEquals(PASSWORD_FIELD_NAME_CORRECT, header.getAuthorizationModalPasswordFieldNameText());
        Assertions.assertEquals(LOGIN_BUTTON_TEXT_CORRECT, header.getAuthorizationModalLoginButtonText());
        Assertions.assertEquals(FORGOT_PASSWORD_TEXT_CORRECT, header.getAuthorizationModalForgotPasswordLinkText());
        Assertions.assertEquals(LOGIN_VIA_SOCIAL_TITLE_TEXT_CORRECT, header.getAuthorizationModalLoginViaSocialTitleText());
        Assertions.assertTrue(header.getAuthorizationModalNoAccountYetCaptionText().contains(NO_ACCOUNT_YET_CAPTION_TEXT_CORRECT));
        Assertions.assertEquals(REGISTER_LINK_TEXT_CORRECT, header.getAuthorizationModalRegisterLinkText());
    }

    @Test
    public void testTryLoginWithNonExistentCredentials() {
        header.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        header.fillPasswordField(PASSWORD_VALUE_CORRECT);
        header.clickLoginButton();
        Assertions.assertEquals(USER_NOT_FOUND_ERROR_MESSAGE_TEXT_CORRECT, header.getAuthorizationModalUserNotFoundErrorText());
    }

    @Test
    public void testTryLoginWithOnlyLoginOrEmailFieldFilled() {
        header.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        header.clickLoginButton();
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, header.getAuthorizationModalPasswordErrorText());
    }

    @Test
    public void testTryLoginWithOnlyPasswordFieldFilled() {
        header.fillPasswordField(PASSWORD_VALUE_CORRECT);
        header.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, header.getAuthorizationModalLoginOrEmailErrorText());
    }

    @Test
    public void testTryLoginWithNoFieldsFilled() {
        header.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, header.getAuthorizationModalLoginOrEmailErrorText());
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, header.getAuthorizationModalPasswordErrorText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
