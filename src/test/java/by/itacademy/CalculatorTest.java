package by.itacademy;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        boolean test1 = calc.multiply(5, 3) == 15;
        System.out.println("Тест 1 (5 * 3): " + (test1 ? "пройден" : "провален"));
    }
}
