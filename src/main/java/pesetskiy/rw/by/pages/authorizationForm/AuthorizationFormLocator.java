package pesetskiy.rw.by.pages.authorizationForm;

public class AuthorizationFormLocator {
    public final static String TITLE_HEADER_AUTHORIZATION = "//div[@class='auth-modal__title h3']";
    public final static String TITLE_LABEL_LOGIN = "//div[contains(text(), 'Логин/E-mail')]";
    public final static String TITLE_LABEL_PASSWORD = "//div[contains(text(), 'Пароль')]";
    public final static String BUTTON_LOGIN = "//div[@class='form-group control-group']//input[@name='dologin']";
    public final static String TITLE_LINK_FORGOT_PASSWORD = "//a[@href=\"/ru/registration/pwd_restore/\"]";
    public final static String TITLE_LABEL_OTHER_LOGIN = "//div[@class=\"auth-modal__social-title\"]";
    public final static String TITLE_LABEL_NO_ACCOUNT = "//div[contains(text(), 'Нет аккаунта?')]";
    public final static String TITLE_LINK_REGISTRATION = "//a[@href=\"/ru/registration/\"]";
    public final static String TITLE_LABEL_NO_LOGIN = "//label[@id=\"login-error\"]";
    public final static String TITLE_LABEL_NO_PASSWORD = "//label[@id=\"password-error\"]";
    public final static String TITLE_LABEL_USER_NOT_FOUND = "//div[contains(text(), 'Пользователь не найден')]";
    public final static String TITLE_LABEL_INCORRECT_LOGIN_OR_PASSWORD = "//div[contains(text(), 'Неверное имя пользователя или пароль')]";
}
