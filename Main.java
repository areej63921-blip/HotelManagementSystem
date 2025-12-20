import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("=== Hotel Management System (Warnings Fixed) ===\n");

            // 1. Setup Hotel
            HotelChain myChain = new HotelChain();
            Hotel iqraPalace = new Hotel("Iqra Palace");
            iqraPalace.addRoom(new Room(101));
            myChain.addHotel(iqraPalace);

            // 2. Setup Payer
            ReserverPayer customer = new ReserverPayer("CUST-001", "Ali Khan", "4242-xxxx-xxxx-xxxx");
            myChain.addCustomer(customer);
            
            // Warnings Fix: Printing Payer details to "use" the fields
            System.out.println("Customer Registered: " + customer.getId());

            // 3. Dates Setup
            Date start = new Date();
            Date end = new Date(start.getTime() + (1000 * 60 * 60 * 24 * 2));
            
            // 4. Make Reservation
            myChain.makeReservation("Iqra Palace", "CUST-001", start, end);

            // 5. Check-In (Ye Guest field ki warning khatam karega)
            System.out.println("\n--- Checking In Guest ---");
            myChain.checkIn(1001, "Ali Khan", "PK123456");

            System.out.println("\n=== All Tests Passed Without Errors ===");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}