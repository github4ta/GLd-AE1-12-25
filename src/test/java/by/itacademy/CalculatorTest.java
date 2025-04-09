package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(3, 1);

        assertEquals(2, actual);
    }
}
