package by.vek.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyDriver {
    private static WebDriver driver;

    private MyDriver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
