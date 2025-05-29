package by.av.api;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignInTest {

    @Test
    public void testSignIn() {
        SignInPage signInPage = new SignInPage();

        assertEquals(400, signInPage.getStatusCode());
    }

    @Test
    public void testSignIn2() {
        Faker faker = new Faker();
        SignInPage signInPage = new SignInPage("441111111", faker.internet().password());

        assertAll(
                () -> assertEquals(400, signInPage.getStatusCode(),  "StatusCode should be 400"),
                () -> assertEquals("exception.auth.invalid_sign_in_by_phone", signInPage.getMessage()),
                () -> assertEquals("Неверный телефон или пароль. Если забыли пароль, восстановите его", signInPage.getMessageText())
        );
    }
}
