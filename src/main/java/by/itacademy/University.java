package by.itacademy;

import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n; i++) {
            str = scanner.nextLine();
            System.out.println(str);
        }
    }
}
