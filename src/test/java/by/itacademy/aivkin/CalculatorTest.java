package by.itacademy.aivkin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(3, 5);
        int actual = calculator.add();

        assertEquals(8, actual);
    }
}
