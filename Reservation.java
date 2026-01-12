import java.util.Date;

public class Reservation {
    private final Date reservationDate;
    private final Date startDate;
    private final Date endDate;
    private final int number;
    private final Room room;
    private final ReserverPayer payer;

    public Reservation(int number, Date start, Date end, Room room, ReserverPayer payer) {
        // Defensive: Check for nulls and logical dates
        if (start == null || end == null) throw new NullPointerException("Reservation dates cannot be null.");
        if (end.before(start)) throw new IllegalArgumentException("End date cannot be before start date.");
        if (room == null || payer == null) throw new IllegalArgumentException("Room and Payer must be provided.");

        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.room = room;
        this.payer = payer;
        this.reservationDate = new Date();
    }

    public void printReservationLog() {
        System.out.println("Res #" + number + " for Room: " + room.getNumber());
        System.out.println("Status: Confirmed for " + payer.getName());
    }
}