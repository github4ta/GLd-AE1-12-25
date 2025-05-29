package by.nashamoda.api;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginPage {

    private String email;
    private String password;

    private static String URL_BASE = "https://www.nashamoda.by";
    private static String URL_LOGIN = URL_BASE + "/login?act=login";

    public LoginPage(String email, String password) {
        this.email = email;
        this.password = password;
    }

    private Response getResponseForPostRequest(String email, String password) {
        return getResponseForPostRequest(URL_LOGIN, getContentTypeHeader(), getFormParams(email, password));
    }

    public int getStatusCode() {
        Response response = getResponseForPostRequest(email, password);
        return response.statusCode();
    }


    private static Response getResponseForPostRequest(String endpoint, Map<String, String> headers, Map<String, String> formParams) {
        Response response = given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("request_header%5Bmobile%5D", "0")
                .formParam("email", "test%40test.com")
                .formParam("password", "123456")
                .when()
                .post("https://www.nashamoda.by/login?act=login");
        return response;
    }

    private static Map<String, String> getContentTypeHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return headers;
    }

    private static Map<String, String> getFormParams(String email, String password) {
        Map<String, String> formParams = new HashMap<>();
        formParams.put("request_header%5Bmobile%5D", "0");
        formParams.put("email", email);
        formParams.put("password", password);
        return formParams;
    }
}
