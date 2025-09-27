package parking_lot.src.service;

import java.util.Optional;
import parking_lot.src.enums.SpotType;
import parking_lot.src.model.*;

public class ParkingService {

  private final ParkingLot parkingLot;
  private final TicketService ticketService;

  public ParkingService(ParkingLot parkingLot, TicketService ticketService) {
    this.parkingLot = parkingLot;
    this.ticketService = ticketService;
  }

  // Park a vehicle and generate a ticket
  public Ticket parkVehicle(Vehicle vehicle, SpotType spotType) {
    for (ParkingFloor floor : parkingLot.getFloors()) {
      Optional<ParkingSpot> freeSpot = floor
        .getParkingSpots()
        .stream()
        .filter(spot -> !spot.isOccupied() && spot.getSpotType() == spotType)
        .findFirst();

      if (freeSpot.isPresent()) {
        ParkingSpot spot = freeSpot.get();
        spot.parkVehicle(vehicle);

        // Create ticket
        Ticket ticket = ticketService.createTicket(
          vehicle,
          spot.getSpotId(),
          Integer.parseInt(floor.getFloorId())
        );
        return ticket;
      }
    }
    throw new IllegalStateException("No available spot for type: " + spotType);
  }

  // Unpark vehicle and close ticket
  public Ticket unparkVehicle(String ticketId) {
    Ticket ticket = ticketService.getTicketDetails(ticketId);
    if (ticket.isClosed()) {
      throw new IllegalStateException("Ticket already closed: " + ticketId);
    }

    parkingLot
      .getFloor(String.valueOf(ticket.getFloorNumber()))
      .ifPresent(floor ->
        floor
          .getParkingSpots()
          .stream()
          .filter(s -> s.getSpotId().equals(ticket.getSpotId()))
          .findFirst()
          .ifPresent(ParkingSpot::removeVehicle)
      );

    return ticketService.closeTicket(ticketId);
  }

  // Utility: count available spots for a type
  public long getAvailableSpots(SpotType type) {
    return parkingLot
      .getFloors()
      .stream()
      .flatMap(floor -> floor.getParkingSpots().stream())
      .filter(spot -> !spot.isOccupied() && spot.getSpotType() == type)
      .count();
  }
}
