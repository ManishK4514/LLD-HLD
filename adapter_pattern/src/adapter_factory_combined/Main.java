/**
 * The real problem the Adapter + Factory combination solves:
 *
 * Adapter makes incompatible third-party APIs work with your system,
 * but it does NOT decide which adapter should be used.
 *
 * Without a Factory, client code still selects adapters manually:
 *
 *   PaymentProcessor processor;
 *   if (type.equals("RAZORPAY")) {
 *       processor = new RazorPaySDKAdapter();
 *   } else if (type.equals("PAYPAL")) {
 *       processor = new PaypalAPIAdapter();
 *   }
 *
 * Why that's bad:
 * - Client code knows concrete adapter classes.
 * - Vendor-selection logic is duplicated across the application.
 * - Adding a new provider requires modifying existing code.
 *
 * The deeper issue:
 * - Integration compatibility is solved (Adapter),
 *   but object selection is still leaking into business logic.
 *
 * Adapter + Factory — core idea:
 * - Adapter encapsulates vendor-specific compatibility logic.
 * - Factory encapsulates the decision of which adapter to use.
 * - Client depends only on the common abstraction (PaymentProcessor).
 *
 * Flow:
 *   1. Client asks Factory for a PaymentProcessor based on provider type.
 *   2. Factory returns the appropriate Adapter.
 *   3. Adapter translates the call to the underlying SDK.
 *
 * Example usage:
 *   PaymentProcessor processor1 =
 *       PaymentFactory.getPaymentProcessor("RAZORPAY");
 *   processor1.pay(1000);
 *
 *   PaymentProcessor processor2 =
 *       PaymentFactory.getPaymentProcessor("PAYPAL");
 *   processor2.pay(2000);
 *
 * Benefits:
 * - No conditional logic in client code.
 * - New payment providers can be added without modifying existing callers.
 * - Vendor integration is clean, centralized, and testable.
 * - Follows Open/Closed Principle and Dependency Inversion.
 *
 * Important notes:
 * - Adapter handles "how to integrate a provider".
 * - Factory handles "which provider to choose".
 * - This combination is extremely common in real payment systems.
 *
 * NOTE: Use this pattern when integrating multiple external systems
 * and the provider selection logic should be centralized or configurable.
 */

package adapter_pattern.src.adapter_factory_combined;

import adapter_pattern.src.adapter_factory_combined.src.PaymentFactory;
import adapter_pattern.src.adapter_factory_combined.src.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor1 = PaymentFactory.getPaymentProcessor("RAZORPAY");
        processor1.pay(1000);

        PaymentProcessor processor2 =  PaymentFactory.getPaymentProcessor("PAYPAL");
        processor2.pay(2000);
    }
}
