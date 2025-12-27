package behavioural_design_patterns.strategy.strategy.src;

public class BillingService {
    private final DiscountStrategy discountStrategy;

    public BillingService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(double amount) {
        return amount - discountStrategy.applyDiscount(amount);
    }
}
