package by.itacademy.php.index.testlab.wt;

//import ConfigProvider;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseSeleniumTest {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@name='height']")
    private WebElement heightInput;

    @FindBy(xpath = "//input[@name='weight']")
    private WebElement weightInput;

    @FindBy(xpath = "//input[@value='m']")
    private WebElement genderMaleInput;

    @FindBy(xpath = "//input[@value='f']")
    private WebElement genderFemaleInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//td[@width='50%']")
    private WebElement textResult;

    @FindBy(xpath = "//b")
    private WebElement textTips;

    private WebDriverWait wait;

    public MainPage() {
        //driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void weightCalculate(String name, String height, String weight, String gender, String expectedResult) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        waitForVisibility(textResult);
        assertTextEquals(expectedResult, textResult.getText());
    }

    public void weightCalculateNegative(String name, String height, String weight, String gender, String expectedTip) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        waitForVisibility(textTips);
        assertTextEquals(expectedTip, textTips.getText());
    }

    public void weightCalculateNegativeAll(String name, String height, String weight, String gender, String expectedTips) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfAllElements(textTips));
        assertTextEquals(expectedTips.trim(), textTips.getText().trim());
    }

    private void fillForm(String name, String height, String weight, String gender) {
        nameInput.clear();
        heightInput.clear();
        weightInput.clear();

        Assert.assertTrue(nameInput.getAttribute("value").isEmpty());
        Assert.assertTrue(heightInput.getAttribute("value").isEmpty());
        Assert.assertTrue(weightInput.getAttribute("value").isEmpty());

        nameInput.sendKeys(name);
        heightInput.sendKeys(height);
        weightInput.sendKeys(weight);

        if ("male".equalsIgnoreCase(gender)) {
            genderMaleInput.click();
        } else if ("female".equalsIgnoreCase(gender)) {
            genderFemaleInput.click();
        }
    }

    private void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void assertTextEquals(String expectedText, String actualText) {
        System.out.println("Ожидаемый текст: " + expectedText);
        System.out.println("Фактический текст: " + actualText);
        Assert.assertEquals(expectedText.trim(), actualText.trim());
    }
}