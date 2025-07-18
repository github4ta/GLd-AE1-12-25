package by.vek.pages.smartphone;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartphonePage {

    private final WebDriver driver;

    public SmartphonePage() {
        driver = Driver.getDriver();
    }

    public void clickSmartphoneLink() {
        WebElement smartphoneLink = driver.findElement(By.xpath(SmartphoneLocator.BUTTON_SMARTPHONE));
        smartphoneLink.click();
    }

    public String getSmartphoneHeaderText(){
        WebElement smartphoneHeaderText = driver.findElement(By.xpath(SmartphoneLocator.HEADER_SMARTPHONE));
        return smartphoneHeaderText.getText();
    }

    public String getSmartphoneOrMobileText(){
        WebElement smartphoneOrMobileText = driver.findElement(By.xpath(SmartphoneLocator.TITLE_SMARTPHONE_OR_MOBILE));
        return smartphoneOrMobileText.getText();
    }

    public String getSmartphoneChooseText(){
        WebElement smartphoneChooseText = driver.findElement(By.xpath(SmartphoneLocator.TITLE_SMARTPHONE_CHOOSE));
        return smartphoneChooseText.getText();
    }
}
