package by.markdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static by.markdown.MarkdownLocator.*;

public class VekPage {
    private WebDriver driver;

    public VekPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLinkMarkdown(){
        driver.findElement(By.xpath(LINK_MARKDOWN)).click();
    }

    public String getAllActionTitleText(){
        return driver.findElement(By.xpath(TITLE_ALL_ACTIONS)).getText();
    }

    public String getInfoMessageText(){
        return driver.findElement(By.xpath(INFO_MESSAGE)).getText();
    }
}
