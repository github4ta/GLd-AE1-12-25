package by.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

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
