package romanovska.rw.by;

import romanovska.rw.by.pages.HomePage;
import romanovska.rw.by.pages.RestoreLoginOrPasswordPage;

public class TestUtils {
    public static HomePage openHomePage() {
        HomePage homePage = new HomePage();
        homePage.open();
        return homePage;
    }

    public static Header openHeader() {
        openHomePage();

        Header header = new Header();
        header.open();
        return header;
    }

    public static AuthorizationModal openAuthorizationModal() {
        AuthorizationModal authorizationModal = openHeader().getAuthorizationModal();
        authorizationModal.open();
        return authorizationModal;
    }

    public static RestoreLoginOrPasswordPage openRestoreLoginOrPasswordPage() {
        openAuthorizationModal();

        RestoreLoginOrPasswordPage restoreLoginOrPasswordPage = new RestoreLoginOrPasswordPage();
        restoreLoginOrPasswordPage.open();

        return restoreLoginOrPasswordPage;
    }
}
