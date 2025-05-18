package timoshenko.rw.by;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timoshenko.rw.by.pages.authorization.AuthorizationPage;

public class AuthorizationTest extends BaseTest {
    public final static String TITLE_AUTHORIZATION_TEXT = "Авторизация";
    public final String LABEL_LOGIN_TEXT = "Логин/E-mail";
    public final String LABEL_PASSWORD_TEXT = "Пароль";
    public final String BUTTON_LOGIN_TEXT = "Войти";
    public final String LINK_FORGOT_PASSWORD_TEXT = "Забыли пароль?";
    public final String COMMENT_LOGIN_SOCIAL_MEDIA_TEXT = "Войти с помощью соцсетей:";
    public final String COMMENT_NO_ACCOUNT_TEXT = "Нет аккаунта? Зарегистрироваться";
    public final String LINK_REGISTRATION_TEXT = "Зарегистрироваться";
    public final String MESSAGE_ERROR_TEXT = "Заполните поле";
    public final String COMMENT_USER_NOT_FOUND_TEXT = "Пользователь не найден";
    private final String PASSWORD = "123456";
    private final String LOGIN = "login";

    protected AuthorizationPage authorizationPage;

    @BeforeEach
    public void setUp() {
        authorizationPage = new AuthorizationPage();
    }

    @Test
    public void checkAllTextAuthorizationPage() {
        Assertions.assertEquals(TITLE_AUTHORIZATION_TEXT, authorizationPage.getTitleAuthorizationText());
        Assertions.assertEquals(LABEL_LOGIN_TEXT, authorizationPage.getElementText("Логин/E-mail"));
        Assertions.assertEquals(LABEL_PASSWORD_TEXT, authorizationPage.getElementText("Пароль"));
        Assertions.assertEquals(BUTTON_LOGIN_TEXT, authorizationPage.getButtonLoginText());
        Assertions.assertEquals(LINK_FORGOT_PASSWORD_TEXT, authorizationPage.getLinkForgotPasswordText());
        Assertions.assertEquals(COMMENT_LOGIN_SOCIAL_MEDIA_TEXT, authorizationPage.getCommentText("social-title"));
        Assertions.assertEquals(COMMENT_NO_ACCOUNT_TEXT, authorizationPage.getCommentText("caption"));
        Assertions.assertEquals(LINK_REGISTRATION_TEXT, authorizationPage.getLinkRegistrationText());
    }

    @Test
    public void checkAuthorizationWithoutPassword() {
        authorizationPage.fillInput("login", LOGIN);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(MESSAGE_ERROR_TEXT, authorizationPage.getMessageError("password-error"));
    }

    @Test
    public void checkAuthorizationWithoutLoginAndPassword() {
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(MESSAGE_ERROR_TEXT, authorizationPage.getMessageError("password-error"));
        Assertions.assertEquals(MESSAGE_ERROR_TEXT, authorizationPage.getMessageError("login-error"));
    }

    @Test
    public void checkAuthorizationWithoutLogin() {
        authorizationPage.fillInput("password", PASSWORD);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(MESSAGE_ERROR_TEXT, authorizationPage.getMessageError("login-error"));
    }

    @Test
    public void checkAuthorizationWithLoginAndPassword() {
        authorizationPage.fillInput("password", PASSWORD);
        authorizationPage.fillInput("login", LOGIN);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(COMMENT_USER_NOT_FOUND_TEXT, authorizationPage.getCommentUserNotFound());
    }
}
