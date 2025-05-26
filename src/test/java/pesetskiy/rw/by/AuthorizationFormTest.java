package pesetskiy.rw.by;

import org.junit.jupiter.api.*;
import pesetskiy.rw.by.driver.Driver;
import pesetskiy.rw.by.pages.BasePage;
import pesetskiy.rw.by.pages.authorizationForm.AuthorizationFormPage;

public class AuthorizationFormTest {

    private AuthorizationFormPage authorizationFormPage;

    @BeforeEach
    public void setUp() {
        new BasePage().open();
        authorizationFormPage = new AuthorizationFormPage();
    }

    @Test
    @DisplayName("Check authorization form")
    public void testCheckAuthorizationForm() {
        Assertions.assertEquals("Авторизация", authorizationFormPage.getHeaderAuthorizationText());
        Assertions.assertEquals("Логин/E-mail", authorizationFormPage.getLabelLoginText());
        Assertions.assertEquals("Пароль", authorizationFormPage.getLabelPasswordText());
        Assertions.assertEquals("Войти", authorizationFormPage.getButtonLoginText());
        Assertions.assertEquals("Забыли пароль?", authorizationFormPage.getLinkForgotPasswordText());
        Assertions.assertEquals("Войти с помощью соцсетей:", authorizationFormPage.getLabelOtherLoginText());
        Assertions.assertTrue(authorizationFormPage.getLabelNoAccountText().contains("Нет аккаунта?"));
        Assertions.assertTrue(authorizationFormPage.getLinkRegistrationText().contains("Зарегистрироваться"));
    }

    @Test
    @DisplayName("Check authorization without password")
    public void checkAuthorizationWithoutPassword() {
        authorizationFormPage.inputFieldLogin("login");
        authorizationFormPage.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationFormPage.getLabelNoPasswordText());
    }

    @Test
    @DisplayName("Check authorization with empty fields")
    public void checkAuthorizationWithEmptyFields() {
        authorizationFormPage.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationFormPage.getLabelNoLoginText());
        Assertions.assertEquals("Заполните поле", authorizationFormPage.getLabelNoPasswordText());
    }

    @Test
    @DisplayName("Check authorization without login")
    public void checkAuthorizationWithoutLogin() {
        authorizationFormPage.inputFieldPassword("123456");
        authorizationFormPage.clickButtonLogin();
        Assertions.assertEquals("Заполните поле", authorizationFormPage.getLabelNoLoginText());
    }

    @Test
    @DisplayName("Check authorization for user not found")
    public void checkAuthorizationUserNotFound() {
        authorizationFormPage.inputFieldLogin("login");
        authorizationFormPage.inputFieldPassword("123456");
        authorizationFormPage.clickButtonLogin();
        Assertions.assertEquals("Пользователь не найден", authorizationFormPage.getLabelUserNotFoundText());
    }

    @Test
    @DisplayName("Check authorization for user invalid password")
    public void checkAuthorizationUserInvalidPassword() {
        authorizationFormPage.inputFieldLogin("ivanov.ivan@yopmail.com");
        authorizationFormPage.inputFieldPassword("123456");
        authorizationFormPage.clickButtonLogin();
        Assertions.assertEquals("Неверное имя пользователя или пароль", authorizationFormPage.getLabelIncorrectLoginOrPasswordText());
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
