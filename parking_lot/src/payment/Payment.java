package parking_lot.src.payment;

import parking_lot.src.enums.PaymentStatus;

public class Payment {
    private final String ticketId;
    private final double amount;
    private PaymentStatus status;

    public Payment(String ticketId, double amount) {
        this.ticketId = ticketId;
        this.amount = amount;
        this.status = PaymentStatus.UNPAID;
    }

    public String getTicketId() { return ticketId; }
    public double getAmount() { return amount; }
    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus s) { this.status = s; }
}
