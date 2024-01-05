package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        //weatherData.removeObserver(currentConditionDisplay2);
        weatherData.setMeasurement(110,12,33);
        weatherData.setMeasurement(110,15,33);
    }


}
