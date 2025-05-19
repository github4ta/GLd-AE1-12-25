package evminova.rw.by.pages.homepage;

import evminova.rw.by.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get("https://pass.rw.by/ru/");
        try {
            clickTechWorksModal();
            clickCloseCookies();
        } catch (Exception e) {
        }
    }

    public void clickTechWorksModal() {
        driver.findElement(By.xpath(HomePageLocator.CHECKBOX_SUBMIT_INFO_MESSAGE_TECH_WORKS)).click();
    }

    public void clickCloseCookies() {
        driver.findElement(By.xpath(HomePageLocator.BUTTON_SUBMIT_COOKIE)).click();
    }

    public void clickButtonCabinet() {
        WebElement buttonCabinet = driver.findElement(By.xpath(HomePageLocator.BUTTON_CABINET));
        buttonCabinet.click();
    }
}
