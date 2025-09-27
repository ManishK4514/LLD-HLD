package parking_lot.src.service;

import java.util.EnumMap;
import java.util.Map;
import parking_lot.src.enums.SpotType;
import parking_lot.src.model.ParkingFloor;

public class DisplayBoard {

  private final ParkingFloor floor;

  public DisplayBoard(ParkingFloor floor) {
    this.floor = floor;
  }

  public void showAvailability() {
    Map<SpotType, Long> availability = new EnumMap<>(SpotType.class);

    for (SpotType type : SpotType.values()) {
      long availableCount = floor
        .getParkingSpots()
        .stream()
        .filter(spot -> !spot.isOccupied() && spot.getSpotType() == type)
        .count();
      availability.put(type, availableCount);
    }

    System.out.println(
      "=== Availability on Floor " + floor.getFloorId() + " ==="
    );
    availability.forEach((type, count) ->
      System.out.println(type + " spots available: " + count)
    );
    System.out.println("=======================================");
  }
}
