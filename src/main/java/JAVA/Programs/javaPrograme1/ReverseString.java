package JAVA.Programs.javaPrograme1;

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

		reverseString();

	}

	public static void reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
	
		System.out.println("Using string buffer: "+	String.valueOf(sb));
	}

	public static void reverseString(){

		System.out.println("********* Reverse String using two pointer *********");

		String str = "Selenium";

		char[] arr = str.toCharArray();

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		String reversed = new String(arr);

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversed);
	}
	
}
