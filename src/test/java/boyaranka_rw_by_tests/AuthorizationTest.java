package boyaranka_rw_by_tests;

import boyaranka_rw_by.pages.authorization.AuthorizationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorizationTest extends HomeTest {
    public final static String TITLE_AUTHORIZATION_TEXT = "Авторизация";
    public final String LABEL_LOGIN_TEXT = "Логин/E-mail";
    public final String LABEL_PASSWORD_TEXT = "Пароль";
    public final String BUTTON_LOGIN_TEXT = "Войти";
    public final String LINK_FORGOT_PASSWORD_TEXT = "Забыли пароль?";
    public final String COMMENT_LOGIN_SOCIAL_MEDIA_TEXT = "Войти с помощью соцсетей:";
    public final String COMMENT_NO_ACCOUNT_TEXT = "Нет аккаунта? Зарегистрироваться";
    public final String LINK_REGISTRATION_TEXT = "Зарегистрироваться";
    public final String MESSAGE_ERROR = "Заполните поле";
    public final String COMMENT_USER_NOT_FOUND_TEXT = "Пользователь не найден";
    public final String COMMENT_INCORRECT_LOGIN_OR_PASSWORD_TEXT = "Неверное имя пользователя или пароль";
    private final String PASSWORD = "789111";
    private final String LOGIN = "login";
    private final String LOGIN_EMAIL = "evaprigoghaeva@gmail.com";
    private final String INCORRECT_PASSWORD = "2";

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
        Assertions.assertEquals(MESSAGE_ERROR, authorizationPage.getMessageError("password-error"));
    }

    @Test
    public void checkAuthorizationWithoutLoginAndPassword() {
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(MESSAGE_ERROR, authorizationPage.getMessageError("password-error"));
        Assertions.assertEquals(MESSAGE_ERROR, authorizationPage.getMessageError("login-error"));
    }

    @Test
    public void checkAuthorizationWithoutLogin() {
        authorizationPage.fillInput("password", PASSWORD);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(MESSAGE_ERROR, authorizationPage.getMessageError("login-error"));
    }

    @Test
    public void checkAuthorizationWithLoginAndPassword() {
        authorizationPage.fillInput("password", PASSWORD);
        authorizationPage.fillInput("login", LOGIN);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(COMMENT_USER_NOT_FOUND_TEXT, authorizationPage.getCommentUserNotFound());
    }

    @Test
    public void checkCommentIncorrectLoginOrPasswordText() {
        authorizationPage.fillInput("password", INCORRECT_PASSWORD);
        authorizationPage.fillInput("login", LOGIN_EMAIL);
        authorizationPage.clickButtonLogin();
        Assertions.assertEquals(COMMENT_INCORRECT_LOGIN_OR_PASSWORD_TEXT, authorizationPage.getCommentIncorrectLoginOrPasswordText());
    }
}