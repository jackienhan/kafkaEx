package important.decorator;

public class Lion extends Animal {



    @Override
    public void fly() {
        System.out.println("Lion can not fly");
    }

    @Override
    public void run() {
        System.out.println("Lion can run");
    }

    @Override
    public int numLeg() {
        return 4;
    }

    @Override
    public void swim() {
        System.out.println("Lion can not swim");
    }

    @Override
    public void jump() {
        System.out.println("Lion can not jump");
    }
}
