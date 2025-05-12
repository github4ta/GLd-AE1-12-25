import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TwentyFirstCenturyLoginTest extends BaseTest {


    @Test
    public void loginWithEmptyCredentials() {
        homePage.clickAcceptCookiesButton();
        homePage.clickOnAccountButton();
        loginPage.clickEnterButton();
        loginPage.clickContinueButton();

        Assertions.assertTrue(loginPage.getErrorMessages().contains(EMAIL_FILLING_ERROR),
                "Login page does noy contains email error message");
        Assertions.assertTrue(loginPage.getErrorMessages().contains(PASSWORD_FILLING_ERROR),
                "Login page does noy contains password error message");
    }

    @Test
    public void loginWithFillingEmailFieldWithoutPassword() {
        homePage.clickAcceptCookiesButton();
        homePage.clickOnAccountButton();
        loginPage.clickEnterButton();
        loginPage.enterEmail("test@test.xyz");
        loginPage.clickContinueButton();

        Assertions.assertTrue(loginPage.getErrorMessages().contains(PASSWORD_FILLING_ERROR),
                "Login page does noy contains password error message");
    }

    @Test
    public void loginWithFillingPasswordFieldWithoutEmail() {
        homePage.clickAcceptCookiesButton();
        homePage.clickOnAccountButton();
        loginPage.clickEnterButton();
        loginPage.enterPassword("qwerty123456");
        loginPage.clickContinueButton();

        Assertions.assertTrue(loginPage.getErrorMessages().contains(EMAIL_FILLING_ERROR),
                "Login page does noy contains email error message");
    }

    @Test
    public void loginWithFillingEmailAndPassword() {
        homePage.clickAcceptCookiesButton();
        homePage.clickOnAccountButton();
        loginPage.clickEnterButton();
        loginPage.enterEmail("test@test.xyz");
        loginPage.enterPassword("qwerty123456");
        loginPage.clickContinueButton();

        Assertions.assertTrue(loginPage.getErrorMessages().contains(LOGIN_ERROR),
                "Login page does noy contains email error message");
    }

    @Test
    public void loginToCheckRegistrationPageOpening() {
        homePage.clickAcceptCookiesButton();
        homePage.clickOnAccountButton();
        loginPage.clickEnterButton();
        loginPage.enterEmail("test@test.xyz");
        loginPage.enterPassword("qwerty123456");
        loginPage.clickContinueButton();
        loginPage.clickRegistrationButton();
        Assertions.assertTrue(registrationPage.compareTitle("Регистрация"));
    }
}
