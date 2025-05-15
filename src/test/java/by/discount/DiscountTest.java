package by.discount;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DiscountTest extends BaseSeleniumTest {
    private final String TITLE_ALL_ACTIONS = "Все акции";
    private final String INFO_MESSAGE = "Обратите внимание, промокоды не действуют на уцененные товары, к уцененным товарам подарки\n" +
            "не предоставляются. Заказ считается подтвержденным только после звонка оператора или сообщения в viber/sms.";

    @Test
    public void checkTitleAllActions(){
        vekPage.clickLinkDiscount();
        Assert.assertEquals(TITLE_ALL_ACTIONS, discountPage.getAllActionTitleText());
    }

    @Test
    public void checkInfoMessageText(){
        vekPage.clickLinkDiscount();
        Assert.assertEquals(INFO_MESSAGE, discountPage.getInfoMessageText());
    }
}
