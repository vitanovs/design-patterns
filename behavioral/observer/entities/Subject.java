package behavioral.observer.entities;

public interface Subject {

    boolean registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
