package JAVA_Programs.javaPrograme1;

public class ReverseString {

	public static void main(String[] args) {

		// Reverse string
		// Diff between String and StringBuffer
		// DO we have reverse function in String

		String s = "Selenium";

		String rev = "";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
		
		
		reverse("Selenium");

	}

	public static void reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
	
		System.out.println("Using string buffer: "+	String.valueOf(sb));
	}
	
}
