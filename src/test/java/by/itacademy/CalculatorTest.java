package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double actual = calculator.subtract(3.0, 1.0);

        assertEquals(2, actual);
    }
}
