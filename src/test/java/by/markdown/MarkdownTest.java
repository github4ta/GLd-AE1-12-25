package by.markdown;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MarkdownTest extends BaseSeleniumTest {
    private static final String TITLE_ALL_ACTIONS = "Все акции";
    private static final String INFO_MESSAGE = "Обратите внимание, промокоды не действуют на уцененные товары, к уцененным товарам подарки\n" +
            "не предоставляются. Заказ считается подтвержденным только после звонка оператора или сообщения в viber/sms.";

    @Test
    public void checkTitleAllActions(){
        vekPage.clickLinkMarkdown();
        Assert.assertEquals(TITLE_ALL_ACTIONS, vekPage.getAllActionTitleText());
    }

    @Test
    public void checkInfoMessageText(){
        vekPage.clickLinkMarkdown();
        Assert.assertEquals(INFO_MESSAGE, vekPage.getInfoMessageText());
    }
}
