package Lab04;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameEnds {

	/**
	 * The main problem of the implementation of the sameEnds
	 *  is that it is very inefficient. Even if only one or two
	 *  characters at the two ends of a very long string are equal,
	 *  the program has to loop half times.
	 *  Here, half means half of the length of the given string.
	 */
	public String sameEnds(String string) {
		int length = string.length();
		int half = length / 2;

		String left = "";
		String right = "";

		int size = 0;
		int counter = 0;
		for(int i = 0; i < half; i++) {
			counter++;
			left += string.charAt(i);
			right = string.charAt(length - 1 - i) + right;

			if (left.equals(right))
				size = left.length();
		}
		System.out.println("sameEnds: loop num = " + counter);
		return string.substring(0, size);
	}

	// TODO: Your answer goes here!!!
	public String sameEndsRevised(String string) {
		return "";
	}

	// TODO: Your answer goes here!!!
	void test(String str){
		assertEquals(sameEnds(str), sameEndsRevised(str));
	}
}
