import observable.WeatherStationObservable;
import observer.PhoneDisplayObserver;
import observer.WindowDisplayObserver;

public class Main {

    public static void main(String[] args) {
        // Initialize weather station and its subscribers.
        WeatherStationObservable weatherStation = new WeatherStationObservable();
        PhoneDisplayObserver phoneDisplay = new PhoneDisplayObserver(weatherStation);
        WindowDisplayObserver windowDisplay = new WindowDisplayObserver(weatherStation);

        // Add phone display and window display to a collection of subscribers.
        weatherStation.add(phoneDisplay);
        weatherStation.add(windowDisplay);

        // Update the temperature. The observers will obtain a notification.
        System.out.println();
        weatherStation.setTemperature(30);

        System.out.println();
        weatherStation.remove(phoneDisplay); // Remove phone display from a collection of subscribers.
        weatherStation.setTemperature(-10); // Update the temperature and inform observers.
    }
}
