package Lab02.task03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    private static Stream<Arguments> data() {
        return Stream.of(null);
    }

    @ParameterizedTest
    void singleDigit(int input, String expected) {
        assertEquals(input, roman.romanToInt(expected));
    }
} 
