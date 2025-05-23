package by.vek;

import by.vek.pages.refrigerators.RefrigeratorsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RefrigeratorsTest extends BaseTest {

    private RefrigeratorsPage refrigeratorsPage;

    @BeforeEach
    public void setUp() {
        new RefrigeratorsPage().clickLinkRefrigerators();
        refrigeratorsPage = new RefrigeratorsPage();
    }

    @Test
    public void checkTitleRefrigeratorsText() {
        Assertions.assertEquals("Холодильники", refrigeratorsPage.getTitleRefrigeratorsPageText());
    }

    @Test
    public void checkAdditionGoodsLinkText() {
        Assertions.assertEquals("Морозильники", refrigeratorsPage.getLinkFreezersText());
        Assertions.assertEquals("Холодильники встраиваемые", refrigeratorsPage.getLinkBuiltinRefrigeratorsText());
        Assertions.assertEquals("Автохолодильники", refrigeratorsPage.getLinkBagsRefrigeratorsText());
        Assertions.assertEquals("Морозильные лари", refrigeratorsPage.getLinkFreezersLariText());
        Assertions.assertEquals("Магниты грифельные", refrigeratorsPage.getLinkSlateMagnetsText());
    }
}
