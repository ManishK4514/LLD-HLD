package parking_lot.src.service;

import java.util.HashMap;
import java.util.Map;
import parking_lot.src.model.Ticket;
import parking_lot.src.model.Vehicle;

public class TicketService {

  private final Map<String, Ticket> ticketRepository = new HashMap<>();

  public Ticket createTicket(Vehicle vehicle, String spotId, int floorNumber) {
    Ticket ticket = new Ticket(vehicle, spotId, floorNumber);
    ticketRepository.put(ticket.getId(), ticket);
    return ticket;
  }

  public Ticket closeTicket(String ticketId) {
    Ticket ticket = ticketRepository.get(ticketId);
    if (ticket == null) {
      throw new IllegalArgumentException("Ticket not found: " + ticketId);
    }
    if (!ticket.isClosed()) {
      ticket.close();
    }
    return ticket;
  }

  public Ticket getTicketDetails(String ticketId) {
    Ticket ticket = ticketRepository.get(ticketId);
    if (ticket == null) {
      throw new IllegalArgumentException("Ticket not found: " + ticketId);
    }
    return ticket;
  }
}
