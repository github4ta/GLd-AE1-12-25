package aivkin.rw.by.pages.home;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage() { driver = Driver.getDriver(); }

    public void openHomePage() {
        driver.get("https://pass.rw.by/ru/");
        try {
            closeModalWindow();
        } catch (Exception ignored) {

        }
        try {
            closeCookie();
        } catch (Exception ignored) {

        }
    }

    private void closeModalWindow() {
        driver.findElement(By.xpath(HomePageLocator.BUTTON_CLOSE_MODAL_WINDOW)).click();
    }

    private void closeCookie() {
        driver.findElement(By.xpath(HomePageLocator.BUTTON_SUBMIT_COOKIE)).click();
    }

    public void clickButtonPersonalAccount() {
        driver.findElement(By.xpath(HomePageLocator.BUTTON_PERSONAL_ACCOUNT)).click();
    }
}
