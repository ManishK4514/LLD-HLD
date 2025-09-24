package factory_pattern.src.factory;

import factory_pattern.src.factory.src.Pizza;
import factory_pattern.src.factory.src.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = PizzaFactory.createPizza("cheese");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.createPizza("veg");
        pizza2.prepare();
    }
}