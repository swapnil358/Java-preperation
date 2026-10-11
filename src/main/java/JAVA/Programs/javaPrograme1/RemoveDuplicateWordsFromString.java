package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {

		usingForLoop();
		usingStream();
	}

	private static void usingForLoop() {
		String input = "Welcome to QAScript Java Interview Question Java in geeks";

		System.out.println("Before removing duplicates: " + input);

		String[] words = input.split("\\s+");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				if (words[i] != null && words[i].equals(words[j])) {
					words[j] = null;
				}
			}
		}

		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i] != null) {
				if (!result.isEmpty()) {
					result= result + " ";
				}
				result= result +  words[i];
			}
		}

		System.out.println("After removing duplicates: " + result);
	}


	public static void usingStream(){

		String input =
				"Welcome to QAScript Java Interview Question Java in geeks";

		String result = Arrays.stream(input.split("\\s+"))
				.distinct()
				.collect(Collectors.joining(" "));

		System.out.println(result);
	}

}
