package JAVA.Programs.javaPrograme1;

import java.util.Scanner;

public class CapitaliseFirstLetter {

	public static void main(String[] args) {
			String input = "java programming is fun";
			String result = capitalizeFirstLetter(input);
			System.out.println(result);
		}

		private static String capitalizeFirstLetter(String input) {
			StringBuilder result = new StringBuilder();

			// Split the input string into words
			String[] words = input.split("\\s+");

			// Capitalize the first letter of each word and append to the result
			for (String word : words) {
				if (word.length() > 0) {
					String firstChar = word.substring(0,1).toUpperCase();
					String remainingChars = word.substring(1).toLowerCase();
					result.append(firstChar).append(remainingChars).append(" ");
				}
			}

			return result.toString().trim(); // Trim to remove the trailing space
		}
}
