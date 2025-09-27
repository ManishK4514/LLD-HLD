package parking_lot.src.strategy;

import java.time.Duration;

import parking_lot.src.model.Ticket;

public class HourlyPricing implements PricingStrategy {
    private final double pricePerHour;

    public HourlyPricing(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calculate(Ticket ticket) {
        if (!ticket.isClosed()) ticket.close(); 
        long seconds = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).getSeconds();
        double hours = Math.ceil(seconds / 3600.0);
        return hours * pricePerHour;
    }
}
