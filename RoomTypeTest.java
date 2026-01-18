import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoomTypeTest {
    @Test
    public void testRoomTypeDetails() {
        // 1. Arrange
        RoomKind kind = RoomKind.DELUXE;
        Money cost = new Money(1000.0);

        // 2. Act: 
        RoomType rt = new RoomType(kind, cost);

        // 3. Assert:
        assertEquals(RoomKind.DELUXE, rt.getKind());
        assertEquals(1000.0, rt.getCost().getAmount(), 0.001);
    }
}