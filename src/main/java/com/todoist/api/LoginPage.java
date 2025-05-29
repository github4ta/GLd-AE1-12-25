package com.todoist.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoginPage {
    public Response getResponse() {
        return given().
                header("content-type", "application/json")
                .body("{\"email\":\"test@test.com\",\"password\":\"346273432\",\"pkce_oauth\":null,\"web_session\":true,\"permanent_login\":true,\"device_id\":\"69022d75-e562-4b8d-8e5d-0ba2fbd76b9e\"}")
                .when().post("https://app.todoist.com/api/v9.223/user/login");
    }

    public int getStatusCode() {
        return getResponse().getStatusCode();
    }
}
