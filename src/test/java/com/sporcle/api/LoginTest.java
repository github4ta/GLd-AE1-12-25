package com.sporcle.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();

        assertAll(
                "Grouped Assertions of User",
                () -> assertEquals(200, loginPage.getStatusCode(), "StatusCode should be 200"),
                () -> assertEquals("Incorrect login information.", loginPage.getErrorText()),
                () -> assertEquals("Incorrect login information", loginPage.getErrorsEmailMessage()),
                () -> assertEquals("email", loginPage.getErrorsEmailField())
        );
    }
}
