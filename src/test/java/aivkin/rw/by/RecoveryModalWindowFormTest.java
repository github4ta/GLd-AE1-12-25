package aivkin.rw.by;

import aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.RecoveryLoginOrPasswordPage;
import aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.recoverymodalwindow.RecoveryModalWindowForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecoveryModalWindowFormTest extends WithRecoveryPageSetupTest{

    private RecoveryModalWindowForm recoveryModalWindowForm;

    @BeforeEach
    public void setUp() {
        openRecoveryModalWindowForm("q@q");
        recoveryModalWindowForm = new RecoveryModalWindowForm();
    }

    @Test
    public void checkTitleTextButtonNames() {
        Assertions.assertEquals("Восстановление логина или пароля", recoveryModalWindowForm.getTitleRecoveryFormText());
        Assertions.assertEquals("Не удалось найти пользователя, зарегистрированного с помощью логина или электронной почты: q@q", recoveryModalWindowForm.getTRecoveryFormInformationText());
        Assertions.assertEquals("ЗАКРЫТЬ", recoveryModalWindowForm.getButtonCloseText());
        Assertions.assertTrue(recoveryModalWindowForm.isButtonCloseDisplayed());
        Assertions.assertTrue(recoveryModalWindowForm.isButtonCloseEnabled());
        Assertions.assertTrue(recoveryModalWindowForm.isButtonCrossDisplayed());
        Assertions.assertTrue(recoveryModalWindowForm.isButtonCrossEnabled());
    }

    @Test
    public void checkButtonCloseClosesModalWindow() {
        recoveryModalWindowForm.clickButtonClose();
        Assertions.assertTrue(recoveryModalWindowForm.isClosedModalWindowRecovery());
    }

    @Test
    public void checkButtonCrossClosesModalWindow() {
        recoveryModalWindowForm.clickButtonCross();
        Assertions.assertTrue(recoveryModalWindowForm.isClosedModalWindowRecovery());
    }
}
