package romanovska.rw.by.pages;

import org.openqa.selenium.By;
import romanovska.rw.by.AuthorizationModal;

public class RestoreLoginOrPasswordPage extends BasePage {
    public RestoreLoginOrPasswordPage() {
        super();
        URL = "https://pass.rw.by/ru/registration/pwd_restore/";
    }

    @Override
    public void open() {
        AuthorizationModal.clickForgotPasswordLink();
    }

    public static String getHeaderText() {
        System.out.println(driver.findElement(By.xpath(Locators.HEADER_TITLE)).getText());
        return getWebElementFoundByLocatorAfterWait(Locators.HEADER_TITLE).getText();
    }

    private static class Locators {
        public static final String HEADER_TITLE = "//h1";
    }
}
