package JAVA_Programs.javaPrograme2;

public class RemoveDuplicateWordsFromString {

	// Find the duplicate strings in a given statement and remove them?
	// https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-7/

	public static void main(String[] args) {
		String input = "Welcome to QAScript Java Interview Question in QAScript";

		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					words[j] = null;

				}
			}
		}
		for (int k = 0; k < words.length; k++) {
			System.out.println(words[k]);

			if (words[k] != null) {
				System.out.println(words[k]);
			}
		}
	}
}
