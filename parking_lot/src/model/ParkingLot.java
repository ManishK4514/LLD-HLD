package parking_lot.src.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {
    private  String name;
    private List<ParkingFloor> floors = new ArrayList<>();

    public ParkingLot(String name) {
        this.name = name;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public Optional<ParkingFloor> getFloor(String floorId) {
        return floors.stream().filter(f -> f.getFloorId().equals(floorId)).findFirst();
    }
}
