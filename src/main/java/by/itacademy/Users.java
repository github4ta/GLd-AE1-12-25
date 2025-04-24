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
        if (users == null) {
            return null;
        }

        if (users.isEmpty()) {
            return null;
        }

        List<User> filteredUsers = new ArrayList<>();

        for (User user : users) {
            if (user.getGrade() >= averageGrade) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }
}
