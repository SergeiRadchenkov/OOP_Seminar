package Observer;

import Interfaces.iObserver;

public class Student implements iObserver {
    String name;
    int salary;

    public Student(String name){
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.println(String.format("Student %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Student %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
