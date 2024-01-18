package ru.geekbrains.Domain;

import java.util.Iterator;
import java.util.List;
// Класс для работы итератора
public class StudentGroupIterator implements Iterator<StudentGroup> {
    // Инициализация count для подсчёта элементов в списке
    private int count;
    // Инициализация списка студентов входящих в группу
    private List<StudentGroup> list;
    // Конструктор tudentGroupIterator
    public StudentGroupIterator(List<StudentGroup> list) {
        this.list = list;
    }
    // Инициализации hasNext для работы с очередным элементом в списке
    @Override
    public boolean hasNext() {
        return count < list.size();
    }
    // Инициализация next для переходу к следующему элементу списка
    @Override
    public StudentGroup next() {
        return list.get(count++);
    }
}
