package behavioural_design_patterns.strategy.strategy_factory_combined.src;

public class StudentDiscount implements DiscountStrategy, Discount {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }

    @Override
    public void getDiscountType() {
        System.out.println("Student Discount");
    }
}
