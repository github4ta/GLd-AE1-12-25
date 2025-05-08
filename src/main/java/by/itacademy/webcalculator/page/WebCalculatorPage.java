package by.itacademy.webcalculator.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebCalculatorPage {

    private WebDriver driver;

    private final By header = By.xpath("/html/body/table/tbody/tr[1]/td");
    private final By menuBlock = By.xpath("");
    private final By bannersBlock = By.xpath("");

    private final By validationMessage = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b");

    private final By nameField = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
    private final By heightField = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input");
    private final By weightField = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input");
    private final By maleGenderRadiobutton = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]");
    private final By femaleGenderRadiobutton = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]");

    private final By calculateButton = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input");

    private final By resultMessage = By.xpath(("/html/body/table/tbody/tr[2]/td[2]"));

    private final By footer = By.xpath("/html/body/table/tbody/tr[3]/td");

    public WebCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHeader() {
        return driver.findElement(header);
    }

    public WebElement getValidationMessage() {
        return driver.findElement(validationMessage);
    }

    public WebElement getNameField() {
        return driver.findElement(nameField);
    }

    public WebElement getHeightField() {
        return driver.findElement(heightField);
    }

    public WebElement getWeightField() {
        return driver.findElement(weightField);
    }

    public WebElement getMaleGenderRadiobutton() {
        return driver.findElement(maleGenderRadiobutton);
    }

    public WebElement getFemaleGenderRadiobutton() {
        return driver.findElement(femaleGenderRadiobutton);
    }

    public WebElement getCalculateButton() {
        return driver.findElement(calculateButton);
    }

    public WebElement getResultMessage() {
        return driver.findElement(resultMessage);
    }

    public WebElement getFooter() {
        return driver.findElement(footer);
    }

}
