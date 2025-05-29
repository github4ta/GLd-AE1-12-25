package by.edostavka.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testLoginStatusCode() {

        LoginPage loginPage = new LoginPage();
        int actualStatusCOde = loginPage.getStatusCode();
        Assertions.assertEquals(422, actualStatusCOde);
    }

    @Test
    public void testText(){
        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals("phone", loginPage.getInvalidField());
        System.out.println(loginPage.getInvalidField());
    }
}
