package elements;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BaseElement {
    private final By locator;

    public BaseElement(By locator) {
        this.locator = locator;
    }

    public WebElement getElement() {
        return Browser.getDriver().findElement(locator);
    }

    public void clickOnElement() {
        getElement().click();
    }

    public boolean elementIsDisplayed() {
        return getElement().isDisplayed();
    }

    public List<WebElement> getListElements() {
        return getElement().findElements(locator);
    }

    public void enterValue(String value) {
        getElement().sendKeys(value);
    }
}
