package parking_lot.src.strategy;

import parking_lot.src.model.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
