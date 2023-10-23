package Programs.LinkedInQuestions;

//Java program: Input: a3b2c3, Output: aaabbccc.

public class ExpandingString {
	
	public static void main(String[] args) {
		

	String input = "a3b2c3";
	String output = "";

	
	for (int i = 0; i < input.length(); i++) {
			char currentChar= input.charAt(i);
			
			if(Character.isLetter(currentChar)) {
				
			int count = Character.getNumericValue(input.charAt(i+1));
			//here, getting numeric value present next to character
			
			for (int j = 0; j < count; j++) {
				output = output + currentChar;
			}
			}
	}
	
	System.out.println("input: " + input);
	System.out.println("output: " + output);
	

	}
}
