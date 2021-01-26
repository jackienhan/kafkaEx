package observer02;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataJava extends Observable {
    private ArrayList observers;
    private float temp;
    private float humidity;


    private float pressure;

    WeatherDataJava() {
        observers = new ArrayList();
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
    public ArrayList getObservers() {
        return observers;
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
