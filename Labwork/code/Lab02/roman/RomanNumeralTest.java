package Lab02.roman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralTest {

    /**
     * Method: romanToInt(String s)
     */
    @Test
    public void testRomanToInt() throws Exception {
        int result = new RomanNumeral().romanToInt("II");
        assertEquals(2, result);
    }

    @Test
    void singleDigit() {
        assertEquals(1, new RomanNumeral().romanToInt("I"));
        assertEquals(5, new RomanNumeral().romanToInt("V"));
        assertEquals(10, new RomanNumeral().romanToInt("X"));
        assertEquals(50, new RomanNumeral().romanToInt("L"));
        assertEquals(100, new RomanNumeral().romanToInt("C"));
        assertEquals(500, new RomanNumeral().romanToInt("D"));
        assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    //TODO: Your answer goes here!!!
    @ParameterizedTest
    void singleDigitParameterizedTest() {
    }
} 
