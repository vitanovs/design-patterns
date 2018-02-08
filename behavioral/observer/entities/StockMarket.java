package behavioral.observer.entities;


import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

    private List<Observer> observers;

    private double applPrice = 0.0;
    private double googPrice = 0.0;
    private double ibmPrice = 0.0;


    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    public void setApplPrice(double applPrice){
        this.applPrice = applPrice;
        this.notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        this.notifyObservers();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObservers();
    }

    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.applPrice, this.googPrice, this.ibmPrice);
        }
    }
}
