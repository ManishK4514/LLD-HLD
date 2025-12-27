package structural_design_patterns.decorator_pattern.src.decorator;
import structural_design_patterns.decorator_pattern.src.pizza.Pizza;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.00; 
    }    
}