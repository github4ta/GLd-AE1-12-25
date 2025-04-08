package by.itacademy.kuleshov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.subtract(19, 4));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(15, 5));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.divide(15, 0));
    }
}
