package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if(index > 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
