package by.itacademy.radzetskaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testSumForLong(){
        Calculator calculator = new Calculator();
        long actual = calculator.sum(2L, 8L);

        assertEquals(10L, actual);
    }
}
