package timoshenko.rw.by;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timoshenko.rw.by.pages.authorization.AuthorizationPage;
import timoshenko.rw.by.pages.registration.RegistrationPage;

import static timoshenko.rw.by.AuthorizationTest.TITLE_AUTHORIZATION_TEXT;

public class RegistrationTest extends BaseTest {
    private final String TITLE_REGISTRATION_TEXT = "Регистрация";
    private final String LABEL_SURNAME_TEXT = "Фамилия *";
    private final String LABEL_NAME_TEXT = "Имя *";
    private final String LABEL_EMAIL_TEXT = "E-mail *";
    private final String LABEL_PASSWORD_TEXT = "Введите пароль *";
    private final String LABEL_REPEAT_PASSWORD_TEXT = "Повторите пароль *";
    private final String BUTTON_REGISTRATION_TEXT = "ЗАРЕГИСТРИРОВАТЬСЯ";
    private final String LINK_REGISTRATION_ENTER_TEXT = "Уже есть профиль?";
    private final String COMMENT_CONFIRM_REGISTRATION_TEXT = "Продолжая, Вы подтверждаете, что ознакомлены с Правилами оформления и оплаты проезда";
    private final String COMMENT_CREATE_PROFILE_TEXT = "Заполните свои личные данные, чтобы создать профиль. Профиль будет действителен как для сайта Белорусской железной дороги, так и для мобильного приложения.";

    protected AuthorizationPage authorizationPage;
    protected RegistrationPage registrationPage;

    @BeforeEach
    public void environmentPreparation() {
        authorizationPage = new AuthorizationPage();
        authorizationPage.clickLinkRegistration();
        registrationPage = new RegistrationPage();
    }

    @Test
    public void getAllRegistrationPageText() {
        Assertions.assertEquals(TITLE_REGISTRATION_TEXT, registrationPage.getTitleRegistrationText());
        Assertions.assertEquals(COMMENT_CREATE_PROFILE_TEXT, registrationPage.getCommentCreateProfileText());
        Assertions.assertEquals(LABEL_SURNAME_TEXT, registrationPage.getAllLabelCredentialText("Фамилия"));
        Assertions.assertEquals(LABEL_NAME_TEXT, registrationPage.getAllLabelCredentialText("Имя"));
        Assertions.assertEquals(LABEL_EMAIL_TEXT, registrationPage.getAllLabelCredentialText("E-mail"));
        Assertions.assertEquals(LABEL_PASSWORD_TEXT, registrationPage.getAllLabelCredentialText("Введите пароль"));
        Assertions.assertEquals(LABEL_REPEAT_PASSWORD_TEXT, registrationPage.getAllLabelCredentialText("Повторите пароль"));
        Assertions.assertEquals(COMMENT_CONFIRM_REGISTRATION_TEXT, registrationPage.getConfirmRegistrationText());
        Assertions.assertEquals(BUTTON_REGISTRATION_TEXT, registrationPage.getButtonRegistrationText());
        Assertions.assertEquals(LINK_REGISTRATION_ENTER_TEXT, registrationPage.getLinkRegistrationEnterText());
    }

    @Test
    public void getTitleAuthorizationText() {
        registrationPage.clickLinkRegistrationEnter();
        Assertions.assertEquals(TITLE_AUTHORIZATION_TEXT, authorizationPage.getTitleAuthorizationText());
    }
}
