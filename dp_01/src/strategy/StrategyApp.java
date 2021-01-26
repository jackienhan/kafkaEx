package strategy;

public class StrategyApp {
    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.performQuack();
//        mallardDuck.performFly();
//        mallardDuck.display();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.performFly();
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();
//        modelDuck.display();



        MallardDuck	mallard = new MallardDuck();
        RubberDuck	rubberDuckie = new RubberDuck();
        DecoyDuck	decoy = new DecoyDuck();

        ModelDuck	model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
