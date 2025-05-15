package by.vek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsPage {
    private WebDriver driver;
    private final String url;

    public DetailsPage(WebDriver driver) {
        this.driver = driver;
        url = "https://www.21vek.by/company/details.html";
    }

    public String getUrl() {
        return url;
    }

    public void clickAnchorDetails() {
        driver.findElement(By.xpath(DetailsLocator.ANCHOR_DETAILS)).click();
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
        WebElement submitButtonCookie = driver.findElement(By.xpath(DetailsLocator.SUBMIT_BUTTON_COOKIE));
        submitButtonCookie.click();
    }
}
