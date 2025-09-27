package parking_lot.src.payment;

import parking_lot.src.enums.PaymentStatus;

public class CardPayment implements PaymentProcessor {
    @Override
    public Payment process(Payment payment) {
        payment.setStatus(PaymentStatus.PAID);
        System.out.println("Processed card payment for ticket " + payment.getTicketId() + " amount: " + payment.getAmount());
        return payment;
    }
}
