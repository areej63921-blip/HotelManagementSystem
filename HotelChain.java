import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();
    private Map<String, ReserverPayer> customers = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void performMaintenance() {
        if(canMakeReservation() && canCancelReservation() && 
           canCheckInGuest() && canCheckOutGuest()) {
            System.out.println("System maps: " + hotels.size() + ", Res: " + reservations.size());
        }
    }

    private boolean canMakeReservation() { return true; }
    private boolean canCancelReservation() { return true; }
    private boolean canCheckInGuest() { return true; }
    private boolean canCheckOutGuest() { return true; }

    public void addHotel(Hotel hotel) { hotels.put(hotel.getName(), hotel); }
}