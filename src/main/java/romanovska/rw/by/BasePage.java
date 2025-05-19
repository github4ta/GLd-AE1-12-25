package romanovska.rw.by;

import by.vek.driver.Driver;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected String URL;

    protected WebDriver driver;

    protected BasePage() {
        this.driver = Driver.getDriver();
    }

    public void open() {
        driver.get(URL);
    }
}
