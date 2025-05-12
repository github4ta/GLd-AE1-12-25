package elements;

import org.openqa.selenium.By;

public class AlertElements extends BaseElement {
    public AlertElements(By locator) {
        super(locator);
    }

    public String getTitle() {
        return this.getElement().getText();
    }
}
