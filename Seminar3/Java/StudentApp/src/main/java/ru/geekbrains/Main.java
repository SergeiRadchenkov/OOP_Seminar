package ru.geekbrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ru.geekbrains.Domain.Student;
import ru.geekbrains.Domain.StudentGroup;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Василий", 19);
        Student student2 = new Student("Анна", 20);
        Student student3 = new Student("Ольга", 19);
        Student student4 = new Student("Евгений", 25);
        Student student5 = new Student("Алексей", 19);

        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        StudentGroup group = new StudentGroup(list, 777);
        for (Student student : group) {
            System.out.println(student);
        }
        
        System.out.println("----------------------------------");
        
        Collections.sort(group.getList());

        for (Student student : group) {
            System.out.println(student);
        }
    }
} 