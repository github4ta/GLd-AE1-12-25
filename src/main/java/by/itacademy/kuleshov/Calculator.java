package by.itacademy.kuleshov;

public class Calculator {

    public int add(int a, int b) {
        long result = (long) a + b;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        return (int) result;
    }

    public int subtract(int a, int b) {
        long result = (long) a - b;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        return (int) result;
    }

    public int multiply(int a, int b) {
        long result = (long) a * b;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }

        return (int) result;
    }

    public int divide(long a, long b) {
        long result = 0;

        if (b == 0) {
            result = 0;
        } else {
            result = a / b;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
