package by.itacademy.timoshenko;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    @DisplayName("Проверка метода Сложение")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(3, 5);

        assertEquals(8, actual, "Сложение работает некорректно");
    }

    @Test
    @DisplayName("Проверка метода Вычитание")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(1, 1);

        assertEquals(1, actual, "Вычитание работает некорректно");
    }

    @Test
    @DisplayName("Проверка метода Умножение")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(3, 1);

        assertEquals(2, actual, "Умножение работает некорректно");
    }

    @Test
    @DisplayName("Проверка метода Деление")
    public void testDivide() {
        Calculator calculator = new Calculator();
        int actual = calculator.divide(4, 2);

        assertEquals(2, actual, "Деление работает некорректно");
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void testDivideZero() {
        Calculator calculator = new Calculator();
        int actual = calculator.divide(4, 0);

        assertEquals(0, actual, "Деление работает некорректно");
    }
}
