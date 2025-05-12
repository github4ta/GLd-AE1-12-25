package elements;

import org.openqa.selenium.By;

public class Field extends BaseElement {
    public Field(By locator) {
        super(locator);
    }

    public void enterValueInField(String value) {
        this.enterValue(value);
    }
}
