package adapter_pattern.src.adapter_factory_combined.src;

public class RazorPaySDKAdapter implements PaymentProcessor {
    private RazorPaySDK razorpay = new RazorPaySDK();

    @Override
    public void pay(double amount) {
        razorpay.makePayment(amount);
    } 
}
