package builder.generic;

import builder.Bottle;
import builder.Burger;
import builder.Coke;

public class GenericBurger implements Generic<Burger>, GenericType<Coke, Bottle>{
    @Override
    public void action(Burger action) {
        System.out.println(action.name() + ": " + action.price());
    }

    @Override
    public Bottle performance(Coke action) {
        return new Bottle();
    }
}
