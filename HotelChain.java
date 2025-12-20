import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();
    private Map<String, ReserverPayer> customers = new HashMap<>();
    private List<Reservation> allReservations = new ArrayList<>();
    private int reservationCounter = 1001;

    public void addHotel(Hotel hotel) { 
        hotels.put(hotel.getName(), hotel); 
    }

    public void addCustomer(ReserverPayer c) { 
        customers.put(c.getId(), c); 
    }

    public void makeReservation(String hotelName, String customerId, Date start, Date end) {
        Hotel hotel = hotels.get(hotelName);
        ReserverPayer payer = customers.get(customerId);

        if (hotel == null || payer == null) {
            throw new NoSuchElementException("Hotel or Customer record not found!");
        }

        Room freeRoom = hotel.findFreeRoom();

        if (freeRoom != null) {
            Reservation newRes = new Reservation(reservationCounter++, start, end, freeRoom, payer);
            allReservations.add(newRes);
            // Warning fix: Calling print method to use all fields
            newRes.printReservationDetails(); 
        } else {
            System.out.println("Sorry: No rooms available in " + hotelName);
        }
    }

    public void checkIn(int reservationNumber, String guestName, String passport) {
        Reservation foundRes = null;

        // Error Fix: 'foundRes' ko yahan dhoondna zaroori hai
        for (Reservation res : allReservations) {
            if (res.getNumber() == reservationNumber) {
                foundRes = res;
                break;
            }
        }

        if (foundRes != null) {
            Guest guest = new Guest(guestName, passport);
            // Warning Fix: Using guest summary to remove 'guest is not used' warning
            System.out.println("System Log: " + guest.getGuestSummary() + " is checking in.");
            
            Room room = foundRes.getRoom();
            room.checkIn();
        } else {
            System.out.println("Error: No reservation found for #" + reservationNumber);
        }
    }
}