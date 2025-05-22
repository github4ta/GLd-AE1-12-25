package by.av;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AvApiTest {

    @Test
    public void testLogin() {
        // .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
        //
        given().header("content-type", "application/json")
                .body("{\n" +
                        "    \"password\": \"1234567\",\n" +
                        "    \"phone\": {\n" +
                        "        \"country\": 1,\n" +
                        "        \"number\": \"296550011\"\n" +
                        "    }\n" +
                        "}")
        .when().post("https://api.av.by/auth/phone/sign-in")
        .then().log().all();
    }
}
