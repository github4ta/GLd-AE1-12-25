package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testSum() {
        int actual = Calculator.sum(5, 2);
        assertEquals(7, actual);
    }
}
