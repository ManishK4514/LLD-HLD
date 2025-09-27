package parking_lot.src.strategy;

import parking_lot.src.enums.VehicleType;
import parking_lot.src.model.Ticket;

public class VehicleBasedPricing implements PricingStrategy {
    private final double carSurcharge;
    private final double bikeSurcharge;
    private final double truckSurcharge;

    public VehicleBasedPricing(double car, double bike, double truck) {
        this.carSurcharge = car;
        this.bikeSurcharge = bike;
        this.truckSurcharge = truck;
    }

    @Override
    public double calculate(Ticket ticket) {
        VehicleType t = ticket.getVehicle().getType();
        switch (t) {
            case CAR: return carSurcharge;
            case BIKE: return bikeSurcharge;
            case TRUCK: return truckSurcharge;
            default: return 0.0;
        }
    }
}
