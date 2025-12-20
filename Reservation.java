import java.util.Date;

public class Reservation {
    private int number;
    private Date startDate;
    private Date endDate;

    public Reservation(int number, Date start, Date end) {
        // Defensive: Check if end date is after start date
        if (start == null || end == null || end.before(start)) {
            throw new IllegalArgumentException("Invalid reservation dates.");
        }
        this.number = number;
        this.startDate = start;
        this.endDate = end;
    }
}