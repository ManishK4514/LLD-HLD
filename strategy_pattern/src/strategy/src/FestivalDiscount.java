package strategy_pattern.src.strategy.src;

public class FestivalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.20;
    }
}
