package strategy_pattern.src.strategy_factory_combined.src.strategy.src;

public class PremiumDiscount implements DiscountStrategy, Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.30;
    }

    @Override
    public void getDiscountType() {
        System.out.println("Premium Discount");
    }
}
