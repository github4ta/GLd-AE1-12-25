package by.vek.pages.vacuum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.vek.pages.vacuum.VacuumLocator.*;

public class VacuumPage {

    private WebDriver driver;

    public VacuumPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitButtonCookie() {
        driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE)).click();
    }

    public void clickCatalogCategory() {
        driver.findElement(By.xpath(CATALOG_CATEGORY)).click();
    }

    public void clickCategoryVacuum() {
        driver.findElement(By.xpath(CATEGORY_VACUUM_LINK)).click();
    }

    public String getTitleVacuumText(){
       return driver.findElement(By.xpath(TITLE_VACUUM)).getText();
    }

    public String getVacuumAttachmentsText(){
        return driver.findElement(By.xpath(VACUUM_ATTACHMENTS_LINK)).getText();
    }

    public String getVacuumFiltersBagsText(){
        return driver.findElement(By.xpath(VACUUM_FILTERS_BAGS_LINK)).getText();
    }

    public String getVacuumAccessoriesText(){
        return driver.findElement(By.xpath(VACUUM_ACCESSORIES_LINK)).getText();
    }
}
