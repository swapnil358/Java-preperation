package JAVA.Programs.DataStructurePrgm;

// Write a Java program to sort String elements using Bubble Sort.
//
// Approach:
// 1. Bubble Sort compares two adjacent elements.
// 2. For Strings, we cannot use > or < operators.
// 3. Therefore, we use compareTo() to compare two Strings.
// 4. If compareTo() returns a value greater than 0,
//    the first String comes after the second String.
// 5. Therefore, we swap the two Strings.
// 6. After every pass, the String that should come later
//    moves towards the end of the array.
//
// Time Complexity:
// Best Case    -> O(n) with optimization using a swap flag
// Average Case -> O(n²)
// Worst Case   -> O(n²)
//
// Space Complexity:
// O(1)

public class BubbleSortString {

	// Reference:
	// https://youtu.be/v6hmmfIiKu4?t=1808

	public static void main(String[] args) {

		// Unsorted String array
		String[] a = {"Zebra", "Xero", "Apple", "Aapple", "Jack", "Nik"	};

		String temp;

		// Outer loop controls the number of passes.
		// After every pass, the largest String
		// according to lexicographical order moves to the end.
		for (int i = 0; i < a.length - 1; i++) {

			// Inner loop compares adjacent Strings.
			// - i avoids comparing elements that are already sorted.
			for (int j = 0; j < a.length - 1 - i; j++) {

				// compareTo() compares two Strings lexicographically.
				//
				// compareTo() returns:
				// Negative value -> a[j] comes before a[j + 1]
				// Zero            -> both Strings are equal
				// Positive value  -> a[j] comes after a[j + 1]
				//
				// If result > 0, the Strings are in the wrong order,
				// so we swap them.
				if (a[j].compareTo(a[j + 1]) > 0) {

					// Store the first String temporarily
					temp = a[j];

					// Move the second String to the first position
					a[j] = a[j + 1];

					// Move the first String to the second position
					a[j + 1] = temp;
				}
			}
		}

		// Print the sorted String array
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + ", ");
		}
	}
}