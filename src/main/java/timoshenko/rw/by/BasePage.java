package timoshenko.rw.by;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    private static final String INFO_MODAL_CHECKBOX_LOCATOR = "//div[@class='jq-checkbox__div']";
    private static final String SUBMIT_BUTTON_COOKIE_LOCATOR = "//button[@class='btn btn-default mc-btn-all']";

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.getDriver();
    }

    public void open(){
        driver.get("https://pass.rw.by/ru/ ");
        try {
            clickCloseModalCheckbox();
            clickCloseCookie();
        } catch (Exception e) {
        }
    }

    public void clickCloseModalCheckbox(){
        driver.findElement(By.xpath(INFO_MODAL_CHECKBOX_LOCATOR)).click();
    }

    public void clickCloseCookie(){
        driver.findElement(By.xpath(SUBMIT_BUTTON_COOKIE_LOCATOR)).click();
    }
}
