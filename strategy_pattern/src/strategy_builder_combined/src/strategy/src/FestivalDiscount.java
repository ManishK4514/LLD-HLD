package strategy_pattern.src.strategy_builder_combined.src.strategy.src;

public class FestivalDiscount implements DiscountStrategy, Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.20;
    }

    @Override
    public void getDiscountType() {
        System.out.println("Festival Discount");
    }
}
