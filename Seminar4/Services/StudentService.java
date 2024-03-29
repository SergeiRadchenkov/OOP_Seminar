package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age, String major) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }

    public void sortByFIO() {
        PersonComparator<Student> studComp = new PersonComparator<>();
        students.sort(studComp);
    }
}
