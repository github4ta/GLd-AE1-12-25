package by.itacademy.demyankov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
              assertEquals(15,calculator.add(5,10));
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.multiplay(5,2));
    }
}
