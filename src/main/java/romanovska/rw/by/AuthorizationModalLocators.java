package romanovska.rw.by;

public class AuthorizationModalLocators {
    public static final String HEADER_TITLE = "//div[contains(@class,'auth-modal__title h3')]";
    public static final String LOGIN_OR_EMAIL_FIELD = "//input[@name='login']";
    public static final String LOGIN_OR_EMAIL_FIELD_NAME = LOGIN_OR_EMAIL_FIELD + "/ancestor::label//div[@class='name']";
    public static final String PASSWORD_FIELD = "//input[@name='password']";
    public static final String PASSWORD_FIELD_NAME = PASSWORD_FIELD + "/ancestor::label//div[@class='name']";
    public static final String LOGIN_BUTTON = "//input[@name='dologin']";
    public static final String FORGOT_PASSWORD_LINK = "//a[contains(@href,'/registration/pwd_restore/')]";
    public static final String LOGIN_VIA_SOCIAL_TITLE = "//div[@class='auth-modal__social-title']";
    public static final String NO_ACCOUNT_YET_CAPTION = "//div[@class='auth-modal__caption']";
    public static final String REGISTER_LINK = NO_ACCOUNT_YET_CAPTION + "//a[contains(@href,'registration/')]";
    public static final String LOGIN_OR_EMAIL_ERROR_MESSAGE = "//label[@id='login-error']";
    public static final String PASSWORD_ERROR_MESSAGE = "//label[@id='password-error']";
    public static final String USER_NOT_FOUND_ERROR_MESSAGE = "//div[@class='danger standalone']";
}
