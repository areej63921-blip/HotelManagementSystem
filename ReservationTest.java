import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

public class ReservationTest {

    @Test
    public void testReservationCreation() {
        // 1. Arrange: 
        Date today = new Date();
        Date start = new Date();
        Date end = new Date();
        Integer resNo = 777; 

        // 2. Act: 
        Reservation res = new Reservation(today, start, end, resNo);

        // 3. Assert: 
        assertNotNull("Reservation object null nahi hona chahiye", res);
        assertEquals(resNo, res.getNumber());
    }
}