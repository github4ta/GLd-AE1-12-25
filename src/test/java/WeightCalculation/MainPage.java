package WeightCalculation;
import by.itacademy.ConfigProvider;
import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage extends BaseSeleniumPage {

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

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void weightCalculate(String name, String height, String weight, String gender, String expectedResult) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d -> ExpectedConditions.visibilityOf(textResult));
        System.out.println("Ожидаемый текст: " + expectedResult);
        System.out.println("Фактический текст: " + textResult.getText());
        Assert.assertEquals(expectedResult, textResult.getText());
    }

    public void weightCalculateNegative(String name, String height, String weight, String gender, String tip) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(d -> ExpectedConditions.visibilityOf(textTips));
        System.out.println("Ожидаемый текст: " + tip);
        System.out.println("Фактический текст: " + textTips.getText());
        Assert.assertEquals(tip, textTips.getText());
    }

    public void weightCalculateNegativeAll(String name, String height, String weight, String gender, String tips) {
        fillForm(name, height, weight, gender);
        buttonSubmit.click();
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(textTips));
        System.out.println("Ожидаемые подсказки: " + tips);
        System.out.println("Фактические подсказки: " + textTips.getText());
        Assert.assertEquals(tips, textTips.getText());
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

        if (gender.equals("male")) {
            genderMaleInput.click();
        } else if (gender.equals("female")) {
            genderFemaleInput.click();
        }
    }
}
