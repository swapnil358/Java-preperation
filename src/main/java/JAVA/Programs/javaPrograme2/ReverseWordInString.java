package JAVA.Programs.javaPrograme2;

//Java Program to reverse each word in String

public class ReverseWordInString {

	public static String reverseWord(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}
	
	
	//without using reverse();
	 public static String method2(String originalStr) {
	         String[] words = originalStr.split("\\s");
	        String reversedString = "";
	 
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	            String reverseWord = "";
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord + " ";
	        }
	 
	        // Displaying the string after reverse
	       return reversedString;
	    }
	

	

	public static void main(String[] args) {
		
		System.out.println(reverseWord("This is my, Program"));
		System.out.println(method2("This is my, Program"));

	}

}
