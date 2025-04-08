package by.itacademy.evminova;

public class Calculator {

    private int firstNumber;
    private int secNumber;

    public Calculator(int firstNumber, int secNumber) {
        this.firstNumber = firstNumber;
        this.secNumber = secNumber;
    }

    public int getAddition(){
        return firstNumber + secNumber;
    }
}
