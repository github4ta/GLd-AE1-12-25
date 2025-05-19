package romanovska.rw.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PassRwHomePage extends BasePage {
    private final static String PROFILE_BUTTON = "//a[*[contains(@class, 'profile')]]";
    private final static String ACCEPT_COOKIE_BUTTON = "//div[@class='cookies-popup__btns']//button[contains(@class,'mc-btn-all')]";
    private final static String DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX = "//div[@class='notification-modal__body']//label[*[contains(@class,'checkbox')]]";

    WebDriverWait wait;

    private static AuthorizationModal authorizationModal;

    public PassRwHomePage() {
        super();
        URL = "https://pass.rw.by/";

        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    @Override
    public void open() {
        super.open();

        try {
            wait.until(ExpectedConditions.elementToBeClickable(getDoNotShowAgainNotificationCheckbox()));

            clickDoNotShowAgain();
        } catch (Exception e) {
            System.out.println("Can't click 'Don't show again'");
        }

        try {
            wait.until(ExpectedConditions.elementToBeClickable(getAcceptCookieButton()));

            clickAcceptCookie();
        } catch (Exception e) {
            System.out.println("Can't accept cookie");
        }
    }

    private WebElement getDoNotShowAgainNotificationCheckbox() {
        return driver.findElement(By.xpath(DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX));
    }

    public void clickDoNotShowAgain() {
        driver.findElement(By.xpath(DO_NOT_SHOW_AGAIN_NOTIFICATION_CHECKBOX)).click();
    }

    private WebElement getAcceptCookieButton() {
        return driver.findElement(By.xpath(ACCEPT_COOKIE_BUTTON));
    }

    public void clickAcceptCookie() {
        driver.findElement(By.xpath(ACCEPT_COOKIE_BUTTON)).click();
    }

    public void clickProfile() {
        driver.findElement(By.xpath(PROFILE_BUTTON)).click();
        authorizationModal = new AuthorizationModal();
    }

    public String getAuthorizationModalHeaderText() {
        System.out.println("хоумпейдж отправяет: "+authorizationModal.getHeaderText(driver));
        return authorizationModal.getHeaderText(driver);
    }
}
