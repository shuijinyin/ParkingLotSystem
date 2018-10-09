package park;

import java.util.Arrays;
import java.util.List;

public class ParkingBoy {
    List<ParkLot> parkLots;


    public ParkingBoy(ParkLot... parkLot) {
        this.parkLots = Arrays.asList(parkLot);
    }

    public ParkTicket park(Car car) {
        if (!parkLots.get(0).isFull()){
           return parkLots.get(0).park(car);
        }
        else if(!parkLots.get(1).isFull()) {
           return parkLots.get(1).park(car);
        }
        else {
            throw new IndexOutOfBoundsException("1111");
        }
    }
    public Car pickup(ParkTicket ticket) {
        for (ParkLot parkLot : parkLots) {
            Car car = parkLot.pickup(ticket);
            if (car != null) {
                return car;
            }
        }
        throw new IndexOutOfBoundsException("ticket无效！");
    }

    public boolean allLotsAreFull() {
        for (ParkLot parkLot : parkLots) {
            if (!parkLot.isFull()) {
                return false;
            }
        }
        return true;
    }

    public int getCarNumber() {
        int carNumber = 0;
        for (ParkLot parkLot : parkLots) {
            carNumber += parkLot.getParkLotSize();
        }
        return carNumber;

    }

    public int getParkingLotsCapacity() {
        int parkLotsCapacity = 0;
        for (ParkLot parkLot : parkLots) {
            parkLotsCapacity += parkLot.getCapacity();
        }
        return parkLotsCapacity;
    }


}
