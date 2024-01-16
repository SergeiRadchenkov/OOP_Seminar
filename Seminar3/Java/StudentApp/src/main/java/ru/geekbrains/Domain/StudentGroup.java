package ru.geekbrains.Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> list;
    private int idGroup;
    public StudentGroup(List<Student> list, int idGroup) {
        this.list = list;
        this.idGroup = idGroup;
    }
    public List<Student> getList() {
        return list;
    }
    public void setList(List<Student> list) {
        this.list = list;
    }
    public int getIdGroup() {
        return idGroup;
    }
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;

    }
    @Override
    public String toString() {
        return "StudentGroup [list=" + list + ", idGroup=" + idGroup + "]";
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }
}
