package by.vek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TVPage {

    private WebDriver driver;

    public TVPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTVCategoryHeaderButton() {
        WebElement tvCategoryHeaderButton = driver.findElement(By.xpath(TVLocator.TV_CATEGORY_HEADER_BUTTON));
        tvCategoryHeaderButton.click();
    }

    public String getTextTVPageTitle() {

        return driver.findElement(By.xpath(TVLocator.TV_PAGE_TITLE)).getText();
    }

    public boolean isCategoryContentTitlesContainText(String expectedText) {

        List<WebElement> titles = driver.findElements(By.xpath(TVLocator.TV_PAGE_CATEGORY_CONTENT_TITLE));

        boolean isTitleContainsExpectedText = false;

        for (WebElement title : titles) {
            if (title.getText().contains(expectedText)) {
                isTitleContainsExpectedText = true;
            }
        }

        return isTitleContainsExpectedText;
    }

    public boolean areTVPageItemsContainText(String expectedText) {
        List<WebElement> items = driver.findElements(By.xpath(TVLocator.TV_PAGE_ITEMS_CONTAINER));

        boolean isAllItemsContainExpectedText = true;

        for (WebElement item : items) {
            if (!item.getText().contains(expectedText)) {
                isAllItemsContainExpectedText = false;
            }
        }

        return isAllItemsContainExpectedText;
    }

    public void clickShowAllBrandsButton() {
        WebElement showAllBrandsButton = driver.findElement(By.xpath(TVLocator.TV_PAGE_SHOW_ALL_BRAND_BUTTON));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", showAllBrandsButton);
        showAllBrandsButton.click();
    }

    public void clickTVBrandFilter(String brandName) {

        List<WebElement> brandFilters = driver.findElements(By.xpath(TVLocator.TV_PAGE_BRAND_FILTER));

        for (WebElement filter : brandFilters) {
            if (filter.getText().contains(brandName)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filter);
                filter.click();
                break;
            }
        }
    }

}
