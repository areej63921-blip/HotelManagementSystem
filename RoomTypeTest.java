import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoomTypeTest {
    @Test
    public void testPrice() {
        // Arrange
        RoomType rt = new RoomType("DELUXE", 1000.0);
        
        // Act & Assert
        assertEquals(1000.0, rt.getPrice(), 0.001);
    }
}