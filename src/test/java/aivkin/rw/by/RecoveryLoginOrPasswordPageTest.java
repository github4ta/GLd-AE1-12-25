package aivkin.rw.by;

import aivkin.rw.by.pages.home.HomePage;
import aivkin.rw.by.pages.home.authorizationform.AuthorizationForm;
import aivkin.rw.by.pages.home.authorizationform.AuthorizationFormLocator;
import aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.RecoveryLoginOrPasswordPage;
import by.vek.driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecoveryLoginOrPasswordPageTest extends HomeTest{

    private RecoveryLoginOrPasswordPage recoveryLoginOrPasswordPage;

    @BeforeEach
    public void setUp() {
        new HomePage().clickButtonPersonalAccount();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AuthorizationFormLocator.TITLE_AUTHORIZATION)));
        new AuthorizationForm().clickLinkForgotPassword();
        recoveryLoginOrPasswordPage = new RecoveryLoginOrPasswordPage();
    }

    @Test
    public void checkTitleTextLabelButtonUrlNames() {
        Assertions.assertEquals("Восстановление логина или пароля", recoveryLoginOrPasswordPage.getTitleRecoveryPageText());
        Assertions.assertEquals("Введите адрес электронной почты, который был указан при регистрации. На него будет выслан Ваш логин и новый пароль.", recoveryLoginOrPasswordPage.getRecoveryInformationText());
        Assertions.assertEquals("E-mail", recoveryLoginOrPasswordPage.getLabelInputEmailText());
        Assertions.assertEquals("ВОССТАНОВИТЬ", recoveryLoginOrPasswordPage.getButtonRecoveryText());
        Assertions.assertEquals("https://pass.rw.by/ru/registration/pwd_restore/", recoveryLoginOrPasswordPage.getRecoveryPageUrl());
    }

    @Test
    public void checkIsDisplayedModalWindowRecovery() {
        recoveryLoginOrPasswordPage.inputEmail("q@q");
        recoveryLoginOrPasswordPage.clickButtonRecovery();
        Assertions.assertTrue(recoveryLoginOrPasswordPage.isDisplayedModalWindowRecovery());
    }
}
