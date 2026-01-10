import static org.junit.Assert.*;

import org.junit.Test;

public class ReserverPayerTest {
    @Test
    public void testPayerInfo() {
        ReserverPayer rp = new ReserverPayer("ID1", "Ali", "1234");
        assertEquals("Ali", rp.getName());
        assertTrue(rp.getPaymentInfo().contains("1234"));
    }
}