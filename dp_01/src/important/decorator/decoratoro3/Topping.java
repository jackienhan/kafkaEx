package important.decorator.decoratoro3;

public class Topping extends DrinkDecorator {

    Topping(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return super.price() + 0.5;
    }
}
