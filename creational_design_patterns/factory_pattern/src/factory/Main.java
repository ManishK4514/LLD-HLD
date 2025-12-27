/**
 * The real problem the Factory pattern solves:
 *
 * Without a factory, business logic must construct concrete implementations:
 *
 *   Payment payment;
 *   if (type.equals("CARD")) {
 *       payment = new CardPayment();
 *   } else if (type.equals("UPI")) {
 *       payment = new UpiPayment();
 *   } ...
 *
 * Why that's bad:
 * - Business logic depends on concrete classes.
 * - Adding a new payment method requires changing client code (violates Open/Closed).
 * - Unit testing and substitution become harder.
 *
 * The deeper issue: object creation is leaking into business logic.
 *
 * Factory pattern — core idea:
 * - Encapsulate object-creation logic and return an abstraction (interface).
 * - Clients depend on the interface, not on concrete implementations or "new".
 *
 * Example usage:
 *   Payment p = PaymentFactory.getPaymentMethod("CARD");
 *
 * NOTE: package must match the directory under your src root. This file is under
 * src/factory so use package "factory".
 */

package creational_design_patterns.factory_pattern.src.factory;

import creational_design_patterns.factory_pattern.src.factory.src.Payment;
import creational_design_patterns.factory_pattern.src.factory.src.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = PaymentFactory.getPaymentMethod("CARD");
        payment1.pay(100.0);

        Payment payment2 = PaymentFactory.getPaymentMethod("UPI");
        payment2.pay(200.0);
    }
}
