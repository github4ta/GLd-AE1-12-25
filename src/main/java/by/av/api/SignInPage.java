package by.av.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SignInPage {

    private final String DEFAULT_PHONE_NUMBER = "252222222";
    private final String DEFAULT_PASSWORD = "2222222";
    private final Response response;

    public SignInPage() {
        response = getResponse();
    }

    public SignInPage(String number, String password) {
        response = getResponse(number, password);
    }

    private Response getResponse() {
        return getResponse(DEFAULT_PHONE_NUMBER, DEFAULT_PASSWORD);
    }

    private Response getResponse(String number, String password) {
        Response response = given()
                .header("content-type", "application/json")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
                .body("{\n" +
                        "    \"password\": \"" + password + "\",\n" +
                        "    \"phone\": {\n" +
                        "        \"country\": 1,\n" +
                        "        \"number\": \"" + number + "\"\n" +
                        "    }\n" +
                        "}")
                .when().post("https://api.av.by/auth/phone/sign-in");

        return response;
    }

    public int getStatusCode() {
        return response.statusCode();
    }

    public String getMessage() {
        return  response.path("message");
    }
    public String getMessageText() {
        return response.path("messageText");
    }
}
