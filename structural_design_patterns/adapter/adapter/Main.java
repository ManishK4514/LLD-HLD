/**
 * The real problem the Adapter pattern solves:
 *
 * Without Adapter, business logic directly depends on third-party or legacy APIs:
 *
 *   if (type.equals("RAZORPAY")) {
 *       razorpaySDK.makePayment(amount);
 *   } else if (type.equals("PAYPAL")) {
 *       paypalAPI.sendMoney(amount);
 *   }
 *
 * Why that's bad:
 * - Business logic is tightly coupled to vendor APIs.
 * - Changing or adding a provider requires modifying core code.
 * - Third-party method names and behaviors leak into your system.
 * - Unit testing becomes difficult without real SDKs.
 *
 * The deeper issue: integration logic is mixed with business logic.
 *
 * Adapter pattern — core idea:
 * - Convert the interface of an existing class into an interface
 *   that the client expects.
 * - Wrap third-party or legacy implementations behind a common abstraction.
 * - Allow incompatible interfaces to work together without modification.
 *
 * Clients depend on the adapter abstraction, not on concrete SDKs.
 *
 * Example usage:
 *   PaymentProcessor processor1 = new RazorPaySDKAdapter();
 *   processor1.pay(1000);
 *
 *   PaymentProcessor processor2 = new PaypalAPIAdapter();
 *   processor2.pay(2000);
 *
 * Important notes:
 * - Adapter hides vendor-specific details from the core system.
 * - New providers can be integrated by adding new adapters,
 *   without changing existing business logic (follows Open/Closed Principle).
 * - Adapter focuses on compatibility, not on adding new behavior.
 *
 * NOTE: Use Adapter when integrating external systems or legacy code
 * whose interfaces cannot be changed to match your application's design.
 */

package structural_design_patterns.adapter.adapter;

import structural_design_patterns.adapter.adapter.src.PaymentProcessor;
import structural_design_patterns.adapter.adapter.src.PaypalAPIAdapter;
import structural_design_patterns.adapter.adapter.src.RazorPaySDKAdapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new RazorPaySDKAdapter();
        processor1.pay(1000);

        PaymentProcessor processor2 = new PaypalAPIAdapter();
        processor2.pay(2000);
    }
}
