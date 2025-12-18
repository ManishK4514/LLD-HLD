package strategy_pattern.src.strategy.src;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }
}
