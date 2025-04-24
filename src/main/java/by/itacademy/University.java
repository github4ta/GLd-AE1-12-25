package by.itacademy;

import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int grade = scanner.nextInt();
            User user = new User(name, grade);
            System.out.println(user);
        }
    }
}
