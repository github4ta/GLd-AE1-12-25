package aivkin.rw.by.pages.home.authorizationform;

public class AuthorizationFormLocator {
    public static final String TITLE_AUTHORIZATION = "//div[@class=\"auth-modal__title h3\"]";
    public static final String LABEL_LOGIN_OR_EMAIL = "//div[text()=\"Логин/E-mail\"]";
    public static final String INPUT_LOGIN_OR_EMAIL = "//input[@name=\"login\"]";
    public static final String LABEL_PASSWORD = "//div[text()=\"Пароль\"]";
    public static final String INPUT_PASSWORD = "//input[@name=\"password\"]";
    public static final String LINK_FORGOT_PASSWORD = "//a[@href=\"/ru/registration/pwd_restore/\"]";
    public static final String BUTTON_LOGIN = "//input[@class=\"btn btn-index btn_submit\"]";
    public static final String LABEL_LOGIN_WITH_SOCIAL_NETWORK = "//div[@class=\"auth-modal__social-title\"]";
    public static final String LABEL_NO_ACCOUNT = "//div[@class=\"auth-modal__caption\"]";
    public static final String LINK_REGISTRATION = "//a[@href=\"/ru/registration/\"]";
    public static final String ERROR_MESSAGE_INPUT_PASSWORD = "//label[@id=\"password-error\"]";
    public static final String ERROR_MESSAGE_INPUT_LOGIN_OR_EMAIL = "//label[@id=\"login-error\"]";
    public static final String ERROR_MESSAGE_LOGIN = "//div[@class=\"danger standalone\"]";
}
