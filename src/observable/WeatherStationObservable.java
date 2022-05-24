package observable;

import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements IObservable {
    /**
     * List of observers.
     */
    private final List<IObserver> observers = new ArrayList<>();

    private double temperature;

    /**
     * Add an observer to the observer list.
     */
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        System.out.println(observer.toString() + " is added");
    }

    /**
     * Remove observers from the collection.
     */
    @Override
    public void remove(IObserver observer) {
        System.out.println(observer.toString() + " is removed");
        observers.remove(observer);
    }

    /**
     * Each observer is notified.
     */
    @Override
    public void inform() {
        for (IObserver observer : observers)
            observer.update();
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        inform();
    }
}
