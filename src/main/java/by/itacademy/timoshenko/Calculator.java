package by.itacademy.timoshenko;

public class Calculator {
    public final static int MAX_VALUE = Integer.MAX_VALUE;
    public final static int MIN_VALUE = Integer.MIN_VALUE;

    public int add(int a, int b) {
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

    public int multiply(int a, int b) {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

    public int subtract(int a, int b) {
        long result = (long) a - b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        long result = (long) a / b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
