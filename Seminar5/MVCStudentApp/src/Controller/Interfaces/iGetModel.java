package Controller.Interfaces;

import java.util.Iterator;
import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   // Возвращает список студентов модели
   public List<Student> getStudents();
   // Удаляет студента с указанным ID
   boolean removeStudent(int id);
}