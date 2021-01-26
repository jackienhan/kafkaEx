package observer02;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayJava implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Observable observable;
    CurrentConditionDisplayJava(Observable o) {
        this.observable = o;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataJava) {
            WeatherDataJava weatherDataJava = (WeatherDataJava) o;
            this.temp = weatherDataJava.getTemp();
            this.humidity = weatherDataJava.getHumidity();
            display();
        }
    }
}
