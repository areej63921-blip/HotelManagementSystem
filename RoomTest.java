import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTest {

    @Test
    public void testSuccessfulGuestCreation() {
        // 1. Arrange:
        RoomKind kind = RoomKind.SUITE;
        Money cost = new Money(500.0);
        RoomType type = new RoomType(kind, cost);
        
        Room room = new Room(101, type);

        Name guestName = new Name("Areej", "Imran");
        Address guestAddress = new Address("Karachi");

        // 2. Act:
        room.createGuest(guestName, guestAddress);

        // 3. Assert:
        assertNotNull("Occupant should not be null after createGuest", room.getOccupant());
        assertEquals(Integer.valueOf(101), room.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRoomTypeThrowsException() {
        // Defensive test: UML associations usually shouldn't be null
        new Room(202, null);
    }
}