import static org.junit.Assert.*;
import org.junit.Test;

public class GuestTest {
    @Test
    public void testGuestDetails() {
        // 1. Pehle UML ki types (Name aur Address) ke objects banayein
        Name guestName = new Name("Sara", "Khan"); 
        Address guestAddress = new Address("Lahore, Pakistan");

        // 2. Guest ka object banayein (UML: create())
        Guest g = new Guest(guestName, guestAddress);

        // 3. assertEquals se check karein
        // Ab hum check karenge ke kya object sahi return ho raha hai
        assertEquals(guestName, g.getName());
        assertEquals(guestAddress, g.getAddressDetails());
    }
}