package by.edostavka.api;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    public void loginTest(){
        given()
                .header("apitoken","4Pg2vLanS2Zdb9Pa2SAdZxEUPdNBEpiE")
                .header("web-user-agent", "SiteEdostavka/1.0.0")
                .header("content-type", "application/json")
                .body("{\"phone\":\"\",\"password\":\"qwerty\"}")
//                .formParam("phone", "")
//                .formParam("password", "")
                .when().post("https://api2.edostavka.by/api/v2/auth")
//                .then().statusCode(423);
                .then().log().all();

        RequestSpecification request = given();
    }
}
