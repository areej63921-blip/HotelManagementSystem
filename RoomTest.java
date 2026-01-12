import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNullRoomTypeThrowsException() {
        // Defensive test: Should throw error if type is null
        new Room(101, null);
    }

    @Test
    public void testSuccessfulCheckIn() {
        Room room = new Room(101, new RoomType("Suite", 500));
        room.createGuest("Areej", "Karachi");
        assertEquals(Room.RoomStatus.OCCUPIED, room.getStatus());
    }
}