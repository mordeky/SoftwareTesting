package Lab02.task02.answer;

import org.junit.jupiter.api.Test;
import Lab02.task02.Calculator;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/**
 * Calculator Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>03/12, 2020</pre>
 */
public class CalculatorTest {

    /**
     * Method: squareRoot(int n)
     */
    @Test
    public void testSquareRoot() {
        /**
         * Ref: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
         * assertTimeoutPreemptively表示抢占超时，即如果超时了，方法还没有返回，则立即中断执行。
         */
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            new Calculator().squareRoot(3);
        });
        // assertTimeout(ofMillis(10), () -> {
        //     // Simulate task that takes more than 10 ms.
        //     Thread.sleep(100);
        // });
    }

    /**
     * Method: divide(int i, int j)
     */
    @Test
    public void testDivide() throws Exception {
        Exception e = assertThrows(ArithmeticException.class,
                () -> new Calculator().divide(3, 0));
        System.out.println(e.getMessage());
    }

} 
