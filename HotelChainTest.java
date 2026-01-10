import org.junit.Test;

public class HotelChainTest {
    @Test
    public void testChainMaintenance() {
        // Arrange
        HotelChain chain = new HotelChain();
        Hotel hotel = new Hotel("Marriott");
        chain.addHotel(hotel);
        
        // Act
        chain.performMaintenance();
    }
}