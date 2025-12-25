package adapter_pattern.src.adapter;

import adapter_pattern.src.adapter.src.PaymentProcessor;
import adapter_pattern.src.adapter.src.PaypalAPIAdapter;
import adapter_pattern.src.adapter.src.RazorPaySDKAdapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new RazorPaySDKAdapter();
        processor1.pay(1000);

        PaymentProcessor processor2 = new PaypalAPIAdapter();
        processor2.pay(2000);
    }
}
