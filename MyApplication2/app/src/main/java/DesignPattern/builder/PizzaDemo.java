package DesignPattern.builder;

import android.util.Log;

public class PizzaDemo {
    public static void buildPizza(){
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawiianBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        Log.i("Outcome","Pizza builded");
    }
}
