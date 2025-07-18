package romanovska.rw.by;

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
