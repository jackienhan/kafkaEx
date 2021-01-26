package important.decorator;

public class AnimalDecoratorApp {
    public static void main(String[] args) {
        Animal lion = new Lion();
        System.out.println("leg lion = " + lion.numLeg());
        lion.run();

        Animal kangaroo = new Kangaroo();
        System.out.println("leg kangaroo = " + kangaroo.numLeg());
        kangaroo.jump();

        Animal fish = new Fish(lion);
        System.out.println("leg fish = " + fish.numLeg());
        fish.swim();

        Animal bird = new Bird(kangaroo);
        System.out.println("leg bird = " + bird.numLeg());
        bird.fly();

    }
}
