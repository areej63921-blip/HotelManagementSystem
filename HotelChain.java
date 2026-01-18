import java.util.*;

public class HotelChain {
    // UML Relationships (Lines in Diagram)
    private List<Hotel> hotels = new ArrayList<>(); // Association with Hotel
    private List<ReserverPayer> payers = new ArrayList<>(); // Association with ReserverPayer

    // --- UML Public Operations (+) ---
    
    public void makeReservation() {
        if (canMakeReservation()) {
            System.out.println("Reservation process started.");
        }
    }

    public void cancelReservation() {
        if (canCancelReservation()) {
            System.out.println("Reservation cancelled.");
        }
    }

    public void checkInGuest() {
        if (canCheckInGuest()) {
            System.out.println("Guest checked in.");
        }
    }

    public void checkOutGuest() {
        if (canCheckOutGuest()) {
            System.out.println("Guest checked out.");
        }
    }

    public void createReserverPayer() {
        // UML mein iska naam 'createReserverPayer' hai
        System.out.println("New ReserverPayer created.");
    }

    // --- UML Private Operations (-) ---
    
    private boolean canMakeReservation() { 
        return true; 
    }

    private boolean canCancelReservation() { 
        return true; 
    }

    private boolean canCheckInGuest() { 
        return true; 
    }

    private boolean canCheckOutGuest() { 
        return true; 
    }
}