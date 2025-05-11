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

    private WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void beforeEach() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.get("https://www.21vek.by/");

        String submitButtonLocator = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";
        WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
        submitButton.click();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void test1() {
        String linkAllActionsLocator = "//a[@href=\"/special_offers/promo.html\"]";
        WebElement linkAllAction = driver.findElement(By.xpath(linkAllActionsLocator));
        linkAllAction.click();

        String allActionTitleLocator = "//h1[@class=\"style_title__c0jN1 Title-module__title Title-module__h1\"]";
        WebElement allAction = driver.findElement(By.xpath(allActionTitleLocator));
        String actual = allAction.getText();

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

        Assertions.assertEquals("Вход", actual);
    }

    @Test
    public void test4() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioButtonChooseEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(radioButtonChooseEmailLocator));
        radioButtonChooseEmail.click();

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[text()[contains(.,'Электронная почта не указана')]]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText();

        Assertions.assertEquals("Электронная почта не указана", actual);

        String errorMessagePasswordInputLocator = "//span[text()[contains(.,'Пароль не указан')]]";
        WebElement errorMessagePasswordInput = driver.findElement(By.xpath(errorMessagePasswordInputLocator));
        actual = errorMessagePasswordInput.getText();

        Assertions.assertEquals("Пароль не указан", actual);
    }

    @Test
    public void test5() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioButtonChooseEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(radioButtonChooseEmailLocator));
        radioButtonChooseEmail.click();

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
    public void test6() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioButtonChooseEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(radioButtonChooseEmailLocator));
        radioButtonChooseEmail.click();

        String inputPasswordFieldLocator = "//input[@id=\"login-password\"]";
        WebElement inputPasswordField = driver.findElement(By.xpath(inputPasswordFieldLocator));
        inputPasswordField.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String errorMessageEmailInputLocator = "//span[text()[contains(.,'Электронная почта не указана')]]";
        WebElement errorMessageEmailInput = driver.findElement(By.xpath(errorMessageEmailInputLocator));
        String actual = errorMessageEmailInput.getText();

        Assertions.assertEquals("Электронная почта не указана", actual);
    }

    @Test
    public void test7() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioButtonChooseEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(radioButtonChooseEmailLocator));
        radioButtonChooseEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String inputPasswordFieldLocator = "//input[@id=\"login-password\"]";
        WebElement inputPasswordField = driver.findElement(By.xpath(inputPasswordFieldLocator));
        inputPasswordField.sendKeys("qwerty123456");

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
    public void test8() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String radioButtonChooseEmailLocator = "//label[@class=\"BaseRadioButton-module__label BaseRadioButton-module__checkedLabel\"]";
        WebElement radioButtonChooseEmail = driver.findElement(By.xpath(radioButtonChooseEmailLocator));
        radioButtonChooseEmail.click();

        String inputEmailFieldLocator = "//input[@id=\"login-email\"]";
        WebElement inputEmailField = driver.findElement(By.xpath(inputEmailFieldLocator));
        inputEmailField.sendKeys("test@test.xyz");

        String inputPasswordFieldLocator = "//input[@id=\"login-password\"]";
        WebElement inputPasswordField = driver.findElement(By.xpath(inputPasswordFieldLocator));
        inputPasswordField.sendKeys("qwerty123456");

        String buttonContinueLocator = "//button[@data-testid=\"loginSubmit\"]";
        WebElement buttonContinue = driver.findElement(By.xpath(buttonContinueLocator));
        buttonContinue.click();

        String linkButtonRegistrationLocator = "//a[@class=\"LinkButton-module__wrapper LinkButton-module__tiny LinkButton-module__regular LinkButton-module__blue\"]";
        WebElement linkButtonRegistration = driver.findElement(By.xpath(linkButtonRegistrationLocator));
        linkButtonRegistration.click();

        String titleRegistrationLocator = "//h5[@class=\"Form-module__formTitle\"]";
        WebElement titleRegistration = driver.findElement(By.xpath(titleRegistrationLocator));
        String actual = titleRegistration.getText();

        Assertions.assertEquals("Регистрация", actual);
    }
}
