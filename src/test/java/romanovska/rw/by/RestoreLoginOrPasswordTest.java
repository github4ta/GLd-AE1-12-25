package romanovska.rw.by;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import romanovska.rw.by.pages.RestoreLoginOrPasswordPage;

public class RestoreLoginOrPasswordTest {
    private final String HEADER_TEXT_CORRECT = "Восстановление логина или пароля";
    private final String REGISTRATION_DESCRIPTION_TEXT_CORRECT = "Введите адрес электронной почты, который был указан при регистрации. На него будет выслан Ваш логин и новый пароль.";
    private final String EMAIL_FIELD_NAME_TEXT_CORRECT = "E-mail";
    private final String SUMBIT_BUTTON_TEXT_CORRECT = "Восстановить".toUpperCase();

    private final String URL_CORRECT_TEXT = "https://pass.rw.by/ru/registration/pwd_restore/";

    @BeforeEach
    public void openRestoreLoginOrPasswordPage() {
        TestUtils.openRestoreLoginOrPasswordPage();
    }

    @Test
    public void testUrl() {
        Assertions.assertEquals(URL_CORRECT_TEXT, BaseObject.getCurrentUrl());
    }

    @Test
    public void testContent() {
        Assertions.assertEquals(HEADER_TEXT_CORRECT, RestoreLoginOrPasswordPage.getHeaderText());
        Assertions.assertEquals(REGISTRATION_DESCRIPTION_TEXT_CORRECT, RestoreLoginOrPasswordPage.getRegistrationDescriptionText());
        Assertions.assertEquals(EMAIL_FIELD_NAME_TEXT_CORRECT, RestoreLoginOrPasswordPage.getEmailFieldNameText());
        Assertions.assertEquals(SUMBIT_BUTTON_TEXT_CORRECT, RestoreLoginOrPasswordPage.getSubmitButtonText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
