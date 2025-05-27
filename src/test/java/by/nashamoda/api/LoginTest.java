package by.nashamoda.api;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void loginTest() {
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage(faker.internet().emailAddress(), faker.internet().password());

        Assertions.assertEquals(300, loginPage.getStatusCode());
    }
}
