package important.decorator.decoratoro3;

import java.util.Arrays;

public class DrinkApp {
    public static void main(String[] args) {
        Drink milk = new MilkTea();
        System.out.println("price milk tea = " +milk.price());
        Drink topic = new Topping(new BonusTopping(milk));
        System.out.println("price milk tea add topping = " + topic.price());
    }
}
