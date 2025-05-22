package by.itacademy.utils;

public class Logins {
    private Logins() {
    }

    public static String generateCorrectLogin() {
        String correctSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        return generateLogin(correctSymbols, 3, 16);
    }

    public static String generateIncorrectLogin() {
        String correctSymbols = "!@#$%^&*";

        return generateLogin(correctSymbols, 3, 16);
    }

    private static String generateLogin(String symbols, int minimumLength, int maximumLength) {
        String login = "";
        int numberOfSymbols = (int) (Math.random() * (maximumLength - minimumLength + 1) + minimumLength);

        for (int i = 0; i < numberOfSymbols; i++) {
            login += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return login;
    }
}
