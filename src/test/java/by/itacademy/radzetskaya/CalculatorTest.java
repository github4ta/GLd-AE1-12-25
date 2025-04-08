package by.itacademy.radzetskaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(3, Calculator.sum(2, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals(2, Calculator.multiply(2, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(2, 1));
    }
}
