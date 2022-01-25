import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    @Test
    public void givenHotelName_WhenProper_ShouldReturnValueisTrue() {
        Hotel obj = new Hotel();
        Boolean actualresult = obj.testHotel("LakeWood",110);
        Assertions.assertTrue(actualresult);
    }
}
