package aivkin.rw.by;

import aivkin.rw.by.pages.home.HomePage;
import aivkin.rw.by.pages.home.authorizationform.AuthorizationForm;
import aivkin.rw.by.pages.home.authorizationform.AuthorizationFormLocator;
import by.vek.driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationFormTest extends HomeTest {

    private AuthorizationForm authorizationForm;

    @BeforeEach
    public void setUp() {
        new HomePage().clickButtonPersonalAccount();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AuthorizationFormLocator.TITLE_AUTHORIZATION)));
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
