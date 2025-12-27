package structural_design_patterns.adapter.adapter_factory_combined.src;

public class PaymentFactory {
    public static PaymentProcessor getPaymentProcessor(String type) {
        return switch (type) {
            case "RAZORPAY" -> new RazorPaySDKAdapter();
            case "PAYPAL" -> new PaypalAPIAdapter();
            default -> throw new AssertionError();
        };
    }
}
