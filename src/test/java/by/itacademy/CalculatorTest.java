package by.itacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

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
