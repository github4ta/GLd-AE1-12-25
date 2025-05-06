package by.itacademy.php.index.testlab.wt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class WebCalculatorTest {
    private WebDriver driver;
    @Test
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
    }
    public void testCalculator() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> heights = Arrays.asList(150, 160, 170);
        List<Integer> weights = Arrays.asList(50, 60, 70);
        List<String> genders = Arrays.asList("Мужской", "Женский");

        for (String name : names) {
            for (int height : heights) {
                for (int weight : weights) {
                    for (String gender : genders) {
                        performCalculation(name, height, weight, gender);
                    }
                }
            }
        }
    }

    private void performCalculation(String name, int height, int weight, String gender) {
        // Заполнение формы
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement heightField = driver.findElement(By.name("height"));
        WebElement weightField = driver.findElement(By.name("weight"));

        // Выбор пола
        if (gender.equals("Мужской")) {
            driver.findElement(By.id("male")).click();
        } else {
            driver.findElement(By.id("female")).click();
        }

        // Ввод данных
        nameField.clear();
        nameField.sendKeys(name);

        heightField.clear();
        heightField.sendKeys(String.valueOf(height));

        weightField.clear();
        weightField.sendKeys(String.valueOf(weight));

        // Отправка формы
        driver.findElement(By.id("calculateButton")).click();

        // Получение результата
        WebElement resultElement = driver.findElement(By.id("result")); // Замените на правильный ID элемента результата
        String resultText = resultElement.getText();

        System.out.println("Результат для " + name + ", рост: " + height + ", вес: " + weight + ", пол: " + gender + ": " + resultText);

        // Здесь вы можете добавить проверки на ожидаемые результаты в зависимости от введенных данных
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}