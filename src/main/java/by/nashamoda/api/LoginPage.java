package by.nashamoda.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoginPage {

    public static Response getResponseForPostRequest() {
        Response response = given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("request_header%5Bmobile%5D", "0")
                .formParam("email", "test1%40test.com")
                .formParam("password", "fwrew")
                .when()
                .post("https://www.nashamoda.by/login?act=login");

        return response;
    }
}
