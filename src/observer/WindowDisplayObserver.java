package observer;

import observable.WeatherStationObservable;

public class WindowDisplayObserver implements IObserver, IDisplay {
    private final WeatherStationObservable weatherStation;

    /**
     * The constructor which works with concrete weather station.
     */
    public WindowDisplayObserver(WeatherStationObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    /**
     * This method is called whenever a temperature is updated.
     */
    @Override
    public void update() {
        // Do something here.

        display();
    }

    @Override
    public void display() {
        System.out.println(weatherStation.getTemperature() + " is displayed in the window");
    }

    @Override
    public String toString() {
        return "window display";
    }
}
