package ru.geekbrains.Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Класс потоков групп студентов
public class StudentSteam implements Iterable<StudentGroup> {
    // Инициализация списка студентов входящих в группу
    private List<StudentGroup> arrayList;
    // Конструктор StudentSteam
    public StudentSteam(List<StudentGroup> arrayList) {
        this.arrayList = arrayList;
    }
    // Getter и Setter arrayList
    public List<StudentGroup> getArrayList() {
        return arrayList;
    }
    public void setList(ArrayList<StudentGroup> arrayList) {
        this.arrayList = arrayList;
    }
    // ToString для корректировки выведения в консоль
    @Override
    public String toString() {
        return "StudentSteam [list=" + arrayList + "]";
    }
    // Конструктор итератора
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(arrayList);
    }
}
