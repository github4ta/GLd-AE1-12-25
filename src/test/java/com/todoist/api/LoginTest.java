package com.todoist.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        int actualStatusCode = loginPage.getStatusCode();
        Assertions.assertEquals(401, actualStatusCode);
    }
}
