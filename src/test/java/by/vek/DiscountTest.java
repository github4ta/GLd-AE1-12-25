package by.vek;

import by.vek.driver.Driver;
import by.vek.pages.BasePage;
import by.vek.pages.VekPage;
import by.vek.pages.discount.DiscountPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscountTest {
    private final String TITLE_ALL_ACTIONS = "Все акции";
    private final String INFO_MESSAGE = "Обратите внимание, промокоды не действуют на уцененные товары, к уцененным товарам подарки\n" +
            "не предоставляются. Заказ считается подтвержденным только после звонка оператора или сообщения в viber/sms.";

    protected VekPage vekPage;
    protected DiscountPage discountPage;

    @BeforeEach
    public void setUp() {
        BasePage bp = new BasePage();
        bp.open();
        vekPage = new VekPage();
        vekPage.clickLinkDiscount();
        discountPage = new DiscountPage();
    }

    @Test
    public void checkTitleAllActions(){
        Assertions.assertEquals(TITLE_ALL_ACTIONS, discountPage.getAllActionTitleText());
    }

    @Test
    public void checkInfoMessageText(){
        Assertions.assertEquals(INFO_MESSAGE, discountPage.getInfoMessageText());
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
