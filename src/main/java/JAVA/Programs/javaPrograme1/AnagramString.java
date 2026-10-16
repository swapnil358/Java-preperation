package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramString {

	/*
	 * ============================================================
	 * ANAGRAM STRING
	 * ============================================================
	 *
	 * Two strings are called anagrams if they contain the same
	 * characters with the same frequency, but the order can be
	 * different.
	 *
	 * Example:
	 *
	 * str1 = "I love you"
	 * str2 = "you love i"
	 *
	 * After removing spaces and converting to lowercase:
	 *
	 * str1 = "iloveyou"
	 * str2 = "youlovei"
	 *
	 * Both strings contain the same characters with the same
	 * frequency, so they are anagrams.
	 *
	 *
	 * We are using two approaches:
	 *
	 * 1. Using Arrays.sort()
	 * 2. Using HashMap
	 *
	 * ============================================================
	 */


	// ============================================================
	// APPROACH 1: USING ARRAYS.SORT()
	// ============================================================

	static void isAnagramUsingSort(String str1, String str2) {

		/*

		String str1 = "I love you";
		String str2 = "you love i";

		* */

		// Remove all spaces from both strings
		String s1 = str1.replaceAll("\\s+", "");
		String s2 = str2.replaceAll("\\s+", "");

		System.out.println("After removing spaces: " + s1);
		System.out.println("After removing spaces: " + s2);

		// Convert both strings to lowercase and then to character arrays
		char[] s11 = s1.toLowerCase().toCharArray();
		char[] s22 = s2.toLowerCase().toCharArray();

		// If lengths are different, strings cannot be anagrams
		if (s11.length != s22.length) {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
			return;
		}

		// Sort both character arrays
		Arrays.sort(s11);
		Arrays.sort(s22);

		// Compare both sorted arrays
		if (Arrays.equals(s11, s22)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}


	// ============================================================
	// APPROACH 2: USING HASHMAP
	// ============================================================



	static void isAnagramUsingMap(String str1, String str2) {

		/*
		 * Remove spaces and convert both strings to lowercase.
		 *
		 * "I love you" -> "iloveyou"
		 * "you love i" -> "youlovei"
		 */

		String s1 = str1.replaceAll("\\s+", "").toLowerCase();
		String s2 = str2.replaceAll("\\s+", "").toLowerCase();

		// If lengths are different, they cannot be anagrams
		if (s1.length() != s2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
			return;
		}

		Map<Character, Integer> map = new HashMap<>();

		// Count characters from first string
		for (char ch : s1.toCharArray()) {
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+ 1);
			}else{
				map.put(ch, 1);
			}
		}

		System.out.println(map);

		// Remove character counts using second string
		for (char ch : s2.toCharArray()) {

			if (!map.containsKey(ch)) {
				System.out.println(str1 + " and " + str2 + " are not anagrams");
				return;
			}
			map.put(ch, map.get(ch) - 1);

			if (map.get(ch) == 0) {
				map.remove(ch);
			}
		}

		if (map.isEmpty()) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}


	// ============================================================
	// MAIN METHOD
	// ============================================================

	public static void main(String[] args) {

		String str1 = "I love you";
		String str2 = "you love i";


		// Approach 1: Using Arrays.sort()
		System.out.println("========== APPROACH 1: SORTING ==========");

		isAnagramUsingSort(str1, str2);


		System.out.println();


		// Approach 2: Using HashMap
		System.out.println("========== APPROACH 2: HASHMAP ==========");

		isAnagramUsingMap(str1, str2);
	}
}