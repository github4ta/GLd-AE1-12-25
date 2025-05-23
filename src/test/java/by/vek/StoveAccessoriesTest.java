package by.vek;

import by.vek.pages.StoveAccessoriesPage;
import by.vek.pages.VekPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoveAccessoriesTest extends BaseTest {

    @BeforeEach
    public void openStoveAccessoriesPage() {
        VekPage vekPage = new VekPage();
        vekPage.clickButtonCatalog();
        vekPage.clickStoveAccessories();
    }

    @Test
    public void testCategoryName() {
        StoveAccessoriesPage page = new StoveAccessoriesPage();
        Assertions.assertEquals("Аксессуары для плит и духовок", page.getCategoryNameText());
    }

    @Test
    public void testCategoryRelatedLinksText() {
        StoveAccessoriesPage page = new StoveAccessoriesPage();
        Assertions.assertEquals("Аксессуары для холодильников", page.getRefrigeratorAccessoriesLinkText());
        Assertions.assertEquals("Аксессуары для микроволновых печей", page.getMicrowaveAccessoriesLinkText());
    }
}
