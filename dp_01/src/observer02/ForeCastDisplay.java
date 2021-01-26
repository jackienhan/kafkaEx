package observer02;

public class ForeCastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject subject;

    ForeCastDisplay(Subject s) {
        this.subject = s;
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Fore cast: " + temp + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
