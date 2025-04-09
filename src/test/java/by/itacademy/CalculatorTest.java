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
}
