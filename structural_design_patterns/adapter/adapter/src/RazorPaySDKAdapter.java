package structural_design_patterns.adapter.adapter.src;

public class RazorPaySDKAdapter implements PaymentProcessor {
    private final RazorPaySDK razorpay = new RazorPaySDK();

    @Override
    public void pay(double amount) {
        razorpay.makePayment(amount);
    } 
}
