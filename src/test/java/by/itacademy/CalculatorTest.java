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
    public void testDivide() {
        Calculator calculator = new Calculator();
        double actual = calculator.divide(95151, 58587);

        assertEquals(1.624, actual, 0.001);
    }
    @Test
    @DisplayName("Сумирования")
    public void testSummDouble() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.summDouble(5.2, 12.8));
    }
}
