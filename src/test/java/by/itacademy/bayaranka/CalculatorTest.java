package by.itacademy.bayaranka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(5, 5);

        assertEquals(10, actual);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(3, 1);

        assertEquals(2, actual);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(1, 1);

        assertEquals(1, actual);
    }

}
