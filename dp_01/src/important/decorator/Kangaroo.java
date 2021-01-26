package important.decorator;

public class Kangaroo extends Animal {

    @Override
    public void fly() {
        System.out.println("Kangaroo can not fly");
    }

    @Override
    public void run() {
        System.out.println("Kangaroo can run");
    }

    @Override
    public int numLeg() {
        return 2;
    }

    @Override
    public void swim() {
        System.out.println("Kangaroo can not swim");
    }

    @Override
    public void jump() {
        System.out.println("Kangaroo can jump");
    }
}
