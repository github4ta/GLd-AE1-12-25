package by.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    public void testSumIntValues() {
        Calculator calculator = new Calculator();
        int actual = calculator.sumIntValues(5, 2);
        assertEquals(7, actual);
    }

    @Test
    public void testSumForLong() {
        Calculator calculator = new Calculator();
        long actual = calculator.sumLong(2L, 8L);

        assertEquals(10L, actual);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double actual = calculator.divide(95151, 58587);

        assertEquals(1.624, actual, 0.001);
    }

    @Test
    public void testSubtractInt() {
            Calculator calculator = new Calculator();
            int actual = calculator.subtract(4, 2);
            assertEquals(2, actual);
    }

    @Test
    @DisplayName("Сумирования")
    public void testSummDouble() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.sumDouble(5.2, 12.8));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double actual = calculator.subtract(3.0, 1.0);
        assertEquals(2, actual);
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
