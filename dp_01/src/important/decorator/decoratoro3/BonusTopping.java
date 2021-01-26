package important.decorator.decoratoro3;

public class BonusTopping extends DrinkDecorator {

    BonusTopping(Drink drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 10;
    }
}
