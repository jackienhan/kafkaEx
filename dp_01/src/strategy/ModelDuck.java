package strategy;

public class ModelDuck extends Duck {

    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
