package aivkin.rw.by;

import aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.RecoveryLoginOrPasswordPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecoveryLoginOrPasswordPageTest extends WithRecoveryPageSetupTest{

    private RecoveryLoginOrPasswordPage recoveryLoginOrPasswordPage;

    @BeforeEach
    public void setUp() {
        recoveryLoginOrPasswordPage = openRecoveryPage();
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
