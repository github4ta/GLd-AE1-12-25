package by.vek;

import by.vek.driver.MyDriver;
import by.vek.pages.details.DetailsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DetailsTest {
    private DetailsPage detailsPage;
    @BeforeEach
    public void setUp() {
        detailsPage = new DetailsPage();
        detailsPage.openDetailsPage();
        detailsPage.clickSubmitButtonCookie();
    }

    @Test
    public void testHeaderAndParagraphText() {
        detailsPage.clickAnchorDetails();

        Assertions.assertEquals(detailsPage.getUrl(), MyDriver.getDriver().getCurrentUrl());

        Assertions.assertEquals("Реквизиты", detailsPage.getHeaderDetailsText());

        Assertions.assertEquals("Владелец магазина ООО «Триовист»\n" +
                "Свидетельство о регистрации № 190806803,\n" +
                "выдано 22.02.2007 года Минским городским исполнительным комитетом.\n" +
                "УНП № 190806803\n" +
                "Интернет-магазин зарегистрирован в Торговом реестре 23 июня 2010 г.\n" +
                "Адрес для почтовых отправлений: 220020, Минск, пр. Победителей, 100, оф. 203 E-mail: 21@21vek.by\n" +
                "Контактные телефоны: +375 29 3-021-021, +375 33 3-021-021", detailsPage.getParagraphDetailsText());
    }

    @AfterEach
    public void tearDown() {
        MyDriver.quit();
    }
}
