package romanovska.rw.by;

public class AuthorizationModal extends BaseObject {
    private final static String PROFILE_BUTTON = "//a[*[contains(@class, 'profile')]]";

    public AuthorizationModal() {
        super();
    }

    @Override
    protected void open() {
        getWebElementFoundByLocatorAfterWait(PROFILE_BUTTON).click();
    }

    public static String getHeaderText() {
        return getWebElementFoundByLocatorAfterWait(Locators.HEADER_TITLE).getText();
    }

    public static String getLoginOrEmailFieldNameText() {
        return getWebElementFoundByLocatorAfterWait(Locators.LOGIN_OR_EMAIL_FIELD_NAME).getText();
    }

    public static String getPasswordFieldNameText() {
        return getWebElementFoundByLocatorAfterWait(Locators.PASSWORD_FIELD_NAME).getText();
    }

    public static String getLoginButtonText() {
        return getWebElementFoundByLocatorAfterWait(Locators.LOGIN_BUTTON).getAttribute("value");
    }

    public static String getForgotPasswordLinkText() {
        return getWebElementFoundByLocatorAfterWait(Locators.FORGOT_PASSWORD_LINK).getText();
    }

    public static String getLoginViaSocialTitleText() {
        return getWebElementFoundByLocatorAfterWait(Locators.LOGIN_VIA_SOCIAL_TITLE).getText();
    }

    public static String getNoAccountYetCaptionText() {
        return getWebElementFoundByLocatorAfterWait(Locators.NO_ACCOUNT_YET_CAPTION).getText();
    }

    public static String getRegisterLinkText() {
        return getWebElementFoundByLocatorAfterWait(Locators.REGISTER_LINK).getText();
    }

    public static void fillLoginOrEmailField(String loginOrEmail) {
        getWebElementFoundByLocatorAfterWait(Locators.LOGIN_OR_EMAIL_FIELD).sendKeys(loginOrEmail);
    }

    public static void fillPasswordField(String password) {
        getWebElementFoundByLocatorAfterWait(Locators.PASSWORD_FIELD).sendKeys(password);
    }

    public static void clickLoginButton() {
        getWebElementFoundByLocatorAfterWait(Locators.LOGIN_BUTTON).click();
    }

    public static String getLoginOrEmailErrorText() {
        return getWebElementFoundByLocatorAfterWait(Locators.LOGIN_OR_EMAIL_ERROR_MESSAGE).getText();
    }

    public static String getPasswordErrorText() {
        return getWebElementFoundByLocatorAfterWait(Locators.PASSWORD_ERROR_MESSAGE).getText();
    }

    public static String getUserNotFoundErrorText() {
        return getWebElementFoundByLocatorAfterWait(Locators.USER_NOT_FOUND_ERROR_MESSAGE).getText();
    }

    public static void clickForgotPasswordLink() {
        getWebElementFoundByLocatorAfterWait(Locators.FORGOT_PASSWORD_LINK).click();
    }

    private static class Locators {
        private static final String HEADER_TITLE = "//div[contains(@class,'auth-modal__title h3')]";
        private static final String LOGIN_OR_EMAIL_FIELD = "//input[@name='login']";
        private static final String LOGIN_OR_EMAIL_FIELD_NAME = LOGIN_OR_EMAIL_FIELD + "/ancestor::label//div[@class='name']";
        private static final String PASSWORD_FIELD = "//input[@name='password']";
        private static final String PASSWORD_FIELD_NAME = PASSWORD_FIELD + "/ancestor::label//div[@class='name']";
        private static final String LOGIN_BUTTON = "//input[@name='dologin']";
        private static final String FORGOT_PASSWORD_LINK = "//a[contains(@href,'/registration/pwd_restore/')]";
        private static final String LOGIN_VIA_SOCIAL_TITLE = "//div[@class='auth-modal__social-title']";
        private static final String NO_ACCOUNT_YET_CAPTION = "//div[@class='auth-modal__caption']";
        private static final String REGISTER_LINK = NO_ACCOUNT_YET_CAPTION + "//a[contains(@href,'registration/')]";
        private static final String LOGIN_OR_EMAIL_ERROR_MESSAGE = "//label[@id='login-error']";
        private static final String PASSWORD_ERROR_MESSAGE = "//label[@id='password-error']";
        private static final String USER_NOT_FOUND_ERROR_MESSAGE = "//div[@class='danger standalone']";
    }
}
