package Programs.javaPrograme1;

import java.util.HashMap;
import java.util.Set;

public class CharOccurence {

	public static void Char(String InputString) {

		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();

		char[] str = InputString.toCharArray();

		for (char c : str) {
			if (counter.containsKey(c)) {
				counter.put(c, counter.get(c) + 1);
			} else
				counter.put(c, 1);
		}

		System.out.println(counter);

		Set<Character> SetString = counter.keySet();
		System.out.println("Original string: " + InputString);
		System.out.println("Dup char: " + " " + SetString);

		for (Character s : SetString) {
			if (counter.get(s) > 1) {
				System.out.println(s + " : " + counter.get(s));

			}
		}
	}

	public static void main(String[] args) {

		Char("abcd");

	}

}
