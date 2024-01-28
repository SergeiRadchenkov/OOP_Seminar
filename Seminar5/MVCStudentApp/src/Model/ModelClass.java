package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public boolean removeStudent(int studentId) {
        // Удаление студента из карты по идентификатору
        return students.remove(studentId) != null;
    }
}
