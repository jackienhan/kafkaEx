package builder;

import builder.generic.GenericBurger;
import builder.generic.GenericHelper;
import builder.generic.GenericMethodsHelper;

public class BuilderApplication {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
        System.out.println("\n\nTest Generic!!");
        Burger burger = GenericHelper.getBurger(new VegBurger());
        GenericBurger genericBurger = new GenericBurger();
        genericBurger.action(burger);
     
    }
}
