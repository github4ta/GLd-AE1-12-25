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

    @DisplayName("Сумирования")
    public void testSummDouble() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.summDouble(5.2, 12.8));
    }
}
