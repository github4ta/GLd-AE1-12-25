package by.vek.pages.coffee;

import by.vek.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoffeePage {
    private  WebDriver driver;


    private final By coffeeHeader = By.xpath("//h1[contains(text(), 'Кофе')]");
    private final By coffeeTypes = By.xpath("//h2[contains(text(), 'Виды кофе')]");
    private final By coffeeSelection = By.xpath("//h2[contains(text(), 'Какой кофе выбрать')]");

    public CoffeePage() {
        this.driver = Driver.getDriver();
    }


    public boolean isCoffeeHeaderDisplayed() {
        return driver.findElement(coffeeHeader).isDisplayed();
    }

    public boolean isCoffeeTypesDisplayed() {
        return driver.findElement(coffeeTypes).isDisplayed();
    }

    public boolean isCoffeeSelectionDisplayed() {
        return driver.findElement(coffeeSelection).isDisplayed();
    }
}
