package by.itacademy.kuleshov;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @Test
    @Order(1)
    @DisplayName("Проверка метода Сложение")
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 5));
    }

    @Test
    @Order(2)
    @DisplayName("Проверка метода Сложение (Максимальное значение)")
    public void testAddMax() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    @Order(3)
    @DisplayName("Проверка метода Сложение (Минимальное значение)")
    public void testAddMin() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE, -1));
    }

    @Test
    @Order(4)
    @DisplayName("Проверка метода Вычитание")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.subtract(12, 4));
    }

    @Test
    @Order(5)
    @DisplayName("Проверка метода Вычитание (Максимальное значение)")
    public void testSubtractMax() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MAX_VALUE, -1));
    }

    @Test
    @Order(6)
    @DisplayName("Проверка метода Вычитание (Минимальное значение)")
    public void testSubtractMin() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    @Order(7)
    @DisplayName("Проверка метода Умножение")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    @Order(8)
    @DisplayName("Проверка метода Умножение (Максимальное значение)")
    public void testMultiplyMax() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    @Order(9)
    @DisplayName("Проверка метода Умножение (Минимальное значение)")
    public void testMultiplyMin() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MIN_VALUE, 2));
    }


    @Test
    @Order(10)
    @DisplayName("Проверка метода Деление")
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(15, 5));
    }

    @Test
    @Order(11)
    @DisplayName("Проверка метода Деление (Максимальное значение)")
    public void testDivideMax() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MAX_VALUE, calculator.divide(Integer.MAX_VALUE * 3L, 2));
    }

    @Test
    @Order(12)
    @DisplayName("Проверка метода Деление (Минимальное значение)")
    public void testDivideMin() {
        Calculator calculator = new Calculator();
        assertEquals(Integer.MIN_VALUE, calculator.divide(Integer.MIN_VALUE * 3L, 2));
    }

    @Test
    @Order(13)
    @DisplayName("Проверка метода Деление, деление на ноль")
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(15L, 0L));
    }
}
