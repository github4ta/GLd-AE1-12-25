package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassRwAuthorizationTest {
    private PassRwHomePage homePage;

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
        homePage = new PassRwHomePage();
        homePage.open();
        homePage.clickProfile();
    }

    @Test//testText()
    public void testContent() {
        Assertions.assertEquals(HEADER_TEXT_CORRECT, homePage.getAuthorizationModalHeaderText());
        Assertions.assertEquals(LOGIN_OR_EMAIL_FIELD_NAME_CORRECT, homePage.getAuthorizationModalLoginOrEmailFieldNameText());
        Assertions.assertEquals(PASSWORD_FIELD_NAME_CORRECT, homePage.getAuthorizationModalPasswordFieldNameText());
        Assertions.assertEquals(LOGIN_BUTTON_TEXT_CORRECT, homePage.getAuthorizationModalLoginButtonText());
        Assertions.assertEquals(FORGOT_PASSWORD_TEXT_CORRECT, homePage.getAuthorizationModalForgotPasswordLinkText());
        Assertions.assertEquals(LOGIN_VIA_SOCIAL_TITLE_TEXT_CORRECT, homePage.getAuthorizationModalLoginViaSocialTitleText());
        Assertions.assertTrue(homePage.getAuthorizationModalNoAccountYetCaptionText().contains(NO_ACCOUNT_YET_CAPTION_TEXT_CORRECT));
        Assertions.assertEquals(REGISTER_LINK_TEXT_CORRECT, homePage.getAuthorizationModalRegisterLinkText());
    }

    @Test
    public void testTryLoginWithIncorrectCredentials() {
        //не воспроизводится
    }

    @Test//testFillAllFieldsWithNonExistentCredentials()
    public void testTryLoginWithNonExistentCredentials() {
        homePage.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        homePage.fillPasswordField(PASSWORD_VALUE_CORRECT);
        homePage.clickLoginButton();
        Assertions.assertEquals(USER_NOT_FOUND_ERROR_MESSAGE_TEXT_CORRECT, homePage.getAuthorizationModalUserNotFoundErrorText());
    }

    @Test//testFillOnlyLoginOrEmailField()
    public void testTryLoginWithOnlyLoginOrEmailFieldFilled() {
        homePage.fillLoginOrEmailField(LOGIN_OR_EMAIL_VALUE_CORRECT_1);
        homePage.clickLoginButton();
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, homePage.getAuthorizationModalPasswordErrorText());
    }

    @Test//testFillOnlyPasswordField()
    public void testTryLoginWithOnlyPasswordFieldFilled() {
        homePage.fillPasswordField(PASSWORD_VALUE_CORRECT);
        homePage.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, homePage.getAuthorizationModalLoginOrEmailErrorText());
    }

    @Test//testFillNoFields()
    public void testTryLoginWithNoFieldsFilled() {
        homePage.clickLoginButton();
        Assertions.assertEquals(LOGIN_ERROR_MESSAGE_TEXT_CORRECT, homePage.getAuthorizationModalLoginOrEmailErrorText());
        Assertions.assertEquals(PASSWORD_ERROR_MESSAGE_TEXT_CORRECT, homePage.getAuthorizationModalPasswordErrorText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
