package evminova.rw.by.pages;

import evminova.rw.by.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private static final String CHECKBOX_SUBMIT_INFO_MESSAGE_TECH_WORKS = "//span[@class=\"checkbox-text\" and text()=\"Больше не показывать\"]";
    public static final String BUTTON_SUBMIT_COOKIE = "//button[@class=\"btn btn-default mc-btn-all\"]";

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get("https://pass.rw.by/ru/");
        try {
            closeTechWorksModal();
            clickCloseCookies();
        }catch (Exception e) {
        }
    }

    public void closeTechWorksModal() {
        driver.findElement(By.xpath(BUTTON_SUBMIT_COOKIE)).click();
    }

    public void clickCloseCookies() {
        driver.findElement(By.xpath(CHECKBOX_SUBMIT_INFO_MESSAGE_TECH_WORKS)).click();
    }
}
