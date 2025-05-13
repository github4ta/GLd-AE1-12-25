package by.vek;

public class LoginLocator {
    public final static String SUBMIT_BUTTON_COOKIE = "//button[@class=\"Button-module__button Button-module__blue-primary\"]";
    public final static String LINK_ALL_ACTIONS = "//a[@href=\"/special_offers/promo.html\"]";
    public final static String ALL_ACTIONS_TITLE = "//h1[@class=\"style_title__c0jN1 Title-module__title Title-module__h1\"]";
    public final static String LEGAL_INFORMATION_BLOCK = "//div[@class=\"styles_legalInformationBlock__iXOVK\"]";
    public final static String BUTTON_USER_ACCOUNT = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
    public final static String TITLE_LOGIN_FORM = "//div[@class=\"LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold\"]";
    public final static String RADIO_BUTTON_EMAIL = "//input[@type='checkbox' and @checked]/following-sibling::span[contains(text(), 'Электронной почте')]/ancestor::label";
    public final static String BUTTON_LOGIN_SUBMIT = "//button[@data-testid=\"loginSubmit\"]";
    public final static String VALIDATION_ERROR_MESSAGE_EMAIL = "//span[contains(@class, 'message') and contains(., 'не указана')]";
    public final static String VALIDATION_ERROR_MESSAGE_PASSWORD = "//span[contains(@class, 'message') and contains(., 'Пароль')]";
    public final static String LINK_BUTTON_REGISTRATION_OR_RESET_PASSWORD = "//a[@class=\"LinkButton-module__wrapper LinkButton-module__tiny LinkButton-module__regular LinkButton-module__blue\"]";
}
