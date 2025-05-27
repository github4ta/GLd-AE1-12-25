package by.nashamoda.api;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        Faker faker = new Faker();
        Response response = LoginPage.getResponseForPostRequest(faker.internet().emailAddress(), faker.internet().password());
        response.then().statusCode(200);
    }
}
