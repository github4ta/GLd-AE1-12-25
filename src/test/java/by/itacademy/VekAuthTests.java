package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;

public class VekAuthTests {

    private WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.21vek.by/");

        String submitButtonLoginLocator = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";
        WebElement submitButtonLogin = driver.findElement(By.xpath(submitButtonLoginLocator));
        submitButtonLogin.click();
    }

    @Test
    public void test_1() {
        //проверка ошибок при пустых полях логина
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[text()[contains(.,'Электронная почта не указана')]]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText(); // Получаем текст ошибки о незаполненной почте

        Assertions.assertEquals("Электронная почта не указана", actual); // Проверяем, что сообщение совпадает

        String errorMessagePasswordInputLocator = "//span[text()[contains(.,'Пароль не указан')]]";
        WebElement errorMessagePasswordInput = driver.findElement(By.xpath(errorMessagePasswordInputLocator));
        actual = errorMessagePasswordInput.getText(); // Получаем сообщение о незаполненном пароле

        Assertions.assertEquals("Пароль не указан", actual);  // Проверяем сообщение
    }

    @Test
    public void test_2() {
        //проверка ошибки при вводе email без пароля
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessagePasswordInputLocator = "//span[text()[contains(.,'Пароль не указан')]]";
        WebElement errorMessagePasswordInput = driver.findElement(By.xpath(errorMessagePasswordInputLocator));
        String actual = errorMessagePasswordInput.getText();

        Assertions.assertEquals("Пароль не указан", actual);
    }

    @Test
    public void test_3() {
        //проверка ошибки при вводе пароля без email
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputPasswordLocator = "//input[@id=\"login-password\"]";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[text()[contains(.,'Электронная почта не указана')]]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText();

        Assertions.assertEquals("Электронная почта не указана", actual);
    }

    @Test
    public void test_4() {
        // успешный ввод email и пароля, проверка ошибки при неправильной авторизации
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String inputPasswordLocator = "//input[@id=\"login-password\"]";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[@class=\"ErrorMessageLink_container__7D0yM\"]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText();

        Assertions.assertEquals("Проверьте электронную почту или \n" +
                "зарегистрируйтесь", actual);
    }

    @Test
    public void test_5() {
        //переход к регистрации после успешного ввода данных
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String inputPasswordFieldLocator = "//input[@id=\"login-password\"]";
        WebElement inputPasswordField = driver.findElement(By.xpath(inputPasswordFieldLocator));
        inputPasswordField.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String linkRegistrationLocator = "//a[@class=\"LinkButton-module__wrapper LinkButton-module__tiny LinkButton-module__regular LinkButton-module__blue\"]";
        WebElement linkRegistration = driver.findElement(By.xpath(linkRegistrationLocator));
        linkRegistration.click();

        String titleRegistrationLocator = "//h5[@class=\"Form-module__formTitle\"]";
        WebElement titleRegistration = driver.findElement(By.xpath(titleRegistrationLocator));
        String actual = titleRegistration.getText();

        Assertions.assertEquals("Регистрация", actual);
    }

    @Test
    public void test_6() {
        //проверка ошибки при вводе верного пароля и Неправильный формат электронной почты
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("testtest.xyz");

        String inputPasswordLocator = "//input[@id=\"login-password\"]";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[text()[contains(.,'Неправильный формат электронной почты')]]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText();

        Assertions.assertEquals("Неправильный формат электронной почты", actual);
    }

    @Test
    public void test_7() {
        //проверка ошибки при вводе некорректного пароля (1 символ) и верной электронной почты
        String buttonAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonAccount = driver.findElement(By.xpath(buttonAccountLocator));
        buttonAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String buttonEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement buttonEmail = driver.findElement(By.xpath(buttonEmailLocator));
        buttonEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String inputPasswordLocator = "//input[@id=\"login-password\"]";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys("q");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessagePasswordInputLocator = "//span[text()[contains(.,'Неправильный пароль.')]]";
        WebElement errorMessagePasswordInput = driver.findElement(By.xpath(errorMessagePasswordInputLocator));

        String actual = errorMessagePasswordInput.getText();

        Assertions.assertEquals("Неправильный пароль. \nСбросить пароль?", actual);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
