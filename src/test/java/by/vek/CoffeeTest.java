package by.vek;

import by.vek.driver.Driver;
import by.vek.pages.BasePage;
import by.vek.pages.coffee.CoffeePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CoffeeTest {
    private CoffeePage coffeePage;

    @BeforeEach
    public  void setup() {
        // driver.get( "https://www.21vek.by");
        BasePage bp = new BasePage();
        bp.open();
        coffeePage = new CoffeePage();
    }

    @Test
    public void verifyCoffeeSection() {
        Assert.assertTrue(coffeePage.isCoffeeHeaderDisplayed());
        Assert.assertTrue(coffeePage.isCoffeeTypesDisplayed());
        Assert.assertTrue(coffeePage.isCoffeeSelectionDisplayed());
    }

    @AfterEach
    public void tearDown() {
        // driver.quit();
        Driver.quit();
    }
}
