package pages;

import elements.AlertElements;
import elements.ButtonElement;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import java.util.List;
import java.util.stream.Collectors;

public class LoginPage extends BasePage {

    private final static ButtonElement enterButton = new ButtonElement(By.xpath("//div[@class='Button-module__buttonText']/span"));
    private final static ButtonElement continueButton = new ButtonElement(By.xpath("//button[@data-testid='loginSubmit']"));
    private final static AlertElements errorAlerts = new AlertElements(By.xpath("//span[@class='ErrorMessage-module__message']"));
    private final static Field emailField = new Field(By.xpath("//input[@data-testid='login-form-email']"));
    private final static Field passwordField = new Field(By.xpath("//input[@type='password']"));
    private final static ButtonElement registrationButton = new ButtonElement(By.xpath("//div[contains(@class, 'EmailLoginForm_bottom')]/div/button"));

    public LoginPage() {
        super(By.xpath("//span[@class='userToolsText']"));
    }

    public void clickEnterButton() {
        WaitUtils.waitForElements(condition -> enterButton.elementIsDisplayed());
        enterButton.clickOnElement();
    }

    public void clickContinueButton() {
        WaitUtils.waitForElements(condition -> continueButton.buttonIsDisplayed());
        continueButton.clickOnButton();
    }

    public List<String> getErrorMessages() {
        WaitUtils.waitForElements(condition -> errorAlerts.elementIsDisplayed());
        return errorAlerts.getListElements().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void enterEmail(String email) {
        WaitUtils.waitForElements(condition -> emailField.elementIsDisplayed());
        emailField.enterValueInField(email);
    }

    public void enterPassword(String password) {
        passwordField.enterValueInField(password);
    }

    public void clickRegistrationButton() {
        WaitUtils.waitForElements(condition -> registrationButton.buttonIsDisplayed());
        registrationButton.clickOnButton();
    }
}