package evminova.rw.by;

import evminova.rw.by.driver.Driver;
import evminova.rw.by.pages.homepage.HomePage;
import evminova.rw.by.pages.registration.RegistrationPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest {
    private RegistrationPage registrationPage;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickButtonCabinet();
        registrationPage = new RegistrationPage();
    }

    @Test
    @DisplayName("текст подписи поля Логин/E-mail")
    public void testFieldNameLogin() {
        assertEquals("Логин/E-mail", registrationPage.getTextFieldNameLogin());
    }

    @Test
    @DisplayName("текст подписи поля «Пароль»")
    public void testFieldNamePassword() {
        assertEquals("Пароль", registrationPage.getTextFieldNamePassword());
    }

    @Test
    @DisplayName("текст кнопки «ВОЙТИ»")
    public void testTextButtonSubmit() {
        assertEquals("ВОЙТИ", registrationPage.getTextButtonSubmit());
    }

    @Test
    @DisplayName("текст ссылки «Забыли пароль?»")
    public void testLinkTitleRestore() {
        assertEquals("Забыли пароль?", registrationPage.getLinkTitleRestore());
    }

    @Test
    @DisplayName("текст Войти с помощью соцсетей:")
    public void testTitleSocialList() {
        assertEquals("Войти с помощью соцсетей:\n", registrationPage.getTitleSocialList());
    }

    @Test
    @DisplayName("текст «Нет аккаунта?»")
    public void testTitleNoAccount() {
        assertEquals("Нет аккаунта? ", registrationPage.getTitleNoAccount());
    }

    @Test
    @DisplayName("заполнить Логин только")
    public void testLoginField() {
        String actualErrorMessage = registrationPage.enterFieldLogin("login");
        assertEquals("Заполните поле", actualErrorMessage);
    }

    @AfterEach
    public void quitAndNullDriver() {
        Driver.quit();
    }
}
