package by.itacademy;

public class Calculator {

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int sumIntValues(int a, int b) {
        return a + b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double sumDouble(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long sumLong(long firstNumber, long secondNumber) {
        return firstNumber + secondNumber;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
