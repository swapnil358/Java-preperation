package JAVA.Programs.DataStructurePrgm;

// Write a program for Binary Search

// Binary Search works only when the array is SORTED.

// Approach:
// 1. Set the lower index (li) to 0.
// 2. Set the higher index (hi) to the last index.
// 3. Find the middle index (mi).
// 4. Compare the middle element with the search element.
// 5. If middle element == search element -> element found.
// 6. If middle element < search element -> search in the RIGHT half.
// 7. If middle element > search element -> search in the LEFT half.
// 8. Continue until the element is found or li becomes greater than hi.
//
// Time Complexity:
// Best Case  -> O(1)
// Worst Case -> O(log n)

public class BinarySearch {

	public static void BiSearch() {

		// Binary Search requires a sorted array
		int[] a = {1, 4, 8, 9, 12, 22, 34, 54, 78, 89};

		// li = Lower Index
		// Initially, the search starts from the first element
		int li = 0;

		// hi = Higher Index
		// Initially, the search ends at the last element
		int hi = a.length - 1;

		// Search element
		int srch = 78;

		// Continue searching while the search range is valid
		while (li <= hi) {

			// Calculate the middle index
			// Example: li = 0, hi = 9
			// mi = (0 + 9) / 2 = 4
			int mi = (li + hi) / 2;

			// Check whether the middle element is the element we need
			if (a[mi] == srch) {

				System.out.println("Element found at index " + mi + " and position " + (mi + 1));

				// Stop searching because the element is found
				break;
			}

			// If middle element is smaller than search element,
			// the required element can only be present in the RIGHT half.
			//
			// Therefore, move the lower index after the middle index.
			else if (a[mi] < srch) {

				li = mi + 1;
			}

			// If middle element is greater than search element,
			// the required element can only be present in the LEFT half.
			//
			// Therefore, move the higher index before the middle index.
			else {

				hi = mi - 1;
			}
		}

		// If li becomes greater than hi,
		// there is no valid search range left.
		// This means the element was not found.
		if (li > hi) {

			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {

		// Calling the Binary Search method
		BiSearch();
	}
}