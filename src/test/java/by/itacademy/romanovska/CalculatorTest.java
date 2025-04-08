package by.itacademy.romanovska;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int actual = Calculator.add(5, 2);
        assertEquals(7, actual);
    }

    @Test
    public void testSubtract() {
        int actual = Calculator.subtract(5, 2);
        assertEquals(3, actual);

        actual = Calculator.subtract(2, 5);
        assertEquals(-3, actual);
    }

    @Test
    public void testMultiply() {
        int actual = Calculator.multiply(5, 2);
        assertEquals(10, actual);
    }

    @Test
    public void testDivide() {
        double actual = Calculator.divide(5, 2);
        assertEquals(2.5, actual, 0.1);

        actual = Calculator.divide(5, 0);
        assertEquals(1, actual);
    }
}
