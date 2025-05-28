package by.edostavka.api;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    public void loginTest(){
        given()
                .header("apitoken","JDhutdSrHfuoGzvn4M6ApT4GFUs8w9RF")
                .header("web-user-agent", "SiteEdostavka/1.0.0")
                .body("{\"phone\":\"375291111333\",\"password\":\"qwerty\"}")
//                .formParam("phone", "375296550011")
//                .formParam("password", "123456")
                .when().post("https://api2.edostavka.by/api/v2/auth")
                .then().log().all();
    }
}
