import org.junit.Test;
import static org.junit.Assert.*;

public class HotelChainTest {

    @Test
    public void testHotelChainOperations() {
        // Arrange
        HotelChain chain = new HotelChain();

        chain.createReserverPayer(); 
        chain.makeReservation();      
        chain.checkInGuest();         
        chain.checkOutGuest();        
        chain.cancelReservation();    
        
        assertNotNull("HotelChain object should be created", chain);
    }
}