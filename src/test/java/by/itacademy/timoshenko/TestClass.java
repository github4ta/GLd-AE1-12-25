package by.itacademy.timoshenko;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestClass {
    private final Calculator calculator = new Calculator();

    @Test
    @Order(1)
    @DisplayName("Проверка метода Сложение")
    public void testAdd() {
        int actual = calculator.add(3, 5);

        assertEquals(8, actual, "Сложение работает некорректно");
    }

    @Test
    @Order(2)
    @DisplayName("Проверка метода cложения максимальных чисел")
    public void testAddWithMaxValue() {
        int actual = calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals(Integer.MAX_VALUE, actual, "Сложение работает некорректно");
    }

    @Test
    @Order(3)
    @DisplayName("Проверка метода cложения минимальных чисел")
    public void testAddWithMinValue() {
        int actual = calculator.add(Integer.MIN_VALUE, Integer.MIN_VALUE);

        assertEquals(Integer.MIN_VALUE, actual, "Сложение работает некорректно");
    }

    @Test
    @Order(4)
    @DisplayName("Проверка метода Умножения")
    public void testMultiply() {
        int actual = calculator.multiply(1, 1);

        assertEquals(1, actual, "Умножение работает некорректно");
    }

    @Test
    @Order(5)
    @DisplayName("Проверка метода умножения максимальных чисел")
    public void testMultiplyWithMaxValue() {
        int actual = calculator.multiply(Integer.MAX_VALUE, 2);

        assertEquals(Integer.MAX_VALUE, actual, "Умножение работает некорректно");
    }

    @Test
    @Order(6)
    @DisplayName("Проверка метода умножения минимальных чисел")
    public void testMultiplyWithMinValue() {
        int actual = calculator.multiply(Integer.MIN_VALUE, 2);

        assertEquals(Integer.MIN_VALUE, actual, "Умножение работает некорректно");
    }

    @Test
    @Order(7)
    @DisplayName("Проверка метода Вычитания")
    public void testSubtract() {
        int actual = calculator.subtract(3, 1);

        assertEquals(2, actual, "Вычитание работает некорректно");
    }

    @Test
    @Order(8)
    @DisplayName("Проверка метода Вычитания максимальных чисел")
    public void testSubtractWithMaxValue() {
        int actual = calculator.subtract(Integer.MIN_VALUE, 1);

        assertEquals(Integer.MIN_VALUE, actual, "Вычитание работает некорректно");
    }

    @Test
    @Order(9)
    @DisplayName("Проверка метода Вычитания минимальных чисел")
    public void testSubtractWithMinValue() {
        int actual = calculator.subtract(Integer.MAX_VALUE, -1);

        assertEquals(Integer.MAX_VALUE, actual, "Вычитание работает некорректно");
    }

    @Test
    @Order(10)
    @DisplayName("Проверка метода Деление")
    public void testDivide() {
        int actual = calculator.divide(4, 2);

        assertEquals(2, actual, "Деление работает некорректно");
    }

    @Test
    @Order(11)
    @DisplayName("Проверка метода деления максимальных чисел")
    public void testDivideWithMaxValue() {
        int actual = calculator.divide(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals(1, actual, "Деление работает некорректно");
    }

    @Test
    @Order(12)
    @DisplayName("Проверка метода деления минимальных чисел")
    public void testDivideWithMinValue() {
        int actual = calculator.divide(Integer.MIN_VALUE, Integer.MIN_VALUE);

        assertEquals(1, actual, "Деление работает некорректно");
    }

    @Test
    @Order(13)
    @DisplayName("Проверка деления на ноль")
    public void testDivideZero() {
        int actual = calculator.divide(4, 0);

        assertEquals(0, actual, "Деление работает некорректно");
    }
}
