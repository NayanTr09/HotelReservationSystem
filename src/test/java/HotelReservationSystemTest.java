import com.hotelreservationsystem.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {
    @Test
    public void givenHotelName_WhenProper_ShouldAddHotelNameandRates() {
        HotelReservationSystem obj= new HotelReservationSystem();
        boolean actualresult = obj.AddHotel("LakeWood",110);
        Assertions.assertTrue(actualresult);           //Check for Hotel LakeWood and Add it to List
    }
}
