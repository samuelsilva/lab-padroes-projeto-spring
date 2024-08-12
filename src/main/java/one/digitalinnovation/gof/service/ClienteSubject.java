package one.digitalinnovation.gof.service;

import java.util.ArrayList;
import java.util.List;

// a classe Subject que manterá a lista de observers e notificará todos quando ocorrer uma mudança

import one.digitalinnovation.gof.model.Cliente;

public class ClienteSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Cliente cliente, String action) {
        for (Observer observer : observers) {
            observer.update(cliente, action);
        }
    }
}
