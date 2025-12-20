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
    public void checkIn(int reservationNumber, String guestName, String passport) {
    Reservation foundRes = null;
    
    // Find the reservation
    for (Reservation res : allReservations) {
        if (res.getNumber() == reservationNumber) {
            foundRes = res;
            break;
        }
    }

    if (foundRes != null) {
        // Fig 11 & 12: Create Guest and link to Room
        Guest guest = new Guest(guestName, passport);
        
        // Accessing the room via reservation and changing state
        // (Note: We'll add a getter in Reservation for this)
        Room room = foundRes.getRoom(); 
        room.checkIn(); // Switches state to OCCUPIED (from V3)
        
        System.out.println("Check-in Successful: " + guestName + " is now in Room " + room.getNumber());
    } else {
        throw new NoSuchElementException("No reservation found with number: " + reservationNumber);
    }
}
}