package romanovska.rw.by;

public class Header extends BaseObject {
    public final static String PROFILE_BUTTON = "//a[*[contains(@class, 'profile')]]";

    public void openAuthorizationModal() {
        getWebElementFoundByLocatorAfterWait(PROFILE_BUTTON).click();
    }

    public void openRestoreLoginOrPasswordPage() {
        getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.FORGOT_PASSWORD_LINK).click();
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
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.LOGIN_OR_EMAIL_ERROR_MESSAGE).getText();
    }

    public String getAuthorizationModalPasswordErrorText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.PASSWORD_ERROR_MESSAGE).getText();
    }

    public String getAuthorizationModalUserNotFoundErrorText() {
        return getWebElementFoundByLocatorAfterWait(AuthorizationModalLocators.USER_NOT_FOUND_ERROR_MESSAGE).getText();
    }
}
