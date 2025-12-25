package adapter_pattern.src.adapter_factory_combined.src;

public class PaypalAPIAdapter implements PaymentProcessor {
    private PaypalAPI paypal = new PaypalAPI();

    @Override
    public void pay(double amount) {
        paypal.pay(amount);
    }
}
