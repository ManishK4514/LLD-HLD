package structural_design_patterns.adapter.adapter.src;

public class PaypalAPIAdapter implements PaymentProcessor {
    private final PaypalAPI paypal = new PaypalAPI();

    @Override
    public void pay(double amount) {
        paypal.pay(amount);
    }
}
