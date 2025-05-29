package com.sporcle.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoginPage {
    private final Response response;

    public LoginPage() {
        response = getResponse();
    }

    private Response getResponse() {
        return given()
                .header("content-type", "application/x-www-form-urlencoded; charset=UTF-8")
                //.body("email=test%40test.xyz&passwd=7298472839432&remember=1")
                .formParam("email", "test%40test.xyz")
                .formParam("passwd", "7298472839432")
                .formParam("remember", 1)
                .when().post("https://www.sporcle.com/auth/ajax/login.php");
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getErrorText() {
        return response.path("error_text");
    }

    public String getErrorsEmailMessage() {
        return response.path("errors[0].message");
    }

    public String getErrorsEmailField() {
        return response.path("errors[0].field");
    }
}
