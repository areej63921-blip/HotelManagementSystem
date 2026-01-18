import java.util.Date;

public class Reservation {
    // UML Attributes
    private Date reservationDate; 
    private Date startDate;       
    private Date endDate;         
    private Integer number;       

    public Reservation(Date reservationDate, Date startDate, Date endDate, Integer number) {
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}