package by.itacademy.radzetskaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum(){
        assertEquals(2, Calculator.sum(2,1));
    }
}
