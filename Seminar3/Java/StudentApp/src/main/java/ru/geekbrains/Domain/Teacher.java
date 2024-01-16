package ru.geekbrains.Domain;

public class Teacher extends Person {
    private String academicDegry;

    public Teacher(String name, int age, String academicDegry) {
        super(name, age);
        this.academicDegry = academicDegry;
    }
}
