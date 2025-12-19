package strategy_pattern.src.strategy_builder_combined.src.strategy;

import strategy_pattern.src.strategy_builder_combined.src.strategy.src.BillingService;
import strategy_pattern.src.strategy_builder_combined.src.strategy.src.DiscountFactory;
import strategy_pattern.src.strategy_builder_combined.src.strategy.src.DiscountStrategy;


public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = DiscountFactory.getDiscountType("STUDENT_DISCOUNT");

        BillingService billing = new BillingService(strategy);
        double finalBill = billing.calculateFinalAmount(1000);
        System.out.println("Final Bill: " + finalBill);
    }
}
