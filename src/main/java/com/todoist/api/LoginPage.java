package com.todoist.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class LoginPage {
    private Response getResponse() {
        Response response = given()
                .header("content-type", "application/json")
                .body("{\n" +
                        "    \"email\": \"test@test.com\",\n" +
                        "    \"password\": \"qwerty123\",\n" +
                        "    \"pkce_oauth\": null,\n" +
                        "    \"web_session\": true,\n" +
                        "    \"permanent_login\": true,\n" +
                        "    \"device_id\": \"d8c1a9cf-dae3-492e-bb6f-ac4f4261db80\"\n" +
                        "}")
                .when().post("https://app.todoist.com/api/v9.223/user/login");
        return response;
    }

    public int getStatusCode() {
        Response response = getResponse();
        return response.getStatusCode();
    }
}
