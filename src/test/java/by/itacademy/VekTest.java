package by.itacademy;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

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

        Assert.assertEquals("Все акции", actual);
    }

    @Test
    public void test2() {
        String legalInformationBlockLocator = "//div[@class=\"styles_legalInformationBlock__iXOVK\"]";
        WebElement legalInformationBlock = driver.findElement(By.xpath(legalInformationBlockLocator));
        String actual = legalInformationBlock.getText();

        Assert.assertTrue(actual.contains("© 2004–2025 21vek.by,"));
    }

    @Test
    public void test3() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

//        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        String buttonLoginLocator = "//*[@id=\"DROP_DOWN_PORTAL\"]/div/div[1]/div[2]/button/div";
        //*[@id="DROP_DOWN_PORTAL"]/div/div[1]/div[2]/button/div
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

//        String titleLoginFormLocator = "//div[@class=\"LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold\"]";
        String titleLoginFormLocator = "//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[1]";

        WebElement titleLoginForm = driver.findElement(By.xpath(titleLoginFormLocator));
        String actual = titleLoginForm.getText();

        Assert.assertEquals("Вход",actual);
    }

    @Test
    public void testLoginFormOnlyLogin() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

//        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        String buttonLoginLocator = "//*[@id=\"DROP_DOWN_PORTAL\"]/div/div[1]/div[2]/button/div";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String loginInputLocator = "//*[@id=\"login-email\"]";
        WebElement loginInput = driver.findElement(By.xpath(loginInputLocator));
        loginInput.sendKeys("72727@gmail.com");

        String loginButtonLocator = "//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[4]/form/div/div[3]/button/div";
        WebElement loginButton = driver.findElement(By.xpath(loginButtonLocator));
        loginButton.click();

        String noPasswordLocator = "//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[4]/form/div/div[2]/div[3]/span[2]";
        WebElement noPasswordSpan = driver.findElement(By.xpath(noPasswordLocator));
        String actual = noPasswordSpan.getText();
        Assert.assertEquals("Пароль не указан",actual);
    }

    @Test
    public void testLoginFormOnlyPass() {
        String buttonUserAccountLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
        WebElement buttonUserAccount = driver.findElement(By.xpath(buttonUserAccountLocator));
        buttonUserAccount.click();

//        String buttonLoginLocator = "//button[@data-testid=\"loginButton\"]";
        String buttonLoginLocator = "//*[@id=\"DROP_DOWN_PORTAL\"]/div/div[1]/div[2]/button/div";
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginLocator));
        buttonLogin.click();

        String passInputLocator = "//*[@id=\"login-password\"]";
        WebElement passInput = driver.findElement(By.xpath(passInputLocator));
        passInput.sendKeys("72727");

        String loginButtonLocator = "//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[4]/form/div/div[3]/button/div";
        WebElement loginButton = driver.findElement(By.xpath(loginButtonLocator));
        loginButton.click();

        String noLoginLocator = "//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[4]/form/div/div[1]/div[3]/span[2]";
        WebElement noLoginSpan = driver.findElement(By.xpath(noLoginLocator));
        String actual = noLoginSpan.getText();
        Assert.assertEquals("Электронная почта не указана",actual);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
