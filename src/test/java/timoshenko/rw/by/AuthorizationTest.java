package timoshenko.rw.by;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timoshenko.rw.by.pages.authorization.AuthorizationPage;

public class AuthorizationTest extends BaseTest {
    private final String TITLE_AUTHORIZATION_TEXT = "Авторизация";
    private final String LABEL_LOGIN_TEXT = "Логин/E-mail";
    private final String LABEL_PASSWORD_TEXT = "Пароль";
    private final String BUTTON_LOGIN_TEXT = "Войти";
    private final String LINK_FORGOT_PASSWORD_TEXT = "Забыли пароль?";
    private final String COMMENT_LOGIN_SOCIAL_MEDIA_TEXT = "Войти с помощью соцсетей:";
    private final String COMMENT_NO_ACCOUNT_TEXT = "Нет аккаунта? Зарегистрироваться";
    private final String LINK_REGISTRATION_TEXT = "Зарегистрироваться";

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
}
