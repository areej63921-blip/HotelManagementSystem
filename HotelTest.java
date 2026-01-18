import static org.junit.Assert.*;
import org.junit.Test;

public class HotelTest {

    @Test
    public void testHotelOperations() {
        // 1. Arrange
        Name hName = new Name("Areej", "Islamabad");
        Hotel hotel = new Hotel(hName);
        
        // available() ke liye RoomType object chahiye kyunki Hotel RoomType se linked hai
        RoomType type = new RoomType(RoomKind.SUITE, new Money(5000));

        // 2. Act
        hotel.createReservation(); // UML Operation
        
        // Error Fix: 'type' parameter pass karein kyunki availability RoomType par depend karti hai
        boolean isAvailable = hotel.available(type); 

        // 3. Assert
        assertNotNull("Hotel object should exist", hotel);
        assertEquals(hName, hotel.getName());
        assertTrue("Should be available", isAvailable);
    }
}