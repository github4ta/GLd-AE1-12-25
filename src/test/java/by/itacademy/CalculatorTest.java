package by.itacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double actual = calculator.divide(95151, 58587);

        assertEquals(1.624, actual, 0.001);
    }
}
