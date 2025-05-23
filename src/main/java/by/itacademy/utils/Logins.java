package by.itacademy.utils;

public class Logins {
    private Logins() {
    }

    public static String generateCorrectLogin() {
        String correctLogin = "";
        int numberOfSymbols = (int) (Math.random() * 14 + 3);
        String correctSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < numberOfSymbols; i++) {
            correctLogin += correctSymbols.charAt((int)(Math.random() * correctSymbols.length()));
        }
        return correctLogin;
    }
}
