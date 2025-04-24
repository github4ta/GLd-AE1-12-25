package by.itacademy.evminova;

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
        University that = (University) o;
        return grade == that.grade && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
}
