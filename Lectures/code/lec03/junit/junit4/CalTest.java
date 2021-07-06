package lec03.junit.junit4;

import lec03.junit.Cal;
import org.junit.Assert;
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
    public void testAdd() throws Exception {
        int sum = cal.add(1, 2);
        assertEquals(3, sum);
        if(sum != 3)
            throw new Exception("Cal.add() has error result for input 1 and 2");

        Assert.assertEquals(4, cal.add(2, 2));
    }

    //This test can't run more than 1 second, else failed
    @Test(timeout = 1000)
    public void testTimeout() {
        cal.squareRoot(3);
    }

    @Test
    public void testDivide() {
        // assertEquals(1.0, cal.divide(2, 2))
        Assert.assertEquals(1.0, cal.divide(2, 2), 1e-8);
    }

    @Test(expected = ArithmeticException.class)
    public void testException() {
        cal.divide(3, 0);
    }
}