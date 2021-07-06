package lec03.junit.junit5;

import lec03.junit.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Triangle Tester.
 *
 * @author Xiao-Xin Li
 * @version 1.0
 * @since <pre>���� 4, 2020</pre>
 */
public class TriangleTest {
    private Triangle t;

    @BeforeEach
    public void before() throws Exception {
        t = new Triangle(5, 4, 3);
    }

    @AfterEach
    public void after() throws Exception {
    }

    /**
     * Method: isScalene()
     */
    @Test
    public void testIsScalene() throws Exception {
        assertTrue(t.isScalene());
    }

    /**
     * Method: isEquilateral()
     */
    @Test
    public void testIsEquilateral() throws Exception {
        assertFalse(t.isEquilateral());
    }

} 
