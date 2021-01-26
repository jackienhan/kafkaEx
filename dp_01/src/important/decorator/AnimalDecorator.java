package important.decorator;

public class AnimalDecorator extends Animal {
    private Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void fly() {
        System.out.println("Decorator add new function for fly");
    }

    @Override
    public void run() {
        System.out.println("Decorator add new function for run");
    }

    @Override
    public int numLeg() {
        System.out.println("Decorator add new function for leg");
        return animal.numLeg();
    }

    @Override
    public void swim() {
        System.out.println("Decorator add new function for swim");
    }

    @Override
    public void jump() {
        System.out.println("Decorator add new function for jump");
    }
}
