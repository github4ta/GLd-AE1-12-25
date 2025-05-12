import browser.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class BaseTest {
    protected final static LoginPage loginPage = new LoginPage();
    protected final static HomePage homePage = new HomePage();
    protected final static RegistrationPage registrationPage = new RegistrationPage();
    protected final static String EMAIL_FILLING_ERROR = "Электронная почта не указана";
    protected final static String PASSWORD_FILLING_ERROR = "Пароль не указан";
    protected final static String LOGIN_ERROR = "Проверьте электронную почту или \n" + "зарегистрируйтесь";

    @BeforeClass
    public static void runBrowser() {
        Browser.getDriver().get("https://www.21vek.by/");
        Browser.getDriver().manage().window().fullscreen();
    }

    @AfterClass
    public static void closeBrowser() {
        Browser.getDriver().quit();
    }
}
