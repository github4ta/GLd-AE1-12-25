package romanovska.rw.by;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import romanovska.rw.by.pages.HomePage;

public class Header extends BaseObject {
    private static AuthorizationModal authorizationModal;

    public Header() {
        super();
        authorizationModal = new AuthorizationModal();
    }

    @Override
    protected void open() {
    }

    public AuthorizationModal getAuthorizationModal(){
        return authorizationModal;
    }

    public void openAuthorizationModal() {
        authorizationModal.open();
    }
}
