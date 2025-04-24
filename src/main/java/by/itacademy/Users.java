package by.itacademy;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static double getAverageGrade(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getGrade();
        }
        double averageGrade = (double) sum / users.size();
        return averageGrade;
    }

    public static List<User> getUsersWithGradeEqualOrOverAverage(List<User> users, double averageGrade) {

        List<User> filteredUsers = new ArrayList<>();

        if (users == null || users.isEmpty()) {
            return filteredUsers;
        }

        for (User user : users) {
            if (user.getGrade() >= averageGrade) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }
}
