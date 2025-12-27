package structural_design_patterns.adapter.adapter.src;

public class PaypalAPI {
    protected void pay(double amount) {
        System.out.println("Paid Via Paypal API: " + amount);
    }
}
