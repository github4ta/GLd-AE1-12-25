package by.itacademy;

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
}
