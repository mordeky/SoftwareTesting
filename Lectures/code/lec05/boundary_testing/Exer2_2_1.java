package lec05.boundary_testing;
public class Exer2_2_1 {

    public String sameEnds(String string) {
        int length = string.length();
        int half = length / 2;

        String left = "";
        String right = "";

        int size = 0;
        for(int i = 0; i < half; i++) {
            left += string.charAt(i);
            right = string.charAt(length - 1 - i) + right;

            if (left.equals(right))
                size = left.length();
        }

        return string.substring(0, size);
    }
}
