package by.itacademy.kuleshov;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
       if (b == 0) {
           return -1;
       } else {
           return a / b;
       }
    }
}
