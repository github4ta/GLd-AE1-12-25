package by.itacademy;

public class Calculator {

    public double subtract( double a, double b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
