package com.pinterest.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateTest {
   private final static Response login = CreatePage.getResponseLoginRequest();
   private final static Response createAccount = CreatePage.getResponseCreateAccount();
    @Test
    public void testLogin() {


        assertAll(
                "Grouped Assertions of User Login",
                () -> assertEquals(401, CreatePage.getStatusCode(login), "StatusCode should be 401"),
                () -> assertEquals("failure", CreatePage.getErrorStatusText(login)),
                () -> assertEquals("Other", CreatePage.getBrowserNameMessage(login)),
                () -> assertEquals("BY", CreatePage.getCountryFromIp(login)),
                () -> assertEquals("Qazxc1478", CreatePage.getPassword(login))
        );
    }
        @Test
        public void testCreateAccount() {
        assertAll(
                "Grouped Assertions of User Create Account With Wrong Date Of Birth",
                () -> assertEquals(409, CreatePage.getStatusCode(createAccount), "StatusCode should be 409"),
                () -> assertEquals("Ой! Укажите действительный возраст для регистрации.", CreatePage.getErrorMessage(createAccount))

        );

    }
}
