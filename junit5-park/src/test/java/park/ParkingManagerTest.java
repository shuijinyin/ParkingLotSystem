package park;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingManagerTest {
    @Test
    public void should_parkingManager_assign_boys_to_park(){
        ParkLot parkLot = new ParkLot(1);
        ParkingBoy boy = new ParkingBoy(parkLot);
        ParkingManager manager = new ParkingManager();
        manager.addBoy("Nick",boy);
        manager.assignBoyToPark("Nick", new Car());
        assertThat(parkLot.getParkLotSize()).isEqualTo(1);
    }

    @Test
    public void should_parkingManager_park_cars_(){
        //given
        ParkLot parkLot1 = new ParkLot(1);

        ParkingManager manager = new ParkingManager(parkLot1);

        //when
        ParkTicket ticket = manager.park(new Car());

        //then
        assertTrue(parkLot1.isFull());

    }
}
