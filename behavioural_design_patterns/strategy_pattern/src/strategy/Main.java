/**
 * The real problem the Strategy pattern solves:
 *
 * Without Strategy, business logic selects behavior using conditional logic:
 *
 *   double discount;
 *   if (type.equals("STUDENT")) {
 *       discount = amount * 0.10;
 *   } else if (type.equals("FESTIVAL")) {
 *       discount = amount * 0.20;
 *   } else if (type.equals("PREMIUM")) {
 *       discount = amount * 0.30;
 *   }
 *
 * Why that's bad:
 * - Core logic is tightly coupled to specific behaviors.
 * - Adding or changing a rule requires modifying existing code.
 * - Large if-else / switch blocks grow over time.
 * - Individual behaviors cannot be tested or reused independently.
 *
 * The deeper issue: varying behavior is hard-coded into business logic.
 *
 * Strategy pattern — core idea:
 * - Define a family of algorithms (strategies).
 * - Encapsulate each algorithm behind a common interface.
 * - Make the algorithm interchangeable at runtime.
 *
 * Clients depend on the strategy abstraction, not on concrete implementations.
 *
 * Example usage:
 *   DiscountStrategy strategy = new FestivalDiscount();
 *   BillingService billing = new BillingService(strategy);
 *   double finalAmount = billing.calculateFinalAmount(1000);
 *
 * Important notes:
 * - Strategy removes conditional logic from the context class.
 * - New behaviors can be added without modifying existing code
 *   (follows Open/Closed Principle).
 * - Strategy is often combined with Factory to decide which strategy to use.
 *
 * NOTE: Use Strategy when behavior varies independently from the objects
 * that use it. Avoid it if there is only one fixed behavior.
 */

package behavioural_design_patterns.strategy_pattern.src.strategy;

import behavioural_design_patterns.strategy_pattern.src.strategy.src.BillingService;
import behavioural_design_patterns.strategy_pattern.src.strategy.src.DiscountStrategy;
import behavioural_design_patterns.strategy_pattern.src.strategy.src.FestivalDiscount;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy strategy = new FestivalDiscount();

        BillingService billing = new BillingService(strategy);
        double finalBill = billing.calculateFinalAmount(1000);
        System.out.println("Final Bill: " + finalBill);
    }
}
