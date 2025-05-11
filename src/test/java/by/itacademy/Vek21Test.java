package by.itacademy;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class Vek21Test extends BaseSeleniumTest {

    @Test
    public void checkLoginWithoutEmailAndPassword(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterSubmitLoginButton();
        String actualEmail = loginPage.getCommentEmail();
        String actualPassword = loginPage.getCommentPassword();
        Assert.assertEquals("Электронная почта не указана", actualEmail);
        Assert.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void checkLoginWithEmail(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterFieldAddEmail();
        loginPage.enterSubmitLoginButton();
        String actualPassword = loginPage.getCommentPassword();
        Assert.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void checkLoginWithPassword(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterFieldAddPassword();
        loginPage.enterSubmitLoginButton();
        String actualEmail = loginPage.getCommentEmail();
        Assert.assertEquals("Электронная почта не указана", actualEmail);
    }

    @Test
    public void checkLoginWithEmailAndPassword(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterFieldAddEmail();
        loginPage.enterFieldAddPassword();
        loginPage.enterSubmitLoginButton();
        String actualLink = loginPage.getCommentEmail();
        Assert.assertEquals("Проверьте электронную почту или \nзарегистрируйтесь", actualLink);
    }

    @Test
    public void checkRegistrationLink(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.enterAccountButton();
        mainPage.enterLoginButton();
        loginPage.enterFieldAddEmail();
        loginPage.enterFieldAddPassword();
        loginPage.enterSubmitLoginButton();
        loginPage.enterLinkButtonRegistration();
        String actualTitle = loginPage.getTitleRegistration();
        Assert.assertEquals("Регистрация", actualTitle);
    }
}
