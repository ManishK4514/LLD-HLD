package parking_lot.src.model;

import java.time.Instant;
import java.util.UUID;

public class Ticket {
    private final String id;
    private final Vehicle vehicle;
    private final String spotId;
    private final int floorNumber;
    private final Instant entryTime;
    private Instant exitTime;
    private boolean closed = false;

    public Ticket(Vehicle vehicle, String spotId, int floorNumber) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spotId = spotId;
        this.floorNumber = floorNumber;
        this.entryTime = Instant.now();
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotId() {
        return spotId;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public Instant getExitTime() {
        return exitTime;
    }

    public void close() {
        this.exitTime = Instant.now();
        this.closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}