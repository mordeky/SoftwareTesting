package Lab02.Apple;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {
    @Test
    public void testAppleColor() throws Exception {
        assertEquals("red", new Apple("red").getColor());
    }

}
