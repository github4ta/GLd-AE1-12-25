package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalculatorTest {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("John");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("180");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("80");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        // actual text

        // Идеальная масса тела
    }

    @Test
    public void testEmptyInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testHeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testWeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndHeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndWeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testHeightAndWeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testHeightAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testWeightAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndHeightAndWeightInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndHeightAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Вес должен быть в диапазоне 3-500 кг.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testNameAndWeightAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testHeightAndWeightAndMaleInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement message = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b"));

        String expectedErrorMessage = "Не указано имя.";

        Assertions.assertEquals(expectedErrorMessage, message.getText());
    }

    @Test
    public void testFullInput() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement nameInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        nameInput.sendKeys("Alex");

        WebElement heightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        heightInput.sendKeys("184");

        WebElement weightInput = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        weightInput.sendKeys("71");

        WebElement genderMale = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        genderMale.click();

        WebElement buttonCalculate = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        buttonCalculate.click();

        WebElement message = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]"));

        String expectedMessage = "Идеальная масса тела";

        Assertions.assertEquals(expectedMessage, message.getText());
    }
}
