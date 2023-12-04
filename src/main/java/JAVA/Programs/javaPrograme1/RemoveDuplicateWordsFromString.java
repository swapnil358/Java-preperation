package JAVA.Programs.javaPrograme1;

public class RemoveDuplicateWordsFromString {

	// Find the duplicate strings in a given statement and remove them?
	// https://www.qafox.com/java-for-testers-interview-questions-and-answers-part-7/

	public static void main(String[] args) {

		String input = "Welcome to QAScript Java Interview Question in QAScript";

		System.out.println("Before removing duplicates: "+ input);
		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					words[j] = null;

				}
			}
		}

		String rev="";
		for (int k = 0; k < words.length; k++) {
			if (words[k] != null) {
				rev= rev+" "+words[k];
				
			}
		}
		System.out.println("After removing duplicates: "+ rev);

	}

}
