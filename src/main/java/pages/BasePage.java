package pages;

import org.openqa.selenium.By;

public class BasePage {
    private final By locator;

    public BasePage(By locator) {
        this.locator = locator;
    }
}
