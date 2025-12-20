import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();
    private Map<String, ReserverPayer> customers = new HashMap<>();
    private List<Reservation> allReservations = new ArrayList<>();
    private int reservationCounter = 1001;

    public void addHotel(Hotel hotel) { hotels.put(hotel.getName(), hotel); }
    public void addCustomer(ReserverPayer c) { customers.put(c.getId(), c); }

    // Fig 15 & 16: Complete Workflow
    public void makeReservation(String hotelName, String customerId, Date start, Date end) {
        Hotel hotel = hotels.get(hotelName);
        ReserverPayer payer = customers.get(customerId);

        if (hotel == null || payer == null) {
            throw new NoSuchElementException("Hotel or Customer record not found!");
        }

        Room freeRoom = hotel.findFreeRoom();

        if (freeRoom != null) {
            // Fig 17: Creating the Link
            Reservation newRes = new Reservation(reservationCounter++, start, end, freeRoom, payer);
            allReservations.add(newRes);
            System.out.println("Success: Reservation #" + newRes.getNumber() + " created for Room " + freeRoom.getNumber());
        } else {
            System.out.println("Sorry: No rooms available in " + hotelName);
        }
    }
}