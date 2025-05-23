package by.itacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class VekTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.21vek.by");

        String submitButtonCookieLocator = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";
        WebElement submitButtonCookie = driver.findElement(By.xpath(submitButtonCookieLocator));
        submitButtonCookie.click();
    }

    @Test
    public void test1() {
        String linAllActionsLocator = "//a[@href=\"/special_offers/promo.html\"]";
        WebElement linkAllActions = driver.findElement(By.xpath(linAllActionsLocator));
        linkAllActions.click();

        String allActionsTitleLocator = "//h1[@class=\"style_title__c0jN1 Title-module__title Title-module__h1\"]";
        WebElement allActionsTitle = driver.findElement(By.xpath(allActionsTitleLocator));
        String actual = allActionsTitle.getText();

        Assertions.assertEquals("Все акции", actual);
    }

    @Test
    public void test2() {
        String legalInformationBlockLocator = "//div[@class=\"styles_legalInformationBlock__iXOVK\"]";
        WebElement legalInformationBlock = driver.findElement(By.xpath(legalInformationBlockLocator));
        String actual = legalInformationBlock.getText();

        Assertions.assertTrue(actual.contains("© 2004–2025 21vek.by,"));
    }

    @Test
    public void test3() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String titleLoginFormLocator = "//div[@class=\"LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold\"]";
        WebElement titleLoginForm = driver.findElement(By.xpath(titleLoginFormLocator));
        String actual = titleLoginForm.getText();

        Assertions.assertEquals("Вход",actual);
    }

    @Test
    public void test4_WithoutKreds() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessageEmailLocator = "//span[contains(@class, 'message') and contains(., 'не указана')]";
        WebElement validationErrorMessageEmail = driver.findElement(By.xpath(validationErrorMessageEmailLocator));
        String actualEmail = validationErrorMessageEmail.getText();

        Assertions.assertEquals("Электронная почта не указана", actualEmail);

        String validationErrorMessagePasswordLocator = "//span[contains(@class, 'message') and contains(., 'Пароль')]";
        WebElement validationErrorMessagePassword = driver.findElement(By.xpath(validationErrorMessagePasswordLocator));
        String actualPassword = validationErrorMessagePassword.getText();

        Assertions.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void test5_WithoutPassord() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("test@test.xyz");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessagePasswordLocator = "//span[contains(@class, 'message') and contains(., 'Пароль')]";
        WebElement validationErrorMessagePassword = driver.findElement(By.xpath(validationErrorMessagePasswordLocator));
        String actualPassword = validationErrorMessagePassword.getText();

        Assertions.assertEquals("Пароль не указан", actualPassword);
    }

    @Test
    public void test6_WithoutEmail() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement passwordInput = driver.findElement(By.xpath("//input[@label=\"Пароль\"]"));
        passwordInput.sendKeys("qwerty123456");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessageEmailLocator = "//span[contains(@class, 'message') and contains(., 'не указана')]";
        WebElement validationErrorMessageEmail = driver.findElement(By.xpath(validationErrorMessageEmailLocator));
        String actualEmail = validationErrorMessageEmail.getText();

        Assertions.assertEquals("Электронная почта не указана", actualEmail);
    }

    @Test
    public void test7_WithWrongKreds() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("test@test.xyz");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@label=\"Пароль\"]"));
        passwordInput.sendKeys("qwerty123456");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessageEmailLocator = "//span[contains(@class, 'message') and contains(., 'Проверьте электронную почту или')]";
        WebElement validationErrorMessageEmail = driver.findElement(By.xpath(validationErrorMessageEmailLocator));
        String actualEmail = validationErrorMessageEmail.getText();

        Assertions.assertEquals("Проверьте электронную почту или \n" +
                "зарегистрируйтесь", actualEmail);
    }

    @Test
    public void test8_ClickLink() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("test@test.xyz");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@label=\"Пароль\"]"));
        passwordInput.sendKeys("qwerty123456");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String linkButtonRegistrationLocator = "//a[@class=\"LinkButton-module__wrapper LinkButton-module__tiny LinkButton-module__regular LinkButton-module__blue\"]";
        WebElement linkButtonRegistration = driver.findElement(By.xpath(linkButtonRegistrationLocator));
        linkButtonRegistration.click();

        String linkregistrationLocator = "//h5";
        WebElement linkregistration = driver.findElement(By.xpath(linkregistrationLocator));
        String registrationForm = linkregistration.getText();

        Assertions.assertEquals("Регистрация", registrationForm);
    }

    @Test
    public void test9_WithIncorrectEmail() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("test");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessageEmailLocator = "//span[contains(@class, 'message') and contains(., 'формат')]";
        WebElement validationErrorMessageEmail = driver.findElement(By.xpath(validationErrorMessageEmailLocator));
        String actualEmail = validationErrorMessageEmail.getText();

        Assertions.assertEquals("Неправильный формат электронной почты", actualEmail);
    }

    @Test
    public void test10_WithIncorrectPassword() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("evminova.iryna@yandex.ru");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@label=\"Пароль\"]"));
        passwordInput.sendKeys("qwerty");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String validationErrorMessagePasswordLocator = "//span[contains(@class, 'message') and contains(., 'пароль')]";
        WebElement validationErrorMessagePassword = driver.findElement(By.xpath(validationErrorMessagePasswordLocator));
        String actualPassword = validationErrorMessagePassword.getText();

        Assertions.assertEquals("Неправильный пароль. \n" + "Сбросить пароль?", actualPassword);
    }

    @Test
    public void test11_ClickResetPassword() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioBattonEmailLocator = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
        WebElement radioButtonEmail = driver.findElement(By.xpath(radioBattonEmailLocator));
        radioButtonEmail.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@label=\"Электронная почта\"]"));
        emailInput.sendKeys("evminova.iryna@yandex.ru");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@label=\"Пароль\"]"));
        passwordInput.sendKeys("qwerty");

        String buttonLoginSubmitLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonLoginSubmit = driver.findElement(By.xpath(buttonLoginSubmitLocator));
        buttonLoginSubmit.click();

        String resetPasswordLocator = "//a[@class=\"LinkButton-module__wrapper LinkButton-module__tiny LinkButton-module__regular LinkButton-module__blue\"]";
        WebElement resetPassword = driver.findElement(By.xpath(resetPasswordLocator));
        resetPassword.click();

        String linkregistrationLocator = "//h5";
        WebElement linkregistration = driver.findElement(By.xpath(linkregistrationLocator));
        String registrationForm = linkregistration.getText();

        Assertions.assertEquals("Сброс пароля", registrationForm);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
