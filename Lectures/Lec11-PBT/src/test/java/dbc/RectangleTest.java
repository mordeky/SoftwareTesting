package dbc;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    public static void resize(Rectangle r) {
        while (r.getLength() <= r.getWidth()) {
            r.setLength(r.getLength() + 1);
        }
        System.out.println("It¡¯s OK.");
    }

    @Test
    public void test1(){
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(15);
        resize(r1);
    }

    @Test
    public void test2(){
        Rectangle r1 = new Square();
        r1.setLength(5);
        r1.setWidth(15);
        resize(r1);
    }

}


