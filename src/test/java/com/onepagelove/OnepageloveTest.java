package com.onepagelove;

import by.vek.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OnepageloveTest {

    private OnepagelovePage page;

    @BeforeEach
    public void openHomePage() {
        page = new OnepagelovePage();
        page.open();
    }

    @Test
    public void testJammLinkText() {
        Assertions.assertEquals("Jamm", page.getJammLinkText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
