package by.nashamoda.api;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        Faker faker = new Faker();
        loginPage = new LoginPage(faker.internet().emailAddress(), faker.internet().password());
    }

    @Test
    public void loginTest() {
        // soft assertions
        Assertions.assertEquals(300, loginPage.getStatusCode());
        Assertions.assertEquals(300, loginPage.getStatusCode());
        Assertions.assertEquals(300, loginPage.getStatusCode());
        Assertions.assertEquals(300, loginPage.getStatusCode());
    }

    @Test
    public void loginTest2() {
        Assertions.assertEquals(200, loginPage.getStatusCode());
    }
}
