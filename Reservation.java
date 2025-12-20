import java.util.Date;

public class Reservation {
    private int number;
    private Date startDate;
    private Date endDate;
    private Room room; // Link to Room
    private ReserverPayer payer; // Link to Payer

    public Reservation(int number, Date start, Date end, Room room, ReserverPayer payer) {
        if (room == null || payer == null) {
            throw new IllegalArgumentException("Room and Payer must be linked to a reservation.");
        }
        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.room = room;
        this.payer = payer;
        
        // Fig 17: Update room state during reservation
        this.room.reserve(); 
    }

    public int getNumber() { return number; }
    public Room getRoom() {
    return this.room;
}
}