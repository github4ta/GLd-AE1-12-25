package by.vek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

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
    public void testWithUncorectEmailAndEmptyPassword() {

        loginPage.sendKeysInputEmailField("123@mail");
        loginPage.clickButtonContinue();

        Assertions.assertEquals("Неправильный формат электронной почты", loginPage.getErrorMessageWrongEmailText());
        Assertions.assertEquals("Пароль не указан", loginPage.getErrorMessagePasswordInputText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
