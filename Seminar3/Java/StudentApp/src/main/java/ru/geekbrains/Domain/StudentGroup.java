package ru.geekbrains.Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    // Инициализация списка студентов входящих в группу
    private List<Student> list;
    // Инициализация номера группы
    private int idGroup;
    // Инициализация ID группы в потоке
    private int id;
    // Getter и Setter id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Инициализация generalId для приведение private id в static
    static int generalId;
    // Конструктор StudentGroup
    public StudentGroup(List<Student> list, int idGroup) {
        this.list = list;
        this.idGroup = idGroup;
        this.id = generalId;
        generalId++;
    }
    // Getter и Setter list
    public List<Student> getList() {
        return list;
    }
    public void setList(List<Student> list) {
        this.list = list;
    }
    // Getter и Setter idGroup
    public int getIdGroup() {
        return idGroup;
    }
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    // ToString для корректировки выведения в консоль
    @Override
    public String toString() {
        return "StudentStream [id=" + id + "]\n" + list + "\nidGroup=" + idGroup + "\n";
    }
    // Конструктор итератора
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }
    // Сравнение StudentGroup по количеству студентов по убыванию через Comparable
    @Override
    public int compareTo(StudentGroup o) {
        if (o.getList().size() < this.list.size()) {
            return -1;
        }
        if (o.getList().size() > this.list.size()) {
            return 1;
        }
        return 0;
    }  
}
