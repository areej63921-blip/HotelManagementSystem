import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTest {
    @Test
    public void testAvailability() {
        // Arrange
        Hotel hotel = new Hotel("PC");
        RoomType rt = new RoomType("SUITE", 500.0);
        hotel.addRoom(new Room(501, rt));

        // Act & Assert
        assertTrue(hotel.available(rt));
        assertEquals("PC", hotel.getName());
    }
}