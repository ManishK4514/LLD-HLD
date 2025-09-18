package decorator_pattern;

import decorator_pattern.src.decorator.CheeseDecorator;
import decorator_pattern.src.decorator.MushroomDecorator;
import decorator_pattern.src.decorator.OliveDecorator;
import decorator_pattern.src.pizza.Pizza;
import decorator_pattern.src.pizza.PlainPizza;

class Main {

  public static void main(String[] args) {
    // Create a plain pizza
    Pizza pizza = new PlainPizza();
    System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

    // Add cheese topping
    pizza = new CheeseDecorator(pizza);
    System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

    // Add olive topping
    pizza = new OliveDecorator(pizza);
    System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

    // Add mushroom topping
    pizza = new MushroomDecorator(pizza);
    System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());
  }
}
