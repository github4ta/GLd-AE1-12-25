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
    public void testMultiplyLongValues() {
        Calculator calculator = new Calculator();
        long actual = calculator.multiply(2l, 33l);

        assertEquals(66l, actual);
    }
}
