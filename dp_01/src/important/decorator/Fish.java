package important.decorator;

public class Fish extends AnimalDecorator {

    public Fish(Animal animal) {
        super(animal);
    }

    @Override
    public void fly() {
        System.out.println("Fish can not fly");
    }

    @Override
    public void run() {
        System.out.println("Fish can not run");
    }

    @Override
    public int numLeg() {
        return 0;
    }

    @Override
    public void swim() {
        System.out.println("Fish can  swim");
    }

    @Override
    public void jump() {
        System.out.println("Fish can not jump");
    }
}
