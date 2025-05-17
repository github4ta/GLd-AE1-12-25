package timoshenko.rw.by;

public class AuthorizationLocators {
    public final static String TITLE_AUTHORIZATION = "//div[@class='auth-modal__title h3']";
    public final static String COMMENT_LOGIN = "//div[text()='Логин/E-mail']";
    public final static String COMMENT_PASSWORD = "//div[text()='Пароль']";
    public final static String BUTTON_LOGIN = "//input[@class='btn btn-index btn_submit']";
    public final static String LINK_FORGOT_PASSWORD = "//a[@href='/ru/registration/pwd_restore/']";
    public final static String COMMENT_LOGIN_SOCIAL_MEDIA = "//div[@class='auth-modal__social-title']";
    public final static String COMMENT_NO_ACCOUNT = "//div[@class='auth-modal__caption']";
    public final static String LINK_REGISTRATION = "//a[@href='/ru/registration/']";
    public final static String FIELD_INPUT_LOGIN = "//input[@name='login']";
    public final static String FIELD_INPUT_PASSWORD = "//input[@name='password']";
    public final static String COMMENT_LOGIN_ERROR = "//label[@id='login-error']";
    public final static String COMMENT_PASSWORD_ERROR = "//label[@id='password-error']";
    public final static String COMMENT_USER_NOT_FOUND = "//div[@class='danger standalone']";
    public final static String COMMENT_INCORRECT_LOGIN_OR_PASSWORD = "//div[text()='Неверное имя пользователя или пароль']";
}
