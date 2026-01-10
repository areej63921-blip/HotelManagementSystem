import static org.junit.Assert.*;

import org.junit.Test;

public class HowManyTest {
    @Test
    public void testCount() {
        HowMany hm = new HowMany(3);
        assertEquals(3, hm.getNumber());
    }
}