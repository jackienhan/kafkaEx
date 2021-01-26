package important.decorator.decoratoro3;

public class DrinkDecorator implements Drink {
    protected Drink drink;
    DrinkDecorator (Drink drink) {
        this.drink = drink;
    }
    @Override
    public double price() {
        return drink.price();
    }
}
