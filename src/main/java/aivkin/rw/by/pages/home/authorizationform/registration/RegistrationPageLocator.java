package aivkin.rw.by.pages.home.authorizationform.registration;

public class RegistrationPageLocator {
    public static final String TITLE_REGISTRATION = "//h1";
    public static final String REGISTRATION_INFORMATION = "//div[@class=\"registration__desc\"]";
    public static final String LABEL_INPUT_LASTNAME = "//div[text()=\"Фамилия\"]";
    public static final String INPUT_LASTNAME = "//input[@id=\"lastName\"]";
    public static final String LABEL_INPUT_FIRSTNAME = "//div[text()=\"Имя\"]";
    public static final String INPUT_FIRSTNAME = "//input[@id=\"firstName\"]";
    public static final String LABEL_INPUT_EMAIL = "//div[text()=\"E-mail\"]";
    public static final String INPUT_EMAIL = "//input[@id=\"login\"]";
    public static final String LABEL_INPUT_PASSWORD = "//div[text()=\"Введите пароль\"]";
    public static final String INPUT_PASSWORD = "//input[@id=\"password\"]";
    public static final String LABEL_INPUT_REPEAT_PASSWORD = "//div[text()=\"Повторите пароль\"]";
    public static final String INPUT_REPEAT_PASSWORD = "//input[@id=\"password2\"]";
    public static final String REGISTRATION_INFORMATION_RULES = "//div[@class=\"registration__confirm\"]";
    public static final String LINK_RULES = "//a[@href=\"https://cms.rw.by/upload/order-rules-full-ru.pdf\"]";
    public static final String BUTTON_REGISTRATION = "//button[@class=\"btn btn-default registration__submit\"]";
    public static final String LINK_ALREADY_HAVE_ACCOUNT = "//a[@class=\"registration__enter-link\"]";
    public static final String MODAL_WINDOW_AUTHORIZATION = "//div[@class=\"auth-modal modal fade vertical-center in\"]";
    public static final String ERROR_MESSAGE_INPUT_LASTNAME = "//label[@id=\"lastName-error\"]";
    public static final String ERROR_MESSAGE_INPUT_FIRSTNAME = "//label[@id=\"firstName-error\"]";
    public static final String ERROR_MESSAGE_INPUT_EMAIL = "//label[@id=\"login-error\"]";
    public static final String ERROR_MESSAGE_INPUT_PASSWORD = "//label[@id=\"password-error\"]";
    public static final String ERROR_MESSAGE_INPUT_REPEAT_PASSWORD = "//label[@id=\"password2-error\"]";
}
