package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ControllerClass implements iGetController {

    private iGetModel model;
    private iGetView view;
    private List<Student> studBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean tesdData(List<Student> stud)
    {
        if(stud.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update(String Request)
    {
        //MVP
        studBuffer = model.getStudents();
        if(tesdData(studBuffer))
        {
            view.printAllStudent(studBuffer);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudent(model.getStudents());
    }
    
    public void run()
    {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                   System.out.println("Выход из программы");
                   break;
                case LIST:
                   view.printAllStudent(model.getStudents());
                   break;
                   case DELETE:
                   deleteStudent();
                   break;
            }
        }
    }
     // Метод для удаления студента.
    private void deleteStudent() {
        try {
            System.out.println("Введите ID студента для удаления: ");
            int studentId = Integer.parseInt(view.prompt(""));
            if (model.removeStudent(studentId)) {
                System.out.println("Студент с ID " + studentId + " успешно удален.");
            } else {
                System.out.println("Студент с ID " + studentId + " не найден.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод. Введите целое число.");
        }
    }
}

