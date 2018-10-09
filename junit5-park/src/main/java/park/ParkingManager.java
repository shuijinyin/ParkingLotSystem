package park;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParkingManager extends ParkingBoy {
    private final Map<String, ParkingBoy> parkingBoyNameMap;

    public ParkingManager(ParkLot... parkLots) {
        super(parkLots);
        parkingBoyNameMap = new HashMap<String, ParkingBoy>();
    }


    public void addBoy(String boyName, ParkingBoy parkingBoy) {
        parkingBoyNameMap.put(boyName, parkingBoy);
    }

    public ParkTicket assignBoyToPark(String name, Car car) {
        return parkingBoyNameMap.get(name).park(car);
    }

    public int getTotalParkedCarNumber() {
        int parkedCarNumberSum = getCarNumber();
        Iterator iterator = parkingBoyNameMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            ParkingBoy boy = (ParkingBoy) entry.getValue();
            parkedCarNumberSum += boy.getCarNumber();
        }
        return parkedCarNumberSum;
    }

    public int getTotalParkLotsCapacity() {
        int parkLotsCapacitySum = getParkingLotsCapacity();
        Iterator iterator = parkingBoyNameMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            ParkingBoy boy = (ParkingBoy) entry.getValue();
            parkLotsCapacitySum += boy.getParkingLotsCapacity();
        }
        return parkLotsCapacitySum;
    }



}
