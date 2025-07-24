package kuleshov.rw.by;

import by.vek.driver.Driver;
import kuleshov.rw.by.pages.AuthorizationForm;
import kuleshov.rw.by.pages.Header;
import kuleshov.rw.by.pages.RegistrationPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationPageTest {

    private final String REGISTRATION_PAGE_TITLE_TEXT = "Регистрация";
    private final String INFORMATION_TEXT_BLOCK_TEXT = "Заполните свои личные данные, чтобы создать профиль. " +
            "Профиль будет действителен как для сайта Белорусской железной дороги, так и для мобильного приложения.";
    private final String LAST_NAME_FIELD_LABEL_TEXT = "Фамилия *";
    private final String FIRST_NAME_FIELD_LABEL_TEXT = "Имя *";
    private final String EMAIL_FIELD_LABEL_TEXT = "E-mail *";
    private final String PASSWORD_FIELD_LABEL_TEXT = "Введите пароль *";
    private final String PASSWORD_REQUIREMENT_TEXT_BLOCK_TEXT = "Пароль должен содержать не менее 6 символов " +
            "(в любом сочетании заглавные или строчные латинские буквы и цифры," +
            " также можно вводить следующие символы: !._-%()-?[]~)";
    private final String REPEAT_PASSWORD_FIELD_LABEL_TEXT = "Повторите пароль *";
    private final String RULES_OF_PAYMENT_TEXT_BLOCK_TEXT = "Продолжая, Вы подтверждаете," +
            " что ознакомлены с Правилами оформления и оплаты проезда";
    private final String SUBMIT_REGISTRATION_BUTTON_TEXT = "ЗАРЕГИСТРИРОВАТЬСЯ";
    private final String HAS_PROFILE_LINK_TEXT = "Уже есть профиль?";
    private final String RULES_OF_PAYMENT_TEXT_LINK_URI = "https://cms.rw.by/upload/order-rules-full-ru.pdf";
    private final String EMPTY_FIELD_ERROR_MESSAGE_TEXT = "Заполните поле";
    private final String INVALID_EMAIL_FORMAT_ERROR_MESSAGE_TEXT = "Некорректно заполнен email";
    private final String NOT_REQUIRED_PASSWORD_ERROR_MESSAGE_TEXT = "Введите пароль согласно правил";
    private final String LESS_THEN_MINIMUM_PASSWORD_LENGTH_ERROR_MESSAGE_TEXT = "Минимум 6 символов";
    private final String PASSWORD_DOES_NOT_MATCH_ERROR_MESSAGE_TEXT = "Пароли не совпадают";

    private RegistrationPage registrationPage;

    @BeforeEach
    public void setup() {
        new BasePage().openHomePage();
        registrationPage = new Header().clickOwnCabinetButton().clickRegistrationButton();
    }

    @Test
    public void testVerifyRedirectToCorrectURL() {
        assertEquals("https://pass.rw.by/ru/registration/", Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testRegistrationPageUIElementsText() {
        assertAll(
                () -> assertEquals(REGISTRATION_PAGE_TITLE_TEXT, registrationPage.getTextPageTitle()),
                () -> assertEquals(INFORMATION_TEXT_BLOCK_TEXT, registrationPage.getTextInformationTextBlock()),
                () -> assertEquals(LAST_NAME_FIELD_LABEL_TEXT, registrationPage.getTextLastNameFieldLabel()),
                () -> assertEquals(FIRST_NAME_FIELD_LABEL_TEXT, registrationPage.getTextFirstNameFieldLabel()),
                () -> assertEquals(EMAIL_FIELD_LABEL_TEXT, registrationPage.getTextEmailFieldLabel()),
                () -> assertEquals(PASSWORD_FIELD_LABEL_TEXT, registrationPage.getTextPasswordFieldLabel()),
                () -> assertEquals(
                        PASSWORD_REQUIREMENT_TEXT_BLOCK_TEXT,
                        registrationPage.getTextPasswordRequirementTextBlock()
                ),
                () -> assertEquals(REPEAT_PASSWORD_FIELD_LABEL_TEXT, registrationPage.getTextRepeatPasswordFieldLabel()),
                () -> assertEquals(RULES_OF_PAYMENT_TEXT_BLOCK_TEXT, registrationPage.getTextRulesOfPaymentTextBlock()),
                () -> assertEquals(SUBMIT_REGISTRATION_BUTTON_TEXT, registrationPage.getTextSubmitRegistrationButton()),
                () -> assertEquals(HAS_PROFILE_LINK_TEXT, registrationPage.getTextHasProfileLink())
        );
    }

    @Test
    public void testIsRulesOfPaymentLinkContainCorrectUri() {
        assertEquals(RULES_OF_PAYMENT_TEXT_LINK_URI, registrationPage.getBaseURIAttributeRulesOfPaymentLink());
    }

    @Test
    public void testClickHasProfileLink() {
        registrationPage.clickHasProfileLink();

        AuthorizationForm authorizationForm = new AuthorizationForm();
        authorizationForm.waitUntilAuthorizationFormIsDisplayed();
        assertTrue(authorizationForm.isAuthorizationModalWindowDisplayed());
    }

    @Test
    public void testAllEmptyFieldsValidationText() {
        registrationPage.clickSubmitRegistrationButton();

        assertAll(
                () -> assertEquals(EMPTY_FIELD_ERROR_MESSAGE_TEXT, registrationPage.getTextLastNameFieldErrorMessage()),
                () -> assertEquals(EMPTY_FIELD_ERROR_MESSAGE_TEXT, registrationPage.getTextFirstNameFieldErrorMessage()),
                () -> assertEquals(EMPTY_FIELD_ERROR_MESSAGE_TEXT, registrationPage.getTextEmailFieldErrorMessage()),
                () -> assertEquals(EMPTY_FIELD_ERROR_MESSAGE_TEXT, registrationPage.getTextPasswordFieldErrorMessage()),
                () -> assertEquals(
                        EMPTY_FIELD_ERROR_MESSAGE_TEXT,
                        registrationPage.getTextRepeatPasswordFieldErrorMessage()
                )
        );
    }

    @Test
    public void testInvalidEmailValueValidationText() {
        registrationPage.sendKeysEmailFieldInput("email");
        registrationPage.clickSubmitRegistrationButton();

        assertEquals(INVALID_EMAIL_FORMAT_ERROR_MESSAGE_TEXT, registrationPage.getTextEmailFieldErrorMessage());
    }

    @Test
    public void testNotRequiredPasswordValueValidationText() {
        registrationPage.sendKeysPasswordFieldInput("123");
        registrationPage.sendKeysRepeatPasswordFieldInput("123");
        registrationPage.clickSubmitRegistrationButton();

        assertEquals(NOT_REQUIRED_PASSWORD_ERROR_MESSAGE_TEXT, registrationPage.getTextPasswordFieldErrorMessage());
        assertEquals(NOT_REQUIRED_PASSWORD_ERROR_MESSAGE_TEXT, registrationPage.getTextRepeatPasswordFieldErrorMessage());
    }

    @Test
    public void testLessThenMinimumLengthPasswordValueValidationText() {
        registrationPage.sendKeysPasswordFieldInput("Abc1");
        registrationPage.sendKeysRepeatPasswordFieldInput("Abc1");

        assertEquals(
                LESS_THEN_MINIMUM_PASSWORD_LENGTH_ERROR_MESSAGE_TEXT,
                registrationPage.getTextPasswordFieldErrorMessage()
        );
        assertEquals(
                LESS_THEN_MINIMUM_PASSWORD_LENGTH_ERROR_MESSAGE_TEXT,
                registrationPage.getTextRepeatPasswordFieldErrorMessage()
        );
    }

    @Test
    public void testMismatchedPasswordValueValidationText() {
        registrationPage.sendKeysPasswordFieldInput("Abc123!");
        registrationPage.sendKeysRepeatPasswordFieldInput("Abc1234!");
        registrationPage.clickSubmitRegistrationButton();

        assertEquals(
                PASSWORD_DOES_NOT_MATCH_ERROR_MESSAGE_TEXT,
                registrationPage.getTextRepeatPasswordFieldErrorMessage()
        );
    }

    @AfterEach
    public void closeDriver() {
        Driver.quit();
    }
}
