package Lab02.asserts;

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
    public void testAddWithAssert() throws Exception {
        int sum = cal.add(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void testAddWithoutAssert() throws Exception {
        int sum = cal.add(1, 2);
        //TODO: how can you perform test without any assert function?
    }
}