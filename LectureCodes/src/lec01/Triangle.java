package lec01;

/**
 * @author Xiao-Xin Li
 * @version 1.0.0
 * @create 2020/3/4 10:48
 * @blog
 */

public class Triangle {
    private int p; // Longest edge
    private int q;
    private int r;

    public Triangle(int s1, int s2, int s3) {
        if (s1 > s2) {
            p = s1;
            q = s2;
        } else {
            p = s2;
            q = s1;
        }
        if (s3 > p) {
            r = p;
            p = s3;
        } else
            r = s3;
    }

    public boolean isScalene() {
        return ((r > 0) && (q > 0) && (p > 0) &&
                (p < (q + r)) && ((q > r) || (r > q)));
    }

    public boolean isEquilateral() {
        return p == q && q == r;
    }
}
