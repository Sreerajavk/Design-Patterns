package ObserverPattern;

public class StatisticsDisplay implements Observer,DisplayElement{

    private WeatherData weatherData;
    private float tempHumidity = 0.0f;
    private int count=0;
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("This is statistics display");
        System.out.println("Avg Humidity : " + tempHumidity/count);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempHumidity += humidity;
        count++;
        display();
    }
}
