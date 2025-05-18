package aivkin.rw.by;

import aivkin.rw.by.pages.home.authorizationform.AuthorizationForm;
import aivkin.rw.by.pages.home.authorizationform.recaveryloginorpassword.RecoveryLoginOrPasswordPage;

public class WithRecoveryPageSetupTest extends WithAuthorizationSetupTest{

    protected RecoveryLoginOrPasswordPage openRecoveryPage() {
        openAuthorizationForm();
        new AuthorizationForm().clickLinkForgotPassword();
        return new RecoveryLoginOrPasswordPage();
    }

    protected RecoveryLoginOrPasswordPage openRecoveryModalWindowForm(String email) {
        RecoveryLoginOrPasswordPage recoveryLoginOrPasswordPage = openRecoveryPage();
        recoveryLoginOrPasswordPage.inputEmail(email);
        recoveryLoginOrPasswordPage.clickButtonRecovery();
        return recoveryLoginOrPasswordPage;
    }
}
