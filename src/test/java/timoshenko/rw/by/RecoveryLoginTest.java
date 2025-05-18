package timoshenko.rw.by;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timoshenko.rw.by.pages.recovery.RecoveryLoginPage;

public class RecoveryLoginTest extends BaseTest {
    public final String TITLE_RECOVERY_PAGE_TEXT = "Восстановление логина или пароля";
    public final String COMMENT_INFO_EMAIL_TEXT = "Введите адрес электронной почты, который был указан при регистрации. На него будет выслан Ваш логин и новый пароль.";
    public final String LABEL_EMAIL_TEXT = "E-mail";
    public final String BUTTON_RECOVERY_TEXT = "ВОССТАНОВИТЬ";

    protected RecoveryLoginPage recoveryLoginPage;

    @BeforeEach
    public void environmentPreparation(){
        recoveryLoginPage = new RecoveryLoginPage();
        recoveryLoginPage.clickLinkForgotPassword();
    }

    @Test
    public void checkAllTextRecoveryLoginPage() {
        Assertions.assertEquals(TITLE_RECOVERY_PAGE_TEXT, recoveryLoginPage.getTitleRecoveryLoginText());
        Assertions.assertEquals(COMMENT_INFO_EMAIL_TEXT, recoveryLoginPage.getCommentInfoEmailText());
        Assertions.assertEquals(COMMENT_INFO_EMAIL_TEXT, recoveryLoginPage.getCommentInfoEmailText());
        Assertions.assertEquals(LABEL_EMAIL_TEXT, recoveryLoginPage.getLabelEmailText());
        Assertions.assertEquals(BUTTON_RECOVERY_TEXT, recoveryLoginPage.getButtonRecoveryText());
    }
}
