package aivkin.rw.by;

import aivkin.rw.by.pages.home.authorizationform.registration.RegistrationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends WithRecoveryPageSetupTest{

    private RegistrationPage registrationPage;

    @BeforeEach
    public void setUp() {
        openRegistrationPage();
        registrationPage = new RegistrationPage();
    }

    @Test
    public void checkTitleTextsLabelsButtonLinksUrlNames() {
        Assertions.assertEquals("Регистрация", registrationPage.getTitleRegistrationText());
        Assertions.assertEquals("Заполните свои личные данные, чтобы создать профиль. Профиль будет действителен как для сайта Белорусской железной дороги, так и для мобильного приложения.", registrationPage.getRegistrationInformationText());
        Assertions.assertEquals("Фамилия *", registrationPage.getLabelInputLastnameText());
        Assertions.assertEquals("Имя *", registrationPage.getLabelInputFirstnameText());
        Assertions.assertEquals("E-mail *", registrationPage.getLabelInputEmailText());
        Assertions.assertEquals("Введите пароль *", registrationPage.getLabelInputPasswordText());
        Assertions.assertEquals("Повторите пароль *", registrationPage.getLabelInputRepeatPasswordText());
        Assertions.assertEquals("Продолжая, Вы подтверждаете, что ознакомлены с Правилами оформления и оплаты проезда", registrationPage.getRegistrationInformationRulesText());
        Assertions.assertEquals("ЗАРЕГИСТРИРОВАТЬСЯ", registrationPage.getButtonRegistrationText());
        Assertions.assertEquals("Уже есть профиль?", registrationPage.getLinkAlreadyHaveAccountText());
        Assertions.assertEquals("https://pass.rw.by/ru/registration/", registrationPage.getRegistrationPageUrl());
    }

    @Test
    public void checkLinkRulesAttributeHrefText() {
        Assertions.assertNotNull(registrationPage.getLinkRulesAttributeHrefText());
        Assertions.assertEquals("https://cms.rw.by/upload/order-rules-full-ru.pdf", registrationPage.getLinkRulesAttributeHrefText());
    }

    @Test
    public void checkLinkAlreadyHaveAccountOpenAuthorizationForm() {
        registrationPage.clickLinkAlreadyHaveAccountText();
        Assertions.assertTrue(registrationPage.isDisplayedModalWindowAuthorization());
    }

    @Test
    public void checkEmptyInputAndClickButtonRegistration() {
        registrationPage.clickButtonRegistration();
        Assertions.assertTrue(registrationPage.isDisplayedErrorMessageInputLastname());
        Assertions.assertTrue(registrationPage.isDisplayedErrorMessageInputFirstname());
        Assertions.assertTrue(registrationPage.isDisplayedErrorMessageInputEmail());
        Assertions.assertTrue(registrationPage.isDisplayedErrorMessageInputPassword());
        Assertions.assertTrue(registrationPage.isDisplayedErrorMessageInputRepeatPassword());
        Assertions.assertEquals("Заполните поле", registrationPage.getErrorMessageInputLastnameText());
        Assertions.assertEquals("Заполните поле", registrationPage.getErrorMessageInputFirstnameText());
        Assertions.assertEquals("Заполните поле", registrationPage.getErrorMessageInputEmailText());
        Assertions.assertEquals("Заполните поле", registrationPage.getErrorMessageInputPasswordText());
        Assertions.assertEquals("Заполните поле", registrationPage.getErrorMessageInputRepeatPasswordText());
    }
}
