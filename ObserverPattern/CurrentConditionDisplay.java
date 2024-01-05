package ObserverPattern;

public class CurrentConditionDisplay implements  Observer,DisplayElement{

    private WeatherData weatherData;
    private float humidity;
    @Override
    public void display() {
        System.out.println("This is Current condition display");
        System.out.println("Humidity : " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData  = weatherData;
        weatherData.registerObserver(this);
    }
}
