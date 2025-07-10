package by.vek;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void testLogin() {
        given().
                header("accept", "application/json").
                header("content-type", "application/json").
                body("{\"email\":\"test@test.com\",\"password\":\"123456678\"}").
                when().post("https://gate.21vek.by/sso/login-by-email").
                then().log().all();
    }
}
