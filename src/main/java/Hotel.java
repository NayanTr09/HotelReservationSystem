import com.hotelreservationsystem.HotelReservationSystem;
public class Hotel {
    String HotelName;
    int Rates;

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public Boolean testHotel(String HotelName, int Rates) {
        if (HotelName == "LakeWood") {
            return true;
        } else if (HotelName == "BridgeWood") {
            return true;
        } else if (HotelName == "RidgeWood") {
            return true;
        }
        else
            return false;
    }
}


