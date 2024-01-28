import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        // Создание студентов
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);
        // Создание списка студентов
        List<Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        studList.add(student5);
        studList.add(student6);
        studList.add(student7);
        studList.add(student8);
        studList.add(student9);
        studList.add(student10);

        // iGetModel model = new ModelClass(studList);
        // ViewClass view = new ViewClass();
        // Создание view (англоязычное)
        ViewClassEng viewEn = new ViewClassEng();
        // iGetModel fmodel = new ModelClassFile("StudentDB.csv");
        // Создание объекта типа HashMap
        iGetModel hashModel = new ModelClassHash(studList);
        // Создание контроллера
        ControllerClass controller = new ControllerClass(hashModel, viewEn);
        viewEn.setContr(controller);
        viewEn.ViewRun();
    }
}