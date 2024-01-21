import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.Person;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;
import Domain.Teacher;

public class Main {
    public static void main(String[] args) {
        // Инициализация студентов
        Student student1 = new Student("Василий", 19);
        Student student2 = new Student("Анна", 20);
        Student student3 = new Student("Ольга", 19);
        Student student4 = new Student("Евгений", 25);
        Student student5 = new Student("Алексей", 19);
        Student student6 = new Student("Василиса", 19);
        Student student7 = new Student("Иван", 21);
        Student student8 = new Student("Андрей", 26);
        Student student9 = new Student("Прасковья", 23);
        Student student10 = new Student("Елена", 18);
        Student student11 = new Student("Валерий", 19);
        // Иницилизация списка группы студентов и добавление пяти студентов в группу
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        // Иницилизация второго списка студентов и добавление шести студентов в группу
        List<Student> list2 = new ArrayList<>();
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        list2.add(student9);
        list2.add(student10);
        list2.add(student11);
        // Инициализация первой группы и добавление студентов из первого списка, присвоение idGroup
        StudentGroup group = new StudentGroup(list, 777);
        // Выведение списка студентов в консоль черех foreach
        for (Student student : group) {
            System.out.println(student);
        }
        // Инициализация второй группы и добавление студентов из второго списка, присвоение idGroup
        StudentGroup group2 = new StudentGroup(list2, 778);
        // Выведение списка студентов в консоль черех foreach
        for (Student student : group2) {
            System.out.println(student);
        }
        // Инициализация списка потока
        ArrayList<StudentGroup> listSteam = new ArrayList<>();
            // добавление групп студентов в список потока
            listSteam.add(group);
            listSteam.add(group2);
        
        System.out.println("----------------------------------");
        // Сортировка студентов внутри групп
        Collections.sort(group.getList());
        Collections.sort(group2.getList());
        // Вывод студентов в консоль после сортировки
        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println("----------------------------------");
        // Инициализация группы потоков
        StudentSteam groupSteam = new StudentSteam(listSteam);
        // Сортировка групп по количеству студентов по убыванию
        Collections.sort(groupSteam.getArrayList());
        // Выведение групп в консоль после сортировки
        for (StudentGroup studentGroup : groupSteam) {
            System.out.println(studentGroup);
        }
        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Employee e1 = new Employee("Фёдор", 35, "Дворник");
        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(e1, 25000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 25000);

        Teacher t2 = new Teacher("Ярослав", 44, "Бакалавр");
        Teacher t3 = new Teacher("Галина", 49, "Магистр");
        Teacher t4 = new Teacher("Виктор", 39, "Кандидат наук");
        Teacher t5 = new Teacher("Евгений", 29, "Доктор");
        List<Teacher> list3 = new ArrayList<>();
        list3.add(t1);
        list3.add(t2);
        list3.add(t3);
        list3.add(t4);
        list3.add(t5);

        Employee e2 = new Employee("Джамшут", 32, "Уборщик");
        Employee e3 = new Employee("Равшан", 35, "Разнорабочий");
        Employee e4 = new Employee("Марфа", 32, "Гардеробщица");
        Employee e5 = new Employee("Ксения", 28, "Повар");
        List<Employee> list4 = new ArrayList<>();
        list4.add(e1);
        list4.add(e2);
        list4.add(e3);
        list4.add(e4);
        list4.add(e5);

        System.out.println();
        AccountController.averageAgeStudents(list, list2);
        AccountController.averageAgeTeachers(list3);
        AccountController.averageAgeEmployees(list4);
    }


} 