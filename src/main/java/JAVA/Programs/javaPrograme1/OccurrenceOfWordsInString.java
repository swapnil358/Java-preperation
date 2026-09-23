package JAVA.Programs.javaPrograme1;

public class OccurrenceOfWordsInString {

	static int countOccurrences() {

		String str = "GeeksforGeeks for A computer science for portal for geeks science";
		String word = "science";

		// Split the string by spaces.
		String a[] = str.split(" ");

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			// If the word matches, increase count.
			if (word.equals(a[i])) {
				count++;
			}
		}

		return count;
	}

	public static void main(String args[]) {

		String word = "science";

		System.out.println("Word: " + word +" | Occurrence: " + countOccurrences());
	}
}