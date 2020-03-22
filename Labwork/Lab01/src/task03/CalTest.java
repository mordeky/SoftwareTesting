package task03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalTest {
    Cal cal;

    @Before
    public void start() {
        cal = new Cal();
        assertNotNull(cal);
    }

    @Test
    public void testAdd() {
        int add = cal.add(1, 2);
        assertEquals(3, add);

        assertEquals(4, cal.add(2, 2));
    }
}