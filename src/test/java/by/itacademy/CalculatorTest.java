package by.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSumIntValues() {
        Calculator calculator = new Calculator();
        int actual = calculator.sumIntValues(5, 2);
        assertEquals(7, actual);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double actual = calculator.subtract(3.0, 1.0);
        assertEquals(2, actual);
        }

    @Test
    @DisplayName("Сумирования")
    public void testSummDouble() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.summDouble(5.2, 12.8));
    }

    @Test
    @DisplayName("Проверка метода деление с переменными типа int")
    public void testDivideIntValues() {
        Calculator calculator = new Calculator();
        long actual = calculator.divide(27, 3);

        assertEquals(9, actual);
    }

    @Test
    @DisplayName("Проверка метода деление на ноль с переменными типа int")
    public void testDivideByZeroIntValues() {
        Calculator calculator = new Calculator();
        long actual = calculator.divide(27, 0);

        assertEquals(0, actual);
    }
}
