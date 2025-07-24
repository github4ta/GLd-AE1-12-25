package aivkin.rw.by;

import aivkin.rw.by.pages.home.authorizationform.AuthorizationForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorizationFormTest extends WithAuthorizationSetupTest {

    private AuthorizationForm authorizationForm;

    @BeforeEach
    public void setUp() {
        openAuthorizationForm();
        authorizationForm = new AuthorizationForm();
    }

    @Test
    public void checkTitlesLabelsButtonsLinksNames() {
        Assertions.assertEquals("Авторизация", authorizationForm.getTitleAuthorizationText());
        Assertions.assertEquals("Логин/E-mail", authorizationForm.getLabelLoginOrEmailText());
        Assertions.assertEquals("Пароль", authorizationForm.getLabelPasswordText());
        Assertions.assertEquals("Войти", authorizationForm.getButtonLoginText());
        Assertions.assertEquals("uppercase", authorizationForm.getButtonLoginCssValue());
        Assertions.assertEquals("Забыли пароль?", authorizationForm.getLinkForgotPasswordText());
        Assertions.assertEquals("Войти с помощью соцсетей:", authorizationForm.getLabelLoginWithSocialNetworkText());
        Assertions.assertTrue(authorizationForm.getLabelNoAccountText().contains("Нет аккаунта?"));
        Assertions.assertEquals("Зарегистрироваться", authorizationForm.getLinkRegistrationText());
    }

    @Test
    public void testInputLoginOrEmailAndClickButtonLogin() {
        authorizationForm.inputLoginOrEmail("login");
        authorizationForm.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationForm.getErrorMessageInputPasswordText());
    }

    @Test
    public void testEmptyInputAndClickButtonLogin() {
        authorizationForm.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationForm.getErrorMessageInputPasswordText());
        Assertions.assertEquals("Заполните поле", authorizationForm.getErrorMessageInputLoginOrEmailText());
    }

    @Test
    public void testInputPasswordAndClickButtonLogin() {
        authorizationForm.inputPassword("123456");
        authorizationForm.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationForm.getErrorMessageInputLoginOrEmailText());
    }

    @Test
    public void testInputUnregisteredUserLoginOrEmailAndPasswordAndClickButtonLogin() {
        authorizationForm.inputLoginOrEmail("login");
        authorizationForm.inputPassword("123456");
        authorizationForm.clickButtonLogin();
        Assertions.assertEquals("Пользователь не найден", authorizationForm.getErrorMessageLoginUserText());
    }

    @Test
    public void testInputWrongLoginOrEmailOrWrongPasswordAndClickButtonLogin() {
        authorizationForm.inputLoginOrEmail("ivanov");
        authorizationForm.inputPassword("1");
        authorizationForm.clickButtonLogin();
        Assertions.assertEquals("Пользователь не найден", authorizationForm.getErrorMessageLoginUserText());
    }
}
