package by.vek.pages;

import by.vek.driver.MyDriver;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = MyDriver.getDriver();
    }

    public void open() {
        driver.get( "https://www.21vek.by");
    }
}
