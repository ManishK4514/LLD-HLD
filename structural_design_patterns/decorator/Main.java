/**
 * The real problem the Decorator pattern solves:
 *
 * Sometimes objects need additional behavior or features to be added
 * dynamically, without modifying the original class or creating a large
 * number of subclasses.
 *
 * Without Decorator, feature combinations are usually handled like this:
 *
 *   class CheeseOlivePizza extends Pizza { ... }
 *   class CheeseMushroomPizza extends Pizza { ... }
 *   class CheeseOliveMushroomPizza extends Pizza { ... }
 *
 * Why that's bad:
 * - Class explosion as combinations grow.
 * - Rigid design that cannot be extended dynamically.
 * - Violates Open/Closed Principle.
 *
 * The deeper issue:
 * - Behavior extension is tied to inheritance instead of composition.
 *
 * Decorator pattern — core idea:
 * - Wrap an object to add new behavior without altering its structure.
 * - Decorators implement the same interface as the wrapped object.
 * - Behavior can be layered dynamically at runtime.
 *
 * Each decorator:
 * - Has a reference to a base object (Pizza).
 * - Adds its own behavior (cost + description).
 * - Delegates the rest to the wrapped object.
 *
 * Flow:
 *   1. Create a base object (PlainPizza).
 *   2. Wrap it with one or more decorators (Cheese, Olive, Mushroom).
 *   3. Each decorator adds its own responsibility.
 *
 * Example usage:
 *   Pizza pizza = new PlainPizza();
 *   pizza = new CheeseDecorator(pizza);
 *   pizza = new OliveDecorator(pizza);
 *   pizza = new MushroomDecorator(pizza);
 *
 *   System.out.println(pizza.getDescription());
 *   System.out.println(pizza.getCost());
 *
 * Benefits:
 * - Avoids subclass explosion.
 * - Allows flexible and dynamic feature composition.
 * - Follows Open/Closed Principle.
 * - Uses composition over inheritance.
 *
 * Important notes:
 * - Order of decorators may affect behavior (cost/description).
 * - Decorator and base component must share the same interface.
 * - Overusing decorators can make debugging harder due to deep wrapping.
 *
 * NOTE:
 * - Decorator answers "what extra features should this object have?"
 * - It is commonly used in pricing, logging, security, and UI frameworks.
 */

package structural_design_patterns.decorator;

import structural_design_patterns.decorator.src.decorator.CheeseDecorator;
import structural_design_patterns.decorator.src.decorator.MushroomDecorator;
import structural_design_patterns.decorator.src.decorator.OliveDecorator;
import structural_design_patterns.decorator.src.pizza.Pizza;
import structural_design_patterns.decorator.src.pizza.PlainPizza;

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
