package by.vek.pages.refrigerators;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.vek.pages.refrigerators.RefrigeratorsLocator.*;
public class RefrigeratorsPage {

    private WebDriver driver;

    public RefrigeratorsPage() {
        driver = Driver.getDriver();
    }

    public void clickLinkRefrigerators() {
        driver.findElement(By.xpath(LINK_REFRIGERATORS)).click();
    }

    public String getTitleRefrigeratorsPageText() {
        return driver.findElement(By.xpath(TITLE_REFRIGERATORS_PAGE)).getText();
    }

    public String getLinkFreezersText() {
        return driver.findElement(By.xpath(LINK_FREEZERS)).getText();
    }

    public String getLinkBuiltinRefrigeratorsText() {
        return driver.findElement(By.xpath(LINK_BUILTIN_REFRIGERATORS)).getText();
    }

    public String getLinkBagsRefrigeratorsText() {
        return driver.findElement(By.xpath(LINK_BAGS_REFRIGERATORS)).getText();
    }

    public String getLinkFreezersLariText() {
        return driver.findElement(By.xpath(LINK_FREEZERS_LARI)).getText();
    }

    public String getLinkSlateMagnetsText() {
        return driver.findElement(By.xpath(LINK_SLATE_MAGNETS)).getText();
    }
}
