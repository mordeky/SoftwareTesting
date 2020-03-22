package lec01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * RomanNumeral Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÈıÔÂ 10, 2020</pre>
 */
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

    @Test
    void repetition() {
        assertEquals(2, new RomanNumeral().romanToInt("II"));
        assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    @Test
    void manyLettersInOrder() {
        assertEquals(6, new RomanNumeral().romanToInt("VI"));
        assertEquals(15, new RomanNumeral().romanToInt("XV"));
    }

    @Test
    void subtractiveNotation() {
        assertEquals(4, new RomanNumeral().romanToInt("IV"));
        assertEquals(9, new RomanNumeral().romanToInt("IX"));
    }

    @Test
    void withAndWithoutSubtractiveNotation() {
        assertEquals(14, new RomanNumeral().romanToInt("XIV"));
        assertEquals(159, new RomanNumeral().romanToInt("CLIX"));
    }

    @Test
    void minAndMax() {
        assertEquals(1, new RomanNumeral().romanToInt("I"));
        assertEquals(3999, new RomanNumeral().romanToInt("MMMCMXCIX"));
    }

    @Test
    void invalidLetter() {
        Exception e = assertThrows(RuntimeException.class, () -> new RomanNumeral().romanToInt("Y"));

        assertEquals("Invalid number", e.getMessage());
    }

} 
