package by.itacademy;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Vek21Test extends BaseSeleniumTest {

    private static final String EMAIL = "test@test.xyz";
    private static final String PASSWORD = "qwerty123456";
    private static final String COMMEMT_EMAIL = "Электронная почта не указана";
    private static final String COMMEMT_PASSWORD = "Пароль не указан";
    private static final String CHECK_LINK_REGISTRATION = "Проверьте электронную почту или \nзарегистрируйтесь";
    private static final String TITLE_REGISTRATION = "Регистрация";

    @Test
    public void checkLoginWithoutEmailAndPassword() {
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterSubmitLoginButton();
        String actualEmail = loginPage.getComment("email");
        String actualPassword = loginPage.getComment("password");
        Assert.assertEquals(COMMEMT_EMAIL, actualEmail);
        Assert.assertEquals(COMMEMT_PASSWORD, actualPassword);
    }

    @Test
    public void checkLoginWithEmail() {
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterField(EMAIL,"email");
        loginPage.enterSubmitLoginButton();
        String actualPassword = loginPage.getComment("password");
        Assert.assertEquals(COMMEMT_PASSWORD, actualPassword);
    }

    @Test
    public void checkLoginWithPassword() {
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterField(PASSWORD, "password");
        loginPage.enterSubmitLoginButton();
        String actualEmail = loginPage.getComment("email");
        Assert.assertEquals(COMMEMT_EMAIL, actualEmail);
    }

    @Test
    public void checkLoginWithEmailAndPassword() {
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterField(EMAIL, "email");
        loginPage.enterField(PASSWORD, "password");
        loginPage.enterSubmitLoginButton();
        String actualLink = loginPage.getComment("email");
        Assert.assertEquals(CHECK_LINK_REGISTRATION, actualLink);
    }

    @Test
    public void checkRegistrationLink() {
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterField(EMAIL, "email");
        loginPage.enterField(PASSWORD, "password");
        loginPage.enterSubmitLoginButton();
        loginPage.enterLinkButtonRegistration();
        String actualTitle = loginPage.getTitleRegistration();
        Assert.assertEquals(TITLE_REGISTRATION, actualTitle);
    }
}
