package Controllers;

import java.util.List;

import Domain.Employee;
import Domain.Person;
import Domain.Student;
import Domain.Teacher;
import Domain.Worker;

public class AccountController {
    public static <T extends Worker, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплачена зарплата " + salary);
    }

    public static void averageAgeStudents(List<Student> list, List<Student> list2) {
        int totalAge = 0;
        for (Person person : list) {
            totalAge += person.getAge();
        }
        int totalAge2 = 0;
        for (Person person : list2) {
            totalAge += person.getAge();
        }
        System.out.println("Средний возраст студентов: " + (totalAge + totalAge2) / (list.size() + list2.size()));
    }

    public static void averageAgeTeachers(List<Teacher> list) {
        int totalAge = 0;
        for (Person person : list) {
            totalAge += person.getAge();
        }
        System.out.println("Средний возраст учителей: " + totalAge / list.size());
    }

    public static void averageAgeEmployees(List<Employee> list) {
        int totalAge = 0;
        for (Person person : list) {
            totalAge += person.getAge();
        }
        System.out.println("Средний возраст работников: " + totalAge / list.size());
    }
}
