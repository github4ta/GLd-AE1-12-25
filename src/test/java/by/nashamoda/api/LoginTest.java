package by.nashamoda.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    public void loginTest() {
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("request_header%5Bmobile%5D", "0")
                .formParam("email", "test1%40test.com")
                .formParam("password", "fwrew")
                .when().post("https://www.nashamoda.by/login?act=login")
                .then().statusCode(200);
    }
}
