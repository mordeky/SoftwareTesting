package task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppleTest {
    @Test
    public void testAppleColor() throws Exception {
        assertEquals("red", new Apple("red").getColor());
    }

}
