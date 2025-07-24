package romanovska.rw.by.pages;

public class HomePage extends BasePage {
    public HomePage() {
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
        getWebElementFoundByLocatorAfterWait(Locators.DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX).click();
    }

    public void clickAcceptCookie() {
        getWebElementFoundByLocatorAfterWait(Locators.ACCEPT_COOKIE_BUTTON).click();
    }

    private static class Locators {
        private static final String ACCEPT_COOKIE_BUTTON = "//div[@class='cookies-popup__btns']//button[contains(@class,'mc-btn-all')]";
        private static final String DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX = "//div[@class='notification-modal__body']//label[*[contains(@class,'checkbox')]]";
    }
}
