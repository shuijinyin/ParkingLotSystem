package park;


public class SuperParkingBoy extends ParkingBoy {
    public SuperParkingBoy(ParkLot... parkLot) {
        super(parkLot);
    }

    @Override
    public ParkTicket park(Car car) {
        ParkLot mostEmptyParkLot = parkLots.get(0);
        for (ParkLot parkLot : parkLots){
            if (parkLot.remainSpotsRate() > mostEmptyParkLot.remainSpotsRate()){
                mostEmptyParkLot = parkLot;
            }
        }
        return mostEmptyParkLot.park(car);
    }
}
