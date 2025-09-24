package factory_pattern.src.factory.src;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza 🍅");
    }
}