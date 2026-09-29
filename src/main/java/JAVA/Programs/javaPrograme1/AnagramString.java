package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class AnagramString {

	static void isAnagram(String str1, String str2) {
		// str1 = "I love you"
		// str2 = "you love i"

		// Remove all spaces
		String s1 = str1.replaceAll("\\s+", "");
		String s2 = str2.replaceAll("\\s+", "");

		System.out.println("After removing spaces: " + s1);
		System.out.println("After removing spaces: " + s2);

		// Convert to lowercase
		char[] s11 = s1.toLowerCase().toCharArray();
		char[] s22 = s2.toLowerCase().toCharArray();

		// If lengths are different, they cannot be anagrams
		if (s11.length != s22.length) {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
			return;
		}

		// Sort characters
		Arrays.sort(s11);
		Arrays.sort(s22);

		// Compare sorted arrays
		if (Arrays.equals(s11, s22)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {

		isAnagram("I love you", "you love i");
	}
}