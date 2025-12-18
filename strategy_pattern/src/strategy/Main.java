package strategy_pattern.src.strategy;

import strategy_pattern.src.strategy.src.BillingService;
import strategy_pattern.src.strategy.src.DiscountStrategy;
import strategy_pattern.src.strategy.src.FestivalDiscount;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new FestivalDiscount();

        BillingService billing = new BillingService(strategy);
        double finalBill = billing.calculateFinalAmount(1000);
        System.out.println("Final Bill: " + finalBill);
    }
}
