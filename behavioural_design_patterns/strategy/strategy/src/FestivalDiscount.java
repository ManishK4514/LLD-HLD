package behavioural_design_patterns.strategy.strategy.src;

public class FestivalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.20;
    }
}
