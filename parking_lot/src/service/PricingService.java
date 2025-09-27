package parking_lot.src.service;

public class PricingService {
    public double calculateParkingFee(String vehicleType, int hoursParked) {
        double ratePerHour;
        switch (vehicleType) {
            case "CAR":
                ratePerHour = 20.0;
                break;
            case "BIKE":
                ratePerHour = 10.0;
                break;
            case "TRUCK":
                ratePerHour = 30.0;
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
        return ratePerHour * hoursParked;
    }
}
