package by.vek;

import by.vek.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.get("https://www.21vek.by");

        loginPage = new LoginPage(driver);
        loginPage.clickSubmitButtonCookie();
        loginPage.clickButtonUserAccount();
        loginPage.clickButtonLogin();
    }

    @Test
    public void testWithEmptyFields() {
        loginPage.clickButtonContinue();

        Assertions.assertEquals("Электронная почта не указана", loginPage.getTextErrorMessageEmailEmailInput());
        Assertions.assertEquals("Пароль не указан", loginPage.getErrorMessagePasswordInputText());
    }

    @Test
    public void testWithEmptyPassword(){
        loginPage.sendKeysInputEmailField("test@test.xyz");
        loginPage.clickButtonContinue();
        Assertions.assertEquals("Пароль не указан", loginPage.getErrorMessagePasswordInputText());
    }
      
    @Test
    public void testWithCorrectEmailAndIncorrectPassword() {
        loginPage.sendKeysInputEmailField("evminova.iryna@yandex.ru");
        loginPage.sendKeysInputPasswordField("123qwerty");
        loginPage.clickButtonContinue();

        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?",loginPage.getErrorMessagePasswordText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testTitleLoginPage() {
        Assertions.assertEquals("Вход", loginPage.getTextTitleLoginForm());
    }
}
