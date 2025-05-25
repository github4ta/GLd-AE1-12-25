package pesetskiy.rw.by.pages.authorizationForm;

public class AuthorizationFormLocator {

    public static final String BUTTON_ACCEPT_COOKIE = "//button[@class=\"btn btn-default mc-btn-all\"]";
    public static final String BUTTON_CABINET = "//li[@class=\"item_1 cabinet\"]";
    public static final String AUTHORIZATION_MODAL_WINDOW = "//*[@id=\"auth-popup\"]//div[@class=\"modal-content\"]";
    public static final String TITLE_HEADER_AUTHORIZATION = "//div[@class='auth-modal__title h3']";
    public static final String TITLE_LABEL_LOGIN = "//div[contains(text(), 'Логин/E-mail')]";
    public static final String TITLE_LABEL_PASSWORD = "//div[contains(text(), 'Пароль')]";
    public static final String BUTTON_LOGIN = "//input[@class=\"btn btn-index btn_submit\"]";
    public static final String TITLE_LINK_FORGOT_PASSWORD = "//a[@href=\"/ru/registration/pwd_restore/\"]";
    public static final String TITLE_LABEL_OTHER_LOGIN = "//div[@class=\"auth-modal__social-title\"]";
    public static final String TITLE_LABEL_NO_ACCOUNT = "//div[contains(text(), 'Нет аккаунта?')]";
    public static final String TITLE_LINK_REGISTRATION = "//a[@href=\"/ru/registration/\"]";
    public static final String TITLE_LABEL_NO_LOGIN = "//label[@id=\"login-error\"]";
    public static final String TITLE_LABEL_NO_PASSWORD = "//label[@id=\"password-error\"]";
    public static final String TITLE_LABEL_USER_NOT_FOUND = "//div[contains(text(), 'Пользователь не найден')]";
    public static final String TITLE_LABEL_INCORRECT_LOGIN_OR_PASSWORD = "//div[contains(text(), 'Неверное имя пользователя или пароль')]";
}
