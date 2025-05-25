package pesetskiy.rw.by;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pesetskiy.rw.by.driver.Driver;
import pesetskiy.rw.by.pages.authorizationForm.AuthorizationFormPage;

public class AuthorizationFormTest {

    private AuthorizationFormPage authorizationFormPage;

    @Test
    @DisplayName("Check authorization form")

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
