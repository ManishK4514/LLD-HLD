package factory_pattern.src.factory.src;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        switch (type) {
            case "CARD":
                return new CardPayment();
            case "UPI":
                return new UpiPayment();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + type);
        }
    }
}