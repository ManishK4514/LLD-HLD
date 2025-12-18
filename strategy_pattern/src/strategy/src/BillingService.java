package strategy_pattern.src.strategy.src;

public class BillingService {
    private DiscountStrategy discountStrategy;

    public BillingService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(double amount) {
        return amount - discountStrategy.applyDiscount(amount);
    }
}
