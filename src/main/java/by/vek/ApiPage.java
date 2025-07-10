package by.vek;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiPage {

    private static final String BASE_URL = "https://gate.21vek.by/sso/login-by-email";

    public static Response postLogin() {
        return given()
                .headers(getHeaders())
                .body("{\"email\":\"test@test.com\",\"password\":\"qwerty123\"}")
                .when().post(BASE_URL);
    }

    private static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json");
        headers.put("content-type", "application/json");
        return headers;
    }


}
