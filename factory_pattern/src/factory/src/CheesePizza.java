package factory_pattern.src.factory.src;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza 🍕");
    }
}