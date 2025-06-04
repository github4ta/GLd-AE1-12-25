package com.pinterest.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateTest {

    @Test
    public void testCreate() {
        CreatePage createPage = new CreatePage();
        Response response = createPage.getResponse();

        assertAll(
                "Grouped Assertions of User",
                () -> assertEquals(400, CreatePage.getStatusCode(), "StatusCode should be 401"),
                () -> assertEquals("failure", CreatePage.getErrorStatusText()),
                () -> assertEquals("Other", CreatePage.getBrowserNameMessage()),
                () -> assertEquals("BY", CreatePage.getCountryFromIp()),
                () -> assertEquals("Qazxc1478", CreatePage.getPassword())
        );

    }
}
