import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
    @Test
    public void testRoomCheckIn() {
        // Arrange
        RoomType type = new RoomType("SINGLE", 100.0);
        Room room = new Room(101, type);

        // Act
        room.createGuest("Areej", "Karachi");

        // Assert
        assertEquals(Room.RoomStatus.OCCUPIED, room.getStatus());
        assertEquals(101, room.getNumber());
    }
}