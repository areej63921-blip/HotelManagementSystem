import java.util.Date;

public class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number; 
    private Room room;          
    private ReserverPayer payer; 

    public Reservation(int number, Date start, Date end, Room room, ReserverPayer payer) {
        this.number = number;
        this.startDate = start;
        this.endDate = end;
        this.room = room;
        this.payer = payer;
        this.reservationDate = new Date();
    }

    public void printReservationLog() {
        
        System.out.println("Res #" + number + " created on " + reservationDate);
        System.out.println("From: " + startDate + " To: " + endDate);
        System.out.println("Payer: " + payer.getName());
    }
}