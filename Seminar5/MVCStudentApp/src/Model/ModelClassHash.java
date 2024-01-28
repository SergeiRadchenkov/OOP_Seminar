package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel {
    // Инициализация списка HashMap
    private Map<Integer, Student> studentsMap = new HashMap<>();
    // Конструктор класса списка HashMap
    public ModelClassHash(List<Student> studList) {
        this.studentsMap = new HashMap<>();
        for (Student student : studList) {
            this.studentsMap.put(student.getId(), student);
        }
    }
    // Выводит список студентов
    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(studentsMap.values());
    }
    // Удаляет список студентов
    @Override
    public boolean removeStudent(int studentId) {
        return studentsMap.remove(studentId) != null;
    }
}