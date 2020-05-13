package Lab02.task03.answer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import Lab02.task03.RomanNumeral;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * RomanNumeral Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @Ref1: https://www.baeldung.com/parameterized-tests-junit-5
 * @Ref2: https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-parameterized-tests/
 * @since <pre>ÈýÔÂ 10, 2020</pre>
 */


public class RomanNumeralParamTest {
    static RomanNumeral roman;

    @BeforeAll
    public static void start() {
        roman = new RomanNumeral();
    }

    /**
     * Method: romanToInt(String s)
     */
    @Test
    public void testRomanToInt() throws Exception {
        int result = roman.romanToInt("II");
        assertEquals(2, result);
    }

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(5, "V"),
                Arguments.of(10, "X"));
    }

    @ParameterizedTest
    @MethodSource({"data"})
    void singleDigit(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"1,I", "5,V", "10,X", "50, L", "100, C", "500, D", "1000, M"})
    void singleDigit(String input, String expected) {
        assertEquals(Integer.valueOf(input), roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"1,I", "5,V", "10,X", "50, L", "100, C", "500, D", "1000, M"})
    void singleDigit2(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"2,II", "20,XX"})
    void repetition(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"6,VI", "15,XV"})
    void manyLettersInOrder(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"4,IV", "9,IX"})
    void subtractiveNotation(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"14,XIV", "159,CLIX"})
    void withAndWithoutSubtractiveNotation(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @ParameterizedTest
    @CsvSource({"1,I", "3999,MMMCMXCIX"})
    void minAndMax(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }

    @Test
    void invalidLetter() {
        Exception e = assertThrows(RuntimeException.class, () -> roman.romanToInt("Y"));

        assertEquals("Invalid number", e.getMessage());
    }

} 
