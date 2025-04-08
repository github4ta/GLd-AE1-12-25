package by.itacademy.evminova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetAddition(){
        Calculator calculator = new Calculator(5, 9);
        int actual = calculator.getAddition();

        assertEquals(14, actual);
    }
}
