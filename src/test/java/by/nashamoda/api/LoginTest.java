package by.nashamoda.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        Response response = LoginPage.getResponseForPostRequest();
        response.then().statusCode(200);
    }
}
