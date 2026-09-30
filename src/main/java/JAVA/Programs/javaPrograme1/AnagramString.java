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
		 * First remove spaces and convert both strings to lowercase.
		 *
		 * Example:
		 *
		 * "I love you"  -> "iloveyou"
		 * "you love i"  -> "youlovei"
		 */

		String s1 = str1.replaceAll("\\s+", "").toLowerCase();
		String s2 = str2.replaceAll("\\s+", "").toLowerCase();


		if (s1.length() != s2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
			return;
		}

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s1.toCharArray()) {

			/*
			 * getOrDefault(ch, 0)
			 *
			 * This checks whether the character already exists
			 * in the Map.
			 *
			 * If character exists:
			 *
			 *     return its current count
			 *
			 * If character does not exist:
			 *
			 *     return 0
			 *
			 * Example:
			 *
			 * First time we see 'p':
			 *
			 * map.getOrDefault('p', 0)
			 *
			 * 'p' does not exist, so it returns 0.
			 *
			 * Then:
			 *
			 * 0 + 1 = 1
			 *
			 * map.put('p', 1);
			 *
			 *
			 * Second time we see 'p':
			 *
			 * map.getOrDefault('p', 0)
			 *
			 * 'p' already exists with value 1.
			 *
			 * So it returns 1.
			 *
			 * Then:
			 *
			 * 1 + 1 = 2
			 *
			 * map.put('p', 2);
			 *
			 * Therefore:
			 *
			 * map.put(ch, map.getOrDefault(ch, 0) + 1);
			 *
			 * means:
			 *
			 * "Get the current count of the character.
			 *  If it does not exist, use 0.
			 *  Increase the count by 1.
			 *  Store the updated count back in the Map."
			 */

			map.put(ch, map.get(ch) + 1);
		}


		/*
		 * --------------------------------------------------------
		 * PROCESS SECOND STRING
		 * --------------------------------------------------------
		 *
		 * Now we process the second string.
		 *
		 * Instead of increasing the count, we DECREASE the count.
		 *
		 * Why?
		 *
		 * The first string tells us how many times each character
		 * should occur.
		 *
		 * The second string uses those characters one by one.
		 *
		 * If all counts become zero, both strings contain exactly
		 * the same characters with exactly the same frequency.
		 */

		for (char ch : s2.toCharArray()) {
			/*
			 * Check whether this character exists in the Map.
			 *
			 * If it doesn't exist, the second string contains a
			 * character that was not present in the first string.
			 *
			 * Therefore, they are not anagrams.
			 */

			if (!map.containsKey(ch)) {
				System.out.println(str1 + " and " + str2 + " are not anagrams");
				return;
			}


			/*
			 * Decrease the frequency by 1.
			 *
			 * Example:
			 *
			 * Before:
			 *
			 * p -> 2
			 *
			 * After:
			 *
			 * p -> 1
			 */

			map.put(ch, map.get(ch) - 1);


			/*
			 * If the frequency becomes zero, remove the character
			 * from the Map.
			 *
			 * Example:
			 *
			 * p -> 1
			 *
			 * After processing another 'p':
			 *
			 * p -> 0
			 *
			 * There is no need to keep p in the Map.
			 *
			 * Therefore:
			 *
			 * map.remove('p');
			 */

			if (map.get(ch) == 0) {
				map.remove(ch);
			}
		}


		/*
		 * --------------------------------------------------------
		 * FINAL CHECK
		 * --------------------------------------------------------
		 *
		 * If the Map is empty, it means all character frequencies
		 * became zero.
		 *
		 * Therefore, both strings contain exactly the same
		 * characters with the same frequency.
		 *
		 * Hence, they are anagrams.
		 */

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