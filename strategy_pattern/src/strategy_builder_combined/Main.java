/**
 * The real problem the Strategy + Factory combination solves:
 *
 * Strategy alone removes conditional logic from business behavior,
 * but it does NOT solve how the correct strategy is chosen.
 *
 * Without a Factory, client code still decides which strategy to use:
 *
 *   DiscountStrategy strategy;
 *   if (type.equals("STUDENT")) {
 *       strategy = new StudentDiscount();
 *   } else if (type.equals("FESTIVAL")) {
 *       strategy = new FestivalDiscount();
 *   }
 *
 * Why that's bad:
 * - Client code knows concrete strategy classes.
 * - Strategy selection logic is duplicated across callers.
 * - Adding a new strategy requires changing client code.
 *
 * The deeper issue:
 * - Behavior variation is separated (Strategy),
 *   but object selection is still leaking into client logic.
 *
 * Strategy + Factory — core idea:
 * - Strategy encapsulates interchangeable behavior.
 * - Factory encapsulates the decision of which strategy to create.
 * - Client depends only on abstractions, never on concrete classes.
 *
 * Flow:
 *   1. Client asks Factory for a strategy (based on input/config).
 *   2. Factory returns the appropriate DiscountStrategy.
 *   3. Context (BillingService) uses the strategy polymorphically.
 *
 * Example usage:
 *   DiscountStrategy strategy =
 *       DiscountFactory.getDiscountType("STUDENT_DISCOUNT");
 *
 *   BillingService billing = new BillingService(strategy);
 *   double finalAmount = billing.calculateFinalAmount(1000);
 *
 * Benefits:
 * - No conditional logic in client code.
 * - New strategies can be added without modifying existing callers.
 * - Strategy selection is centralized and reusable.
 * - Follows Open/Closed Principle and Dependency Inversion.
 *
 * Important notes:
 * - Strategy handles "how the behavior works".
 * - Factory handles "which behavior to use".
 * - This combination is extremely common in interview and real systems.
 *
 * NOTE: Use this pattern when behavior varies AND the selection logic
 * should be centralized or configurable.
 */

package strategy_pattern.src.strategy_builder_combined;

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
