package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassFile implements iGetModel {
    private String fileName;
    private List<Student> students;

    public ModelClassFile(String fileName) {
        this.fileName = fileName;
        this.students = loadStudentsFromFile();
    }

    // Загрузка студентов из файла при создании экземпляра
    private List<Student> loadStudentsFromFile() {
        List<Student> loadedStudents = new ArrayList<>();

        try (FileReader fr = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fr)) {
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student student = new Student(param[0], Integer.parseInt(param[1]));
                loadedStudents.add(student);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return loadedStudents;
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void saveAllStudentToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (Student student : students) {
                fw.write(student.getName() + " " + student.getAge() + " " + student.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean removeStudent(int id) {
        // Удаление студента из списка в памяти
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                // Сохранение обновленного списка в файл
                saveAllStudentToFile(students);
                return true;
            }
        }
        return false;
    }
}