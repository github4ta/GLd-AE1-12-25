package by.itacademy.php.index.testlab.wt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebCalculatorTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCalculator() {
        List<String> names = Arrays.asList("Alice", "Bob");
        List<Integer> heights = Arrays.asList(150, 180);
        List<Integer> weights = Arrays.asList(50, 80);
        List<String> genders = Arrays.asList("Мужской", "Женский");

        for (String name : names) {
            for (int height : heights) {
                for (int weight : weights) {
                    for (String gender : genders) {
                        performTest(name, height, weight, gender);
                    }
                }
            }
        }
    }

    private void performTest(String name, int height, int weight, String gender) {
        // Ввод имени
        WebElement nameInput = driver.findElement(By.name("name"));
        nameInput.clear();
        nameInput.sendKeys(name);

        // Ввод роста
        WebElement heightInput = driver.findElement(By.name("height"));
        heightInput.clear();
        heightInput.sendKeys(String.valueOf(height));

        // Ввод веса
        WebElement weightInput = driver.findElement(By.name("weight"));
        weightInput.clear();
        weightInput.sendKeys(String.valueOf(weight));

        // Выбор пола
        if (gender.equals("Мужской")) {
            driver.findElement(By.id("M")).click();
        } else {
            driver.findElement(By.id("Ж")).click();
        }

        // Нажатие на кнопку расчета
        WebElement calculateButton = driver.findElement(By.name("calculate"));
        calculateButton.click();

        // Получение результата и проверка (пример)
        WebElement result = driver.findElement(By.id("result")); // Замените на правильный ID элемента результата

        // Здесь вы можете добавить логику проверки результата в зависимости от введенных данных.
        String expectedResult = "Ожидаемый результат"; // Замените на ожидаемый результат
        assertEquals(expectedResult, result.getText());
    }
}