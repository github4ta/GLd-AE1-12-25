package by.itacademy.radzetskaya;

public class Calculator {

    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int multiplication (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int diviision (int firstNumber, int secondNumber){
        if (secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public static int difference (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
