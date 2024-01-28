package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    // Выводит список студентов в консоль
    public void printAllStudent(List<Student> students);
    // Запрашивает ввод от пользователя
    public String prompt(String msg);
}
