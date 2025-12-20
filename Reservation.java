import java.util.Date;

public class Reservation {
    private int number;
    private Date startDate;
    private Date endDate;
    private Room room;
    private ReserverPayer payer;

    public Reservation(int number, Date start, Date end, Room room, ReserverPayer payer) {
        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.room = room;
        this.payer = payer;
        this.room.reserve();
    }

    public int getNumber() { return number; }
    public Room getRoom() { return room; }

    // Is method ko call karne se saare fields "used" ho jayenge
    public void printReservationDetails() {
        System.out.println("Reservation #" + number + " from " + startDate + " to " + endDate);
        System.out.println("Booked by: " + payer.getPayerSummary());
    }
}