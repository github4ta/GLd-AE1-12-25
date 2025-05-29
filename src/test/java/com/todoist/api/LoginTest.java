package com.todoist.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        int actualStatusCode = loginPage.getStatusCode();
        Assertions.assertEquals(401, actualStatusCode);
    }
}
