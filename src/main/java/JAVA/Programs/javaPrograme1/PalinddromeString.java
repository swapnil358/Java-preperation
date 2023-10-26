package JAVA.Programs.javaPrograme1;

public class PalinddromeString {
	
	private static boolean isPalindrome(String str) {
		if (str == null)
		return false;
		
		
		
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		
		System.out.println("reverse : "+strBuilder.reverse());
		
		return strBuilder.toString().equals(str);
		
	
		}
	
	//Very important method for string palindrome
	public static void IsPalindrom_Method2() {
		
		String inputString = "aaabaaa";
		String rev="";
		
		
		for(int i=inputString.length()-1; i>=0 ; i--) {
			rev= rev+inputString.charAt(i);
		}
		System.out.println(rev);
		
		if(inputString.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("abcd"));
		IsPalindrom_Method2();
		
	}

}
