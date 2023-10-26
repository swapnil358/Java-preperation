package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class StringAnagram {

	
	/*
	 * 1) Take two strings as input. 
	 * 2) convert first string to character array . 
	 * 3) Take each character from first string and get the index of that character in
	 * second string.If the index is present delete that character from second
	 * string. 
	 * 4) Repeat the same step for all characters in First string . 
	 * 5) Finally check the length of second string if the length is zero then both
	 * strings are anagrams else both are not anagrams.
	 */
	
	
	
	
	public static void main(String[] args) {


		String str1 = "Selenium";
		String str2 = "inuemSel";
		
		
		System.out.println("Both strings are anagram to each other: " +AnagramCheck(str1, str2));

	}

	public static boolean AnagramCheck(String str1, String str2) {

		
		
		char[] charArrayFromString1 = str1.toCharArray();
		char[] charArrayFromString2 = str2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		
		
		return Arrays.equals(charArrayFromString1, charArrayFromString2) ;

	}

}
