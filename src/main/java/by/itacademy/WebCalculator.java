package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalculator {

    public static void main(String[] args) {
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
    }
}
