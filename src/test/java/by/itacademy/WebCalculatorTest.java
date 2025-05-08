package by.itacademy;

import by.itacademy.webcalculator.page.WebCalculatorPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class WebCalculatorTest {

    private static WebDriver driver;
    private static WebCalculatorPage webCalculatorPage;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        webCalculatorPage = new WebCalculatorPage(driver);
    }

    @BeforeEach
    public void pageRefresh() {
        driver.get(driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Verify header is displayed")
    public void isHeaderDisplayed() {
        assertTrue(webCalculatorPage.getHeader().isDisplayed());
    }

    @Test
    @DisplayName("Verify header text")
    public void verifyHeaderText() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        String expectedText = "Расчёт веса Сегодня: " + currentDate;
        String actualText = webCalculatorPage.getHeader().getText().replace("\n", " ");

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Verify footer is displayed")
    public void isFooterDisplayed() {
        assertTrue(webCalculatorPage.getFooter().isDisplayed());
    }

    @Test
    @DisplayName("Verify footer text")
    public void verifyFooterText() {
        String expectedText = "© CoolSoft by Somebody fhlrhwelrwerhwerh";
        String actualText = webCalculatorPage.getFooter().getText().replace("\n", " ");
        ;

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Empty 'Name' field validation")
    public void verifyValidationMessageForEmptyNameField() {
        webCalculatorPage.getHeightField().sendKeys("180");
        webCalculatorPage.getWeightField().sendKeys("80");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Не указано имя.";
        String actualResult = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualResult);
    }

    @Test
    @DisplayName("Empty 'Height' field validation")
    public void verifyValidationMessageForEmptyHeightField() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getWeightField().sendKeys("80");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Рост должен быть в диапазоне 50-300 см.";
        String actualResult = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualResult);
    }

    @Test
    @DisplayName("Empty 'Weight' field validation")
    public void verifyValidationMessageForEmptyWeightField() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("80");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Вес должен быть в диапазоне 3-500 кг.";
        String actualResult = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualResult);
    }

    @Test
    @DisplayName("Not selected 'Gender' validation")
    public void verifyValidationMessageForEmptyGender() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("175");
        webCalculatorPage.getWeightField().sendKeys("80");
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Не указан пол.";
        String actualResult = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualResult);
    }

    @Test
    @DisplayName("All empty fields validation")
    public void verifyValidationMessageForAllEmptyFields() {
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        String actualText = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Less then minimum height and weight values validation")
    public void verifyValidationMessageForLessThemMinimumValues() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("49");
        webCalculatorPage.getWeightField().sendKeys("2");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";
        String actualText = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Bigger then maximum height and weight values validation")
    public void verifyValidationMessageForBiggerThemMaximumValues() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("301");
        webCalculatorPage.getWeightField().sendKeys("501");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";
        String actualText = webCalculatorPage.getValidationMessage().getText();

        assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Minimum required height and weight values")
    public void verifySuccessMessageForMinimumRequiredValues() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("50");
        webCalculatorPage.getWeightField().sendKeys("3");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        assertTrue(webCalculatorPage.getResultMessage().isDisplayed());
    }

    @Test
    @DisplayName("Maximum required height and weight values")
    public void verifySuccessMessageForMaximumRequiredValues() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("300");
        webCalculatorPage.getWeightField().sendKeys("500");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        assertTrue(webCalculatorPage.getResultMessage().isDisplayed());
    }

    @Test
    @DisplayName("All field with valid data")
    public void isResultMessageDisplayed() {
        webCalculatorPage.getNameField().sendKeys("Roman");
        webCalculatorPage.getHeightField().sendKeys("175");
        webCalculatorPage.getWeightField().sendKeys("75");
        webCalculatorPage.getMaleGenderRadiobutton().click();
        webCalculatorPage.getCalculateButton().click();

        String expectedText = "Идеальная масса тела";
        String actualText = webCalculatorPage.getResultMessage().getText();

        assertEquals(expectedText, actualText);
    }

    //Слишком малая масса тела
    //Незначительный избыток массы тела
    //Умеренный избыток массы тела
    //Значительный избыток массы тела, тучность

    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }
}
