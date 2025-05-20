package romanovska.rw.by;

import org.openqa.selenium.WebElement;

public class PassRwHomePage extends BasePage {
    private final static String PROFILE_BUTTON = "//a[*[contains(@class, 'profile')]]";
    private final static String ACCEPT_COOKIE_BUTTON = "//div[@class='cookies-popup__btns']//button[contains(@class,'mc-btn-all')]";
    private final static String DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX = "//div[@class='notification-modal__body']//label[*[contains(@class,'checkbox')]]";

    public PassRwHomePage() {
        super();
        URL = "https://pass.rw.by/";
    }

    @Override
    public void open() {
        super.open();

        try {
            clickDoNotShowAgain();
        } catch (Exception e) {
            System.out.println("Can't click 'Don't show again'");
        }

        try {
            clickAcceptCookie();
        } catch (Exception e) {
            System.out.println("Can't accept cookie");
        }
    }

    public void clickDoNotShowAgain() {
        getWebElementFoundByLocatorAfterWait(DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX).click();
    }

    private WebElement getAcceptCookieButton() {
        return getWebElementFoundByLocatorAfterWait(ACCEPT_COOKIE_BUTTON);
    }

    public void clickAcceptCookie() {
        getWebElementFoundByLocatorAfterWait(ACCEPT_COOKIE_BUTTON).click();
    }

    public void clickProfile() {
        getWebElementFoundByLocatorAfterWait(PROFILE_BUTTON).click();
    }

    public String getAuthorizationModalHeaderText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.HEADER_TITLE).getText();
    }

    public String getAuthorizationModalLoginOrEmailFieldNameText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_OR_EMAIL_FIELD_NAME).getText();
    }

    public String getAuthorizationModalPasswordFieldNameText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.PASSWORD_FIELD_NAME).getText();
    }

    public String getAuthorizationModalLoginButtonText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_BUTTON).getAttribute("value");
    }

    public String getAuthorizationModalForgotPasswordLinkText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.FORGOT_PASSWORD_LINK).getText();
    }

    public String getAuthorizationModalLoginViaSocialTitleText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_VIA_SOCIAL_TITLE).getText();
    }

    public String getAuthorizationModalNoAccountYetCaptionText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.NO_ACCOUNT_YET_CAPTION).getText();
    }

    public String getAuthorizationModalRegisterLinkText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.REGISTER_LINK).getText();
    }

    public void fillLoginOrEmailField(String loginOrEmail) {
        getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_OR_EMAIL_FIELD).sendKeys(loginOrEmail);
    }

    public void fillPasswordField(String password) {
        getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickLoginButton() {
        getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_BUTTON).click();
    }

    public String getAuthorizationModalLoginOrEmailErrorText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_OR_EMAIL_ERROR_LABEL).getText();
    }

    public String getAuthorizationModalPasswordErrorText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.PASSWORD_ERROR_LABEL).getText();
    }
}
