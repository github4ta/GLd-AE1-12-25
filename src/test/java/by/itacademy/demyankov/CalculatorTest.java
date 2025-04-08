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
    public void testsubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(99,calculator.subtraction(100,1));
    }


    @Test
    public void testMultiplay(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.multiplay(5,2));
    }

    @Test
    public void testDivinding(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.dividing(10,2));
    }

}
