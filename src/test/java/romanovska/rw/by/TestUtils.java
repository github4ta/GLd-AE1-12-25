package romanovska.rw.by;

import romanovska.rw.by.pages.HomePage;
import romanovska.rw.by.pages.RestoreLoginOrPasswordPage;

public class TestUtils {
    public static void openHomePage() {
        HomePage homePage = new HomePage();
        homePage.open();
    }

    public static void openHeader() {
        openHomePage();

        Header header = new Header();
        header.open();
    }

    public static void openAuthorizationModal() {
        openHeader();

        AuthorizationModal authorizationModal = new AuthorizationModal();
        authorizationModal.open();
    }

    public static void openRestoreLoginOrPasswordPage() {
        openAuthorizationModal();

        AuthorizationModal.clickForgotPasswordLink();

        RestoreLoginOrPasswordPage restoreLoginOrPasswordPage = new RestoreLoginOrPasswordPage();
        restoreLoginOrPasswordPage.open();
    }
}
