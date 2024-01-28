package View;

import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClassEng implements iGetView {

    private iGetController contr;
    // Setter для взаимодействие с контролёром
    public void setContr(iGetController contr) {
        this.contr = contr;
    }
    // Список студентов для вывода
    public void printAllStudent(List<Student> students)
    {
        System.out.println("----------------------------------------");
        System.out.println("List of students: ");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    // Запрашивает ввод пользователя
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
    // Вызов run
    public void ViewRun()
    {
        contr.run();
    }
}
