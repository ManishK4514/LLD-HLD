package behavioural_design_patterns.strategy.strategy_factory_combined.src;

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
