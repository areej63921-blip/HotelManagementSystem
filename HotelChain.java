import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();
    private Map<String, ReserverPayer> customers = new HashMap<>();

    public void addHotel(Hotel hotel) {
        hotels.put(hotel.getName(), hotel);
    }

    // Fig 15: Interaction logic
    public void processReservationRequest(String hotelName, String customerId) {
        Hotel hotel = hotels.get(hotelName);
        if (hotel == null) throw new IllegalArgumentException("Hotel not found!");

        // Step 1: Communication with Hotel object
        Room availableRoom = hotel.findFreeRoom();

        if (availableRoom != null) {
            System.out.println("Room " + availableRoom.getNumber() + " is available in " + hotelName);
            // In Version 5, we will link this to a Reservation object
        } else {
            System.out.println("No rooms available in " + hotelName);
        }
    }
}