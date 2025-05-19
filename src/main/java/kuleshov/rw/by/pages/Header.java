package kuleshov.rw.by.pages;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    private final By OWN_CABINET_BUTTON = By.xpath("//li[@class=\"item_1 cabinet\"]");

    protected WebDriver driver;

    public Header() {
        driver = Driver.getDriver();
    }

    public AuthorizationForm clickOwnCabinetButton() {
        driver.findElement(OWN_CABINET_BUTTON).click();

        return new AuthorizationForm();
    }
}
