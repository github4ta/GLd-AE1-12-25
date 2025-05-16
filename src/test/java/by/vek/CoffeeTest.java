package by.vek;

import by.vek.pages.VekPage;
import by.vek.pages.coffee.CoffeePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeTest extends BaseTest {

    private CoffeePage coffeePage;

    @BeforeEach
    public  void setup() {
        new VekPage().clickLinkCoffee();
    }

    @Test
    public void verifyCoffeeSection() {
        coffeePage = new CoffeePage();
        Assertions.assertTrue(coffeePage.isCoffeeHeaderDisplayed());
        Assertions.assertTrue(coffeePage.isCoffeeTypesDisplayed());
        Assertions.assertTrue(coffeePage.isCoffeeSelectionDisplayed());
    }
}
