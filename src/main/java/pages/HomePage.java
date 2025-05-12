package pages;

import elements.ButtonElement;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class HomePage extends BasePage {
    private final static ButtonElement accountButton = new ButtonElement(By.xpath("//span[@class='userToolsText']"));
    private final static ButtonElement acceptButton = new ButtonElement(By.xpath("//button[@class='Button-module__button Button-module__blue-primary']"));

    public HomePage() {
        super(By.xpath(""));
    }

    public void clickAcceptCookiesButton() {
        WaitUtils.waitForElements(condition -> acceptButton.elementIsDisplayed());
        acceptButton.clickOnElement();
    }

    public void clickOnAccountButton() {
        WaitUtils.waitForElements(condition -> accountButton.elementIsDisplayed());
        accountButton.clickOnElement();
    }
}
