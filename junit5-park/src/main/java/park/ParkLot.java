package park;

import java.util.HashMap;
import java.util.Map;

public class ParkLot {
    private final int capacity;
    private final Map<ParkTicket,Car> parkTicketCarHashMap;

    public ParkLot(int capacity) {
        parkTicketCarHashMap = new HashMap<ParkTicket, Car>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public ParkTicket park(Car car) {
        ParkTicket ticket = new ParkTicket();
        parkTicketCarHashMap.put(ticket, car);
        return ticket;
    }

    public Car pickup(ParkTicket parkTicket) {
        return parkTicketCarHashMap.remove(parkTicket);
    }

    public boolean isFull() {
        return parkTicketCarHashMap.size() == this.capacity;
    }

    public int getParkLotSize(){
        return parkTicketCarHashMap.size();
    }

    public int getRemainSpots(){
        return capacity - parkTicketCarHashMap.size();
    }

    public double remainSpotsRate() {
        return (capacity - parkTicketCarHashMap.size()) * 1.0 / capacity;
    }
//    public Car pickUp(ParkTicket parkTicket) {
//        return parkTicketCarHashMap.remove(parkTicket);
//    }
}
