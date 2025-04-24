package by.itacademy;

import java.util.Objects;

public class User {

    private String name;
    private int grade;

    public User(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return grade == user.grade && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
