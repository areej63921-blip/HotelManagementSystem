import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============== Hotel Management System ==============\n");

        try {
            // --- PART A: NORMAL SUCCESSFUL WORKFLOW ---
            HotelChain chain = new HotelChain();
            RoomType suiteType = new RoomType("SUITE", 500.0);
            Hotel oceanView = new Hotel("Ocean View Palace");
            Room room101 = new Room(101, suiteType);
            
            oceanView.addRoom(room101);
            chain.addHotel(oceanView);

            ReserverPayer customer = new ReserverPayer("CUST-001", "Areej", "4242-3322-1234");
            oceanView.createReservation();
            
            System.out.println("Customer Registered: " + customer.getName());

            if (oceanView.available(suiteType)) {
                System.out.println("Status: Room 101 is available. Proceeding with booking...");
                Reservation myRes = new Reservation(5001, new Date(), new Date(), room101, customer);
                myRes.printReservationLog();
            }

            System.out.println("\n--- Guest Check-In Process ---");
            room101.createGuest("Areej", "123 Main St, Karachi");
            
            HowMany roomsCount = new HowMany(1);
            System.out.println("Rooms requested: " + roomsCount.getNumber());
            System.out.println("Current Room Status: " + room101.getStatus());

            // --- PART B: DEFENSIVE TESTING (Handling Exceptions) ---
            System.out.println("\n--- Running Defensive Logic Tests (Expect Errors to be Handled) ---");

            // Test 1: Null Hotel in Chain
            try {
                System.out.print("Testing Null Hotel: ");
                chain.addHotel(null); 
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Expected Error -> " + e.getMessage());
            }

            // Test 2: Invalid Guest Data
            try {
                System.out.print("Testing Empty Guest Name: ");
                room101.createGuest("", "No Name Street");
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Expected Error -> " + e.getMessage());
            }

            // Test 3: Logical Date Error (End before Start)
            try {
                System.out.print("Testing Invalid Dates (End before Start): ");
                Calendar cal = Calendar.getInstance();
                Date today = cal.getTime();
                cal.add(Calendar.DATE, -5); // 5 days ago
                Date pastDate = cal.getTime();
                
                new Reservation(999, today, pastDate, room101, customer);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Expected Error -> " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("CRITICAL SYSTEM ERROR: " + e.getMessage());
        }

        System.out.println("\n=============== Workflow & Defensive Tests Completed ==============");
    }
}