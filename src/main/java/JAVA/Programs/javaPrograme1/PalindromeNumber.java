package JAVA.Programs.javaPrograme1;

public class PalindromeNumber {

	public static void palindrome(int num) {

		// 151 , 757, 13531,

		int r = 0;

		int sum = 0;

		int t;

		t = num;

		while (num!= 0) {

			r = num % 10; // get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("number is palindrome");
		} else
			System.out.println("number not palindrome");

	}

	public static void main(String[] args) {
		
		palindrome(151);
		palindrome(152);
		palindrome(789987);

		
	}

}
