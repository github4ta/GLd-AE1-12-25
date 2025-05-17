package education.tilda;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TildaPage {

    private final String HOME_PAGE_URL = "https://tilda.education/";
    private final String MAIL_TO_LINK = "//a[@href=\"mailto:team@tilda.ru\"]";

    private WebDriver driver;

    public TildaPage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get(HOME_PAGE_URL);
    }

    public String getMailToLinkText() {
        return driver.findElement(By.xpath(MAIL_TO_LINK)).getText();
    }
}
