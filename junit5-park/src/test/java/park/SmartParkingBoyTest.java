package park;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;



public class SmartParkingBoyTest {
    @Test
    public void should_park_into_largest_room_parkingLot() {
        //given
        ParkLot parkLot1 = new ParkLot(2);
        ParkLot parkLot2 = new ParkLot(1);
        SmartParkingBoy boy = new SmartParkingBoy(parkLot1, parkLot2);

        //when
        boy.park(new Car());

        //then
        assertThat(parkLot1.getParkLotSize()).isEqualTo(1);
    }
}
