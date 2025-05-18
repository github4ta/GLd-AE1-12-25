package evminova.rw.by.pages.registration;

public class RegistrationLocators {
    public static final String FIELD_NAME_LOGIN = "//div[@class=\"name\" and text()=\"Логин/E-mail\"]";
    public static final String INPUT_FIELD_LOGIN = "//input[@name=\"login\"]";
    public static final String FIELD_NAME_PASSWORD = "//div[@class=\"name\" and text()=\"Пароль\"]";
    public static final String INPUT_FIELD_PASSWORD = "//input[@name=\"password\"]";
    public static final String LINK_REGISTRATION_RESTORE = "//a[@href=\"/ru/registration/pwd_restore/\"]";
    public static final String BUTTON_SUBMIT = "//input[@name=\"dologin\"]";
    public static final String TITLE_SOCIAL_LIST = "//div[@class=\"auth-modal__social-title\" and text()=\"Войти с помощью соцсетей:\"]";
    public static final String LINK_VK = "//a[@href=\"http://oauth.vk.com/authorize?client_id=7017287&response_type=code&redirect_uri=https://pass.rw.by/ru/registration/VK/\"]";
    public static final String LINK_FB = "//a[@href=\"https://www.facebook.com/dialog/oauth?client_id=848051612233581&response_type=code&redirect_uri=https://pass.rw.by/ru/registration/FB/\"]";
    public static final String LINK_OK = "//a[@href=\"http://www.odnoklassniki.ru/oauth/authorize?client_id=1279463424&response_type=code&redirect_uri=https://pass.rw.by/ru/registration/OK/\"]";
    public static final String TITLE_NO_ACCOUNT = "//div[@class=\"auth-modal__caption\" and text()=\"Нет аккаунта? \"]";
    public static final String LINK_REGISTRATION = "//a[@href=\"/ru/registration/\"]";
}
