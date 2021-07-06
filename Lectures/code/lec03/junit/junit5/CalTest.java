package lec03.junit.junit5;

import lec03.junit.Cal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Ref: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
 */
public class CalTest {
    @Test
    public void timeoutTesting() {
        assertTimeoutPreemptively(ofMillis(1000),
                () -> new Cal().squareRoot(3));
    }

    @Test
    public void exceptionTesting() {
        Exception e = assertThrows(ArithmeticException.class,
                () -> new Cal().divide(3, 0));
        assertEquals("/ by zero", e.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"0,0,0", "1,1,2", "2, 3, 4", "3, 5, 8"})
    void parameterizedTest(int in1, int in2, int expected) {
        assertEquals(expected, new Cal().add(in1, in2));
    }
} 
