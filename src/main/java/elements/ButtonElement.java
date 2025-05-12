package elements;

import org.openqa.selenium.By;

public class ButtonElement extends BaseElement {
    public ButtonElement(By locator) {
        super(locator);
    }

    public void clickOnButton() {
        this.clickOnElement();
    }

    public boolean buttonIsDisplayed() {
        return this.elementIsDisplayed();
    }
}
