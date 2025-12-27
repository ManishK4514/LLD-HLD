package structural_design_patterns.adapter_pattern.src.adapter.src;

public class RazorPaySDKAdapter implements PaymentProcessor {
    private RazorPaySDK razorpay = new RazorPaySDK();

    @Override
    public void pay(double amount) {
        razorpay.makePayment(amount);
    } 
}
