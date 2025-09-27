package parking_lot;

import parking_lot.src.enums.*;
import parking_lot.src.model.*;
import parking_lot.src.service.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static ParkingLot parkingLot;
    private static ParkingService parkingService;
    private static PricingService pricingService;
    private static TicketService ticketService;
    private static Scanner scanner = new Scanner(System.in);

    private static final Map<VehicleType, SpotType> VEHICLE_SPOT_MAPPING = new HashMap<>();

    static {
        VEHICLE_SPOT_MAPPING.put(VehicleType.BIKE, SpotType.BIKE);
        VEHICLE_SPOT_MAPPING.put(VehicleType.CAR, SpotType.COMPACT);  
        VEHICLE_SPOT_MAPPING.put(VehicleType.TRUCK, SpotType.LARGE);
    }

    public static void main(String[] args) {
        initializeParkingLot();
        runInteractiveMode();
    }

    private static void initializeParkingLot() {
        parkingLot = new ParkingLot("Downtown Parking");
        ticketService = new TicketService();
        parkingService = new ParkingService(parkingLot, ticketService);
        pricingService = new PricingService();

        // Floor 0 - Bikes and small cars
        ParkingFloor ground = new ParkingFloor("0");
        addSpots(ground, SpotType.BIKE, "B", 10);
        addSpots(ground, SpotType.COMPACT, "C", 20);
        parkingLot.addFloor(ground);

        // Floor 1 - Cars and trucks
        ParkingFloor first = new ParkingFloor("1");
        addSpots(first, SpotType.COMPACT, "C", 30);
        addSpots(first, SpotType.LARGE, "L", 15);
        parkingLot.addFloor(first);
    }

    private static void addSpots(ParkingFloor floor, SpotType type, String prefix, int count) {
        for (int i = 1; i <= count; i++) {
            floor.addParkingSpot(new ParkingSpot(floor.getFloorId() + prefix + i, type));
        }
    }

    private static void runInteractiveMode() {
        System.out.println("=== Parking Lot Interactive Mode ===");
        while (true) {
            System.out.print("\nCommand (park/unpark/display/available/quit): ");
            String cmd = scanner.nextLine().trim().toLowerCase();

            switch (cmd) {
                case "park" -> handlePark();
                case "unpark" -> handleUnpark();
                case "display" -> handleDisplay();
                case "available" -> handleAvailable();
                case "quit" -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Unknown command");
            }
        }
    }

    private static void handlePark() {
        try {
            System.out.print("License plate: ");
            String license = scanner.nextLine().trim();
            System.out.print("Vehicle type (CAR/BIKE/TRUCK): ");
            VehicleType type = VehicleType.valueOf(scanner.nextLine().trim().toUpperCase());
            Vehicle vehicle = switch (type) {
                case CAR -> new Car(license);
                case BIKE -> new Bike(license);
                case TRUCK -> new Truck(license);
            };
            Ticket ticket = parkingService.parkVehicle(vehicle, VEHICLE_SPOT_MAPPING.get(type));
            System.out.println("Parked! Ticket ID: " + ticket.getId() + ", Spot: " + ticket.getSpotId());
        } catch (Exception e) {
            System.out.println("Park failed: " + e.getMessage());
        }
    }

    private static void handleUnpark() {
        try {
            System.out.print("Ticket ID: ");
            String ticketId = scanner.nextLine().trim();
            Ticket ticket = parkingService.unparkVehicle(ticketId);
            System.out.println("Unparked! Vehicle: " + ticket.getVehicle().getLicensePlate());
        } catch (Exception e) {
            System.out.println("Unpark failed: " + e.getMessage());
        }
    }

    private static void handleDisplay() {
        for (ParkingFloor floor : parkingLot.getFloors()) {
            new DisplayBoard(floor).showAvailability();
        }
    }

    private static void handleAvailable() {
        for (SpotType type : SpotType.values()) {
            System.out.println(type + ": " + parkingService.getAvailableSpots(type));
        }
    }
}
