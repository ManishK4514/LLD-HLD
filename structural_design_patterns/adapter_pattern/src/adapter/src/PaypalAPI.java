package structural_design_patterns.adapter_pattern.src.adapter.src;

public class PaypalAPI {
    void pay(double amount) {
        System.out.println("Paid Via Paypal API: " + amount);
    }
}
