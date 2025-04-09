package by.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testMultiplyLongValues() {
        Calculator calculator = new Calculator();
        long actual = calculator.multiply(2l, 33l);

        assertEquals(66l, actual);
    }
      
    @Test
    @DisplayName("Сумирования")
    public void testSummDouble() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.summDouble(5.2, 12.8));
    }
}
