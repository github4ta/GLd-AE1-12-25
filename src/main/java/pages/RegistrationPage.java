package pages;

import elements.AlertElements;
import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {
    private final static AlertElements registrationTitle = new AlertElements(By.xpath("//h5[contains(@class, 'formTitle')]"));

    public RegistrationPage() {
        super(By.xpath(""));
    }

    public boolean compareTitle(String title) {
        return registrationTitle.getTitle().equals(title);
    }

}
