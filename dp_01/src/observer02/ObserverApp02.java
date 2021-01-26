package observer02;

public class ObserverApp02 {
    public static void main(String[] args) {
        // create Subject
        WeatherData weatherData = new WeatherData();
        // create Observer
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
        weatherData.setMeasurements(5.5f, 37.2f, 25.6f);
//        weatherData.setMeasurements(25.5f, 77.2f, 55.6f);
//        weatherData.setMeasurements(85.5f, 97.2f, 65.6f);

        WeatherDataJava weatherDataJava = new WeatherDataJava();
        CurrentConditionDisplayJava currentConditionDisplayJava = new CurrentConditionDisplayJava(weatherDataJava);
        weatherDataJava.setMeasurements(5.5f, 37.2f, 25.6f);
    }
}
