package JAVA.Programs.DataStructurePrgm;

public class BinarySearch {
	/*
	* Case	Complexity	Explanation
		Best-case time	\(O(1)\)	The element is found at the middle in the first iteration.
		Average-case time	\(O(\log n)\)	The search range is halved in each iteration.
		Worst-case time	\(O(\log n)\)	The algorithm continues halving the range until the element is found or the range becomes empty.
		Auxiliary space	\(O(1)\)	Only a few variables (li, hi, mi, found) are used.
	* */

	public static void binarySearch() {

		// Binary Search requires a sorted array
		int[] a = {1, 4, 8, 9, 12, 22, 34, 54, 78, 89};

		int search = 8;

		int li = 0;
		int hi = a.length - 1;

		boolean found = false;

		while (li <= hi) {


			// Calculate middle index
			int mi = (li + hi) / 2;


			if (a[mi] == search) {

				System.out.println("Element found at index " + mi + " and position " + (mi + 1));
				found = true;
				break;

			} else if (search > a[mi]) {
				li = mi + 1;

			} else {
				hi = mi - 1;
			}

		}

		if (!found) {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		binarySearch();
	}
}