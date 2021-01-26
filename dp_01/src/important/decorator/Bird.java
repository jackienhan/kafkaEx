package important.decorator;

public class Bird extends AnimalDecorator {

    public Bird(Animal animal) {
        super(animal);
    }

    @Override
    public void fly() {
        System.out.println("Bird can  fly");
    }

    @Override
    public void run() {
        System.out.println("Bird can run");
    }

    @Override
    public int numLeg() {
        return 2;
    }

    @Override
    public void swim() {
        System.out.println("Bird can not swim");
    }

    @Override
    public void jump() {
        System.out.println("Bird can not jump");
    }

}
