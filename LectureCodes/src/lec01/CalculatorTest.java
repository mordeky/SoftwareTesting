package lec01;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    AClass a;

    @BeforeEach
    public void start() {
        calculator = new Calculator();
        a = new AClass();
        assertNotNull(calculator);
    }

    @Test
    public void evaluatesExpression() {
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
        //assertEquals(7, sum);
    }

    @Test
    public void M1Test() {
        int m1 = a.M1();
        int expectedValue = 1;
        assertEquals(expectedValue, m1);
    }

    @Test
    public void testM2() {
        assertTrue(a.M2());
        boolean result = a.M2();
        assertTrue(result);
    }

    @Test
    public void testM3() {
        assertFalse(a.M3());
    }

    @AfterEach
    public void endme() {
        a = null;
        calculator = null;

        assertNull(a);
        assertNull(calculator);
    }
}