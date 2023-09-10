package Programs.javaPrograme1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInSentence {
	
	public static void main(String[]args) {
		
	
		System.out.println(reverseWords());
		
		reverseWord2();
		
		reverse3();
		
		usingStringBuffer();
		
	}
	
	public static void reverse3() {
		String name = "My name is John";
		
		String[] word = name.split(" ");
		
		String reverseString="";
		for(String w : word) {
			
			String reverse="";
			for(int i=w.length()-1; i>=0; i--) {
				reverse = reverse + w.charAt(i);
			}
			
			reverseString = reverseString + reverse+" ";
		}
		System.out.println("reverse3 "+reverseString);
	}
	
	
	public static void usingStringBuffer() {
		String str = "My name is Swapnil";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("usingStringBuffer: "+sb.toString());
	}
	
	public static String reverseWords() {
		

		String name = "My name is Khan";

		String rev="";
		String[] spName = name.split("\\s");
		
		for(String word : spName) {
		
			StringBuilder builder = new StringBuilder(word);
			builder.reverse();
			
			String firstLetter=builder.substring(0,1);
			String remainingLetters=builder.substring(1);
			
			rev= rev+firstLetter.toUpperCase()+remainingLetters+" ";
						
	}
		return rev.trim();
	}
	
	
	
	
	
	
	public static void reverseWord2() {
		String name = "My name is Swapnil";
		
		String result = Arrays.asList(name.split(" "))
					 .stream().map(s->new StringBuilder(s).reverse())
					 .collect(Collectors.joining(" "));
		
		System.out.println(result);
	}
	
}
