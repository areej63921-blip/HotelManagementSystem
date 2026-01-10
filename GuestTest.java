import static org.junit.Assert.*;

import org.junit.Test;

public class GuestTest {
    @Test
    public void testGuestDetails() {
        Guest g = new Guest("Sara", "Lahore");
        assertEquals("Sara", g.getName());
        assertEquals("Lahore", g.getAddress());
    }
}