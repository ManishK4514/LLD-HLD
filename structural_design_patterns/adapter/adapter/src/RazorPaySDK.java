package structural_design_patterns.adapter.adapter.src;

public class RazorPaySDK {
    protected void makePayment(double amount) {
        System.out.println("Paid via Razorpay: "+ amount);
    }
}
