/**
 * The real problem the Abstract Factory pattern solves:
 *
 * In many systems, objects are not created in isolation. They belong to
 * a family of related and compatible components that must be used together.
 *
 * Example:
 * - India environment:
 *     - UPI / RuPay payment
 *     - India-specific tax calculation
 *
 * - International environment:
 *     - Credit Card / PayPal payment
 *     - International tax calculation
 *
 * Without Abstract Factory, client code would manually mix and match
 * implementations:
 *
 *   Payment payment = new UpiPayment();
 *   TaxCalculator tax = new InternationalTaxCalculator();  // ❌ incompatible
 *
 * Why that's bad:
 * - No guarantee of compatibility between related objects.
 * - Business logic must know concrete classes.
 * - Switching environments requires touching multiple places in code.
 *
 * The deeper issue: creation of *families* of objects is leaking into client logic.
 *
 * Abstract Factory pattern — core idea:
 * - Provide an interface for creating a set of related objects.
 * - Ensure that objects created by the same factory are compatible.
 * - Hide concrete implementations behind a common factory abstraction.
 *
 * Example usage:
 *   PaymentFactory factory = new IndiaIndiaFactory();
 *   Payment payment = factory.createPaymentMethod();
 *   TaxCalculator taxCalculator = factory.createTaxCalculator();
 *
 * Switching the entire family of objects requires changing only the factory:
 *
 *   PaymentFactory factory = new InternationalPaymentFactory();
 *
 * Important notes:
 * - Abstract Factory is NOT about creating a single object.
 * - It enforces consistency across a group of related components.
 * - Overusing it when no "family" concept exists leads to unnecessary complexity.
 *
 * NOTE: Abstract Factory is most useful when the system must support multiple
 * environments, platforms, or variants without mixing implementations.
 */

package factory_pattern.src.abstractfactory;

import factory_pattern.src.abstractfactory.src.IndiaIndiaFactory;
import factory_pattern.src.abstractfactory.src.InternationalPaymentFactory;
import factory_pattern.src.abstractfactory.src.Payment;
import factory_pattern.src.abstractfactory.src.PaymentFactory;
import factory_pattern.src.abstractfactory.src.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new IndiaIndiaFactory();
        Payment payment = factory.createPaymentMethod();
        TaxCalculator taxCalculator = factory.createTaxCalculator();

        payment.pay(1000);
        double tax = taxCalculator.calculateTax(1000);
        System.out.println("Tax calculated: " + tax);

        PaymentFactory factory2 = new InternationalPaymentFactory();
        Payment payment2 = factory2.createPaymentMethod();
        TaxCalculator taxCalculator2 = factory2.createTaxCalculator();

        payment2.pay(2000);
        double tax2 = taxCalculator2.calculateTax(2000);
        System.out.println("Tax calculated: " + tax2);
    }
}