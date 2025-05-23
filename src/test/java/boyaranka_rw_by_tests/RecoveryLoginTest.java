package boyaranka_rw_by_tests;

import boyaranka_rw_by.pages.authorization.AuthorizationPage;
import boyaranka_rw_by.pages.recovery.RecoveryLoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecoveryLoginTest extends HomeTest {
    public final String TITLE_RECOVERY_PAGE_TEXT = "Восстановление логина или пароля";
    public final String COMMENT_INFO_EMAIL_TEXT = "Введите адрес электронной почты, который был указан при регистрации. На него будет выслан Ваш логин и новый пароль.";
    public final String LABEL_EMAIL_TEXT = "E-mail";
    public final String BUTTON_RECOVERY_TEXT = "ВОССТАНОВИТЬ";
    public final String TITLE_RECOVERY_MODAL_TEXT = "Восстановление логина или пароля";
    public final String EXCEPTED_URL = "https://pass.rw.by/ru/registration/pwd_restore/";

    protected RecoveryLoginPage recoveryLoginPage;
    protected AuthorizationPage authorizationPage;

    @BeforeEach
    public void environmentPreparation() {
        authorizationPage = new AuthorizationPage();
        authorizationPage.clickLinkForgotPassword();
        recoveryLoginPage = new RecoveryLoginPage();
    }

    @Test
    public void checkAllTextRecoveryLoginPage() {
        Assertions.assertEquals(TITLE_RECOVERY_PAGE_TEXT, recoveryLoginPage.getTitleRecoveryLoginText());
        Assertions.assertEquals(COMMENT_INFO_EMAIL_TEXT, recoveryLoginPage.getCommentInfoEmailText());
        Assertions.assertEquals(COMMENT_INFO_EMAIL_TEXT, recoveryLoginPage.getCommentInfoEmailText());
        Assertions.assertEquals(LABEL_EMAIL_TEXT, recoveryLoginPage.getLabelEmailText());
        Assertions.assertEquals(BUTTON_RECOVERY_TEXT, recoveryLoginPage.getButtonRecoveryText());
    }

    @Test
    public void checkInputEmail() {
        recoveryLoginPage.inputEmail();
        recoveryLoginPage.clickButtonRecovery();
        Assertions.assertEquals(TITLE_RECOVERY_MODAL_TEXT, recoveryLoginPage.getTitleRecoveryModalText());
    }

    @Test
    public void checkUrlTest() {
        Assertions.assertEquals(EXCEPTED_URL, recoveryLoginPage.getCurrentUrl());
    }
}