package creational_design_patterns.factory.src;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        return switch (type) {
            case "CARD" -> new CardPayment();
            case "UPI" -> new UpiPayment();
            default -> throw new IllegalArgumentException("Unknown payment method: " + type);
        };
    }
}