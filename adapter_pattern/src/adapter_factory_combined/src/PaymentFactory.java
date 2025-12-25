package adapter_pattern.src.adapter_factory_combined.src;

public class PaymentFactory {
    public static PaymentProcessor getPaymentProcessor(String type) {
        switch (type) {
            case "RAZORPAY":
                return new RazorPaySDKAdapter();

            case "PAYPAL":
                return new PaypalAPIAdapter();    
                
            default:
                throw new AssertionError();
        }
    }
}
