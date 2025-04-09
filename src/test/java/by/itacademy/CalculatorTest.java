package by.itacademy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

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
}
