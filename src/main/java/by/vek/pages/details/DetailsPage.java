package by.vek.pages.details;

import by.vek.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetailsPage {
    private WebDriver driver;
    private final String url;
    private static Actions actions;

    public DetailsPage() {
        this.driver = MyDriver.getDriver();
        url = "https://www.21vek.by/company/details.html";
        actions = new Actions(MyDriver.getDriver());
    }

    public String getUrl() {
        return url;
    }

    public void clickAnchorDetails() {
        WebDriverWait wait = new WebDriverWait(MyDriver.getDriver(), Duration.ofSeconds(10));

        WebElement temp = wait.until(ExpectedConditions.elementToBeClickable(getAnchorDetailsElement()));
        actions.scrollToElement(temp).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(temp));
        actions.scrollToElement(temp).moveToElement(temp).build().perform();
        temp.click();
    }

    public WebElement getAnchorDetailsElement() {
        return driver.findElement(By.xpath(DetailsLocator.ANCHOR_DETAILS));
    }

    public String getHeaderDetailsText() {
        return driver.findElement(By.xpath(DetailsLocator.HEADER_DETAILS)).getText();
    }

    public String getParagraphDetailsText() {
        return driver.findElement(By.xpath(DetailsLocator.PARAGRAPH_DETAILS)).getText();
    }

    public void clickSubmitButtonCookie() {
        WebElement submitButtonCookie = driver.findElement(By.xpath(DetailsLocator.BUTTON_SUBMIT_COOKIE));
        submitButtonCookie.click();
    }

    public void openBasePage() {
        driver.get("https://www.21vek.by/");
    }
}
