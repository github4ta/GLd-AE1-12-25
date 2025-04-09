package by.itacademy.demyankov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Сумирования")
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(18, calculator.add(5.2, 12.8));
    }

    @Test
    @DisplayName("Вычитание")
    public void testsubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(99, calculator.subtraction(100, 1));
    }


    @Test
    @DisplayName("Умножение")
    public void testMultiplay() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiplay(5, 2));
    }

    @Test
    @DisplayName("Деление")
    public void testDivinding() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.dividing(10, 2));
    }

}
