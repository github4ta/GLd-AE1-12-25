package romanovska.rw.by.pages;

import romanovska.rw.by.AuthorizationModal;

public class RestoreLoginOrPasswordPage extends BasePage {
    public RestoreLoginOrPasswordPage() {
        super();
        URL = "https://pass.rw.by/ru/registration/pwd_restore/";
    }

    @Override
    public void open() {
        AuthorizationModal.clickForgotPasswordLink();
    }

    public static String getHeaderText() {
        return getWebElementFoundByLocatorAfterWait(Locators.HEADER_TITLE).getText();
    }

    public static String getRegistrationDescriptionText() {
        return getWebElementFoundByLocatorAfterWait(Locators.REGISTRATION_DESCRIPTION).getText();
    }

    public static String getEmailFieldNameText() {
        return getWebElementFoundByLocatorAfterWait(Locators.EMAIL_FIELD_NAME).getText();
    }

    public static String getSubmitButtonText() {
        return getWebElementFoundByLocatorAfterWait(Locators.SUBMIT_BUTTON).getText();
    }

    private static class Locators {
        public static final String HEADER_TITLE = "//h1";
        public static final String REGISTRATION_DESCRIPTION = "//div[@class='registration__desc']";
        public static final String RESTORE_FORM = "//form[@id='restore-form']";
        public static final String EMAIL_FIELD_NAME = RESTORE_FORM + "//div[@class='name']";
        public static final String SUBMIT_BUTTON = "//button[contains(@class,'btn_submit')]";
    }
}
