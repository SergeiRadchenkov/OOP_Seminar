package Manager;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iObserver;
import Interfaces.iPublisher;

public class JobAgency implements iPublisher {

     List<iObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(iObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany, int salary) {
        for (iObserver observer : observers){
            observer.receiveOffer(nameCompany, salary);
        }
    }
}
