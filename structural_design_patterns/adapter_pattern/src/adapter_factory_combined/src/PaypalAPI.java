package structural_design_patterns.adapter_pattern.src.adapter_factory_combined.src;

public class PaypalAPI {
    void pay(double amount) {
        System.out.println("Paid Via Paypal API: " + amount);
    }
}
