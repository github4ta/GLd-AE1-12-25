package romanovska.rw.by.pages;

import romanovska.rw.by.BaseObject;

public abstract class BasePage extends BaseObject {
    protected String URL;

    protected BasePage() {
        super();
    }

    @Override
    public void open() {
        driver.get(URL);
    }
}
