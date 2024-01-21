package Domain;

public class Teacher extends Worker {
    private String academicDegry;

    public Teacher(String name, int age, String academicDegry) {
        super(name, age);
        this.academicDegry = academicDegry;
    }
}