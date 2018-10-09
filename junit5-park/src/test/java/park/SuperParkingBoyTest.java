package park;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperParkingBoyTest {
    @Test
    public void should_park_into_largest_remainSpots_rate_parkingLot() {
        ParkLot parkLot1 = new ParkLot(5);
        ParkLot parkLot2 = new ParkLot(1);
        SuperParkingBoy superParkingBoy = new SuperParkingBoy(parkLot1, parkLot2);
        Car car1 = new Car();
        Car car2 = new Car();

        ParkTicket ticket1 = superParkingBoy.park(car1);
        assertThat(parkLot1.getParkLotSize()).isEqualTo(1);
        assertThat(parkLot2.getParkLotSize()).isEqualTo(0);

        ParkTicket ticket2 = superParkingBoy.park(car2);
        assertThat(parkLot1.getParkLotSize()).isEqualTo(1);
        assertThat(parkLot2.getParkLotSize()).isEqualTo(1);

    }
}
