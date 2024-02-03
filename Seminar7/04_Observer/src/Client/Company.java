package Client;

import java.util.Random;

import Interfaces.iPublisher;

public class Company {
    iPublisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    public Company(iPublisher jobAgency, String nameCompany, int maxSalary){
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmpoyee(){
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
