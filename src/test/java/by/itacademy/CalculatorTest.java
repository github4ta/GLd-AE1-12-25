package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testMultiplyLongValues() {
        Calculator calculator = new Calculator();
        long actual = calculator.multiply(2l, 33l);

        assertEquals(66l, actual);
    }
}
