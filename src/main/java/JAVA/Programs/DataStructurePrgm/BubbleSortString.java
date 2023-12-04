package JAVA.Programs.DataStructurePrgm;

public class BubbleSortString {

	// https://youtu.be/v6hmmfIiKu4?t=1808

	public static void main(String[] args) {

		String[] a = { "Zebra", "Xero", "Apple", "Aapple", "Jack", "Nik" };

		String temp;
		for (int i = 0; i < a.length; i++) { // this for loop for iteration

			for (int j = 0; j < a.length - 1; j++) { // this for loop for swap the number

				if (a[j].compareTo(a[j + 1]) > 0) { //
													//The compareTo method is used to compare strings lexicographically.
					// It returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater
					// than the second string.
													//
													//
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + ",");
		}

	}
}
