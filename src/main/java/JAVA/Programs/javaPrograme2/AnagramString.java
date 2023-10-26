package JAVA.Programs.javaPrograme2;

import java.util.Arrays;

public class AnagramString {

	static void isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll("//s", "");
		System.out.println("after //s: "+s1);
		
		String s2 = str2.replaceAll("//s", "");
		System.out.println("after //s: "+s2);
		
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		}

		char[] s11 = s1.toLowerCase().toCharArray();
		char[] s22 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(s11);
		Arrays.sort(s22);

		boolean status2 = Arrays.equals(s11, s22);
		
		if(status && status2 == true) {
			System.out.println(s1 + " and " +s2 + " are anagrame");
		}else {
			System.out.println(s1 + " and " +s2 + " are not anagrame");
		}
		
	}

	public static void main(String[] args) {
		isAnagram("I love you", "you love i");
	}
}
