package timoshenko.rw.by.pages.registration;

public class RegistrationLocators {
    public static final String TITLE_REGISTRATION = "//h1[text()='Регистрация']";
    public static final String COMMENT_CREATE_PROFILE = "//div[@class='text-content']//div[@class='registration__desc']";
    public static final String LABEL_CREDENTIAL = "//div[text()='%s']";
    public static final String COMMENT_CONFIRM_REGISTRATION = "//div[@class='registration__confirm']";
    public static final String BUTTON_REGISTRATION = "//button[@class='btn btn-default registration__submit']";
    public static final String LINK_REGISTRATION_ENTER = "//a[@class='registration__enter-link']";
    public static final String LINK_CONFIRM_REGISTRATION = "//a[@href='https://cms.rw.by/upload/order-rules-full-ru.pdf']";
    public static final String MESSAGE_SURNAME_ERROR = "//label[@id='lastName-error']";
    public static final String MESSAGE_NAME_ERROR = "//label[@id='firstName-error']";
    public static final String MESSAGE_EMAIL_ERROR = "//label[@id='login-error']";
    public static final String MESSAGE_PASSWORD_ERROR = "//label[@id='password-error']";
    public static final String MESSAGE_REPEAT_PASSWORD_ERROR = "//label[@id='password2-error']";
    public static final String INPUT_SURNAME = "//input[@id='lastName']";
    public static final String INPUT_NAME = "//input[@id='firstName']";
    public static final String INPUT_EMAIL = "//input[@id='login']";
    public static final String INPUT_PASSWORD = "//input[@id='password']";
    public static final String INPUT_REPEAT_PASSWORD = "//input[@id='password2']";
}
