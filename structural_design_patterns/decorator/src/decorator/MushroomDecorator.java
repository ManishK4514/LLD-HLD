package structural_design_patterns.decorator.src.decorator;
import structural_design_patterns.decorator.src.pizza.Pizza;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.00;
    }
}