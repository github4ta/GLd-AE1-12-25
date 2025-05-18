package timoshenko.rw.by.pages.authorization;

public class AuthorizationLocators {
    public final static String TITLE_AUTHORIZATION = "//div[@class='auth-modal__title h3']";//div[text()='Авторизация']
    public final static String LABEL_INPUT = "//div[text()='%s']";
    public final static String BUTTON_LOGIN = "//div[@class='form-group control-group']//input[@name='dologin']";
    public final static String LINK_FORGOT_PASSWORD = "//a[@href='/ru/registration/pwd_restore/']";
    public final static String COMMENT_OTHER_LOGIN = "//div[@class='auth-modal__%s']";
    public final static String LINK_REGISTRATION = "//a[@href='/ru/registration/']";
    public final static String INPUT_LOGIN = "//input[@name='login']";
    public final static String INPUT_PASSWORD = "//input[@name='password']";
    public final static String MESSAGE_LOGIN_ERROR = "//label[@id='login-error']";
    public final static String MESSAGE_PASSWORD_ERROR = "//label[@id='password-error']";
    public final static String COMMENT_USER_NOT_FOUND = "//div[@class='danger standalone']";
    public final static String COMMENT_INCORRECT_LOGIN_OR_PASSWORD = "//div[text()='Неверное имя пользователя или пароль']";
}
