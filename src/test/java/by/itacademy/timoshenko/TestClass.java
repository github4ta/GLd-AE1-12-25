package by.itacademy.timoshenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(3, 5);

        assertEquals(8, actual);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(1, 1);

        assertEquals(1, actual);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(3, 1);

        assertEquals(2, actual);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int actual = calculator.divide(4, 2);

        assertEquals(2, actual);
    }
}
