package by.vek;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testLogin() {
        Response response = ApiPage.postLogin();
        response.then().log().all();
    }
}
