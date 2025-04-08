package by.itacademy.evminova;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetAddition(){
        Calculator calculator = new Calculator();
        assertEquals(22, calculator.getAddition(14, 8));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.subtract(10, 2));
    }

    @Test
    public void testDevide(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.devide(10, 2));
    }
}
