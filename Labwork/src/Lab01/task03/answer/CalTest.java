package Lab01.task03.answer;

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

    @Test
    public void testSub() {
        int result = cal.sub(1, 2);
        assertEquals(-1, result);

        assertEquals(0, cal.sub(2, 2));
    }
}