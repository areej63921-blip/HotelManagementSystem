import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============== Hotel Management System ==============\n");

        // 1. Setup HotelChain (Controller)
        HotelChain chain = new HotelChain();

        // 2. Setup RoomType & Rooms (Structural Association)
        RoomType suiteType = new RoomType("SUITE", 500.0);

        // 3. Setup Hotel & Add Room
        Hotel oceanView = new Hotel("Ocean View Palace");
        Room room101 = new Room(101, suiteType);
        oceanView.addRoom(room101);
        chain.addHotel(oceanView);

        // 4. Setup ReserverPayer (The person paying for the room)
        ReserverPayer customer = new ReserverPayer("CUST-001", "Areej", "4242-3322-1234");

        oceanView.createReservation();
        System.out.println("Customer Registered: " + customer.getName());
        System.out.println("Payment Details: " + customer.getPaymentInfo());

        // 5. Check Availability and conflicts(UML Operation)
        System.out.println("\nChecking availability for room 101 in " + oceanView.getName() + "...");
        System.out.println(" [Test 1] Room 101 Status: " + room101.getStatus()); // Should be FREE
        if (oceanView.available(suiteType)) {
            System.out.println("Status: Room 101 is available for booking and booked Room for \" + customer.getName()");
        }

        // 6. Create Reservation (Linking ReserverPayer, Room, and Dates)
        Reservation myRes = new Reservation(5001, new Date(), new Date(), room101, customer);
        myRes.printReservationLog();

        // 7. Check-in Process (Guest creation on the Room)
        System.out.println("\n--- Guest Check-In Process at Reception---");
        room101.createGuest("Areej", "123 Main St, Karachi");
        
        // 8. HowMany (Association Class Logic)
        HowMany roomsCount = new HowMany(1); // Representing 1 room for this reservation
        System.out.println("Rooms requested for this stay: " + roomsCount.getNumber());

        // Final Status Verification
        System.out.println("\n[Test 2] Verification for another customer...");
        boolean isStillAvailable = oceanView.available(suiteType);
        System.out.println("Is Room 101 still available for others? " + (isStillAvailable ? "YES" : "NO"));
        System.out.println("Current Status of Room 101: " + room101.getStatus()); // Should be OCCUPIED
        
        // 9. System Maintenance (Internal check for mappings)
        System.out.println("\n--- Running System Maintenance Check ---");
        chain.performMaintenance();

        System.out.println("\n--- Workflow Execution Completed Successfully ---");
    }
}