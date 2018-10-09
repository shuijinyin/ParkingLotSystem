package park;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SmartParkingBoy extends ParkingBoy {
    public SmartParkingBoy(ParkLot... parkLot) {
        super(parkLot);
    }
    @Override
    public ParkTicket park(Car car) {

        ParkLot largestRoomParkLot = parkLots.get(0);
        for (ParkLot parkLot : parkLots){
            if (parkLot.getRemainSpots() > largestRoomParkLot.getRemainSpots()){
                largestRoomParkLot = parkLot;
            }
        }
        return largestRoomParkLot.park(car);
    }

}
