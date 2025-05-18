package aivkin.rw.by;

import aivkin.rw.by.pages.home.HomePage;
import aivkin.rw.by.pages.home.authorizationform.AuthorizationFormLocator;
import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WithAuthorizationSetupTest extends HomeTest{

    protected void openAuthorizationForm() {
        new HomePage().clickButtonPersonalAccount();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AuthorizationFormLocator.TITLE_AUTHORIZATION)));
    }
}
