package adapter_pattern.src.adapter.src;

public class PaypalAPIAdapter implements PaymentProcessor {
    private PaypalAPI paypal = new PaypalAPI();

    @Override
    public void pay(double amount) {
        paypal.pay(amount);
    }
}
