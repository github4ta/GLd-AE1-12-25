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
        authorizationFormPage.waitUntilAuthorizationFormIsDisplayed();
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

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
