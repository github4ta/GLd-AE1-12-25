package timoshenko.rw.by;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timoshenko.rw.by.pages.authorization.AuthorizationPage;
import timoshenko.rw.by.pages.modal.ModalRecoveryLoginPage;
import timoshenko.rw.by.pages.recovery.RecoveryLoginPage;

public class ModalRecoveryLoginTest extends BaseTest {
    private final String TITLE_RECOVERY_MODAL_TEXT = "Восстановление логина или пароля";
    private final String COMMENT_INFO_TEXT = "Не удалось найти пользователя, зарегистрированного с помощью логина или электронной почты: q@q";
    private final String BUTTON_CLOSE_SUBMIT_TEXT = "ЗАКРЫТЬ";

    protected AuthorizationPage authorizationPage;
    protected RecoveryLoginPage recoveryLoginPage;
    protected ModalRecoveryLoginPage modalRecoveryLoginPage;

    @BeforeEach
    public void environmentPreparation() {
        authorizationPage = new AuthorizationPage();
        authorizationPage.clickLinkForgotPassword();
        recoveryLoginPage = new RecoveryLoginPage();
        recoveryLoginPage.inputEmail();
        recoveryLoginPage.clickButtonRecovery();
        modalRecoveryLoginPage = new ModalRecoveryLoginPage();
    }

    @Test
    public void checkAllModalText() {
        Assertions.assertEquals(TITLE_RECOVERY_MODAL_TEXT, modalRecoveryLoginPage.getTitleRecoveryModalText());
        Assertions.assertEquals(COMMENT_INFO_TEXT, modalRecoveryLoginPage.getCommentInfoText());
        Assertions.assertEquals(BUTTON_CLOSE_SUBMIT_TEXT, modalRecoveryLoginPage.getButtonCloseSubmitText());
    }

    @Test
    public void checkVisibilityButtonCloseSubmit() {
        modalRecoveryLoginPage.VisibilityButtonCloseSubmit();
    }

    @Test
    public void checkVisibilityButtonClose() {
        modalRecoveryLoginPage.VisibilityButtonClose();
    }

    @Test
    public void checkCloseButtonSubmit() {
        modalRecoveryLoginPage.closeButtonSubmit();
        Assertions.assertEquals(TITLE_RECOVERY_MODAL_TEXT, modalRecoveryLoginPage.getTitleRecoveryModalText());
    }

    @Test
    public void checkCloseButton() {
        modalRecoveryLoginPage.closeButton();
        Assertions.assertEquals(TITLE_RECOVERY_MODAL_TEXT, modalRecoveryLoginPage.getTitleRecoveryModalText());
    }
}
