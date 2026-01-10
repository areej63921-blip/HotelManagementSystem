import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Test;

public class ReservationTest {
    @Test
    public void testReservationCreation() {
        // Arrange
        Room r = new Room(1, new RoomType("K", 10));
        ReserverPayer p = new ReserverPayer("ID", "Name", "CC");
        
        // Act
        Reservation res = new Reservation(777, new Date(), new Date(), r, p);

        // Assert
        assertNotNull(res);
    }
}