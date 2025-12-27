package behavioural_design_patterns.strategy_pattern.src.strategy_factory_combined.src.strategy;

import behavioural_design_patterns.strategy_pattern.src.strategy_factory_combined.src.strategy.src.BillingService;
import behavioural_design_patterns.strategy_pattern.src.strategy_factory_combined.src.strategy.src.DiscountFactory;
import behavioural_design_patterns.strategy_pattern.src.strategy_factory_combined.src.strategy.src.DiscountStrategy;


public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = DiscountFactory.getDiscountType("STUDENT_DISCOUNT");

        BillingService billing = new BillingService(strategy);
        double finalBill = billing.calculateFinalAmount(1000);
        System.out.println("Final Bill: " + finalBill);
    }
}
