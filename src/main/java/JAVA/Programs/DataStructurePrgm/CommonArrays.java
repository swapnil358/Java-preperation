package JAVA.Programs.DataStructurePrgm;

import java.util.ArrayList;

// Find common elements in three sorted arrays.
//
// Approach:
// We use three pointers:
// x -> points to the current element of array a1
// y -> points to the current element of array a2
// z -> points to the current element of array a3
//
// Since all three arrays are sorted:
//
// 1. If all three elements are equal,
//    we found a common element.
//
// 2. If a1[x] is smaller than a2[y],
//    move x forward because a1[x] cannot match
//    the current or any previous element of a2.
//
// 3. Else if a2[y] is smaller than a3[z],
//    move y forward.
//
// 4. Otherwise, move z forward.
//
// Time Complexity:
// O(n1 + n2 + n3)
//
// Space Complexity:
// O(k), where k is the number of common elements.

public class CommonArrays {

	// How to Find Common Elements in Three Sorted Arrays in Java

	// https://youtu.be/rUPdTNmKa6A?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

	public static void main(String[] args) {

		// Three SORTED arrays
		int[] a1 = {2, 4, 8};
		int[] a2 = {2, 3, 4, 8, 10, 16};
		int[] a3 = {2, 8, 14, 40};

		// Three pointers.
		// Each pointer represents the current index
		// in its respective array.
		int x = 0;
		int y = 0;
		int z = 0;

		// ArrayList is used to store the common elements.
		ArrayList<Integer> arr = new ArrayList<>();

		// Continue until any one of the arrays is completely traversed.
		//
		// If any pointer reaches the end of its array,
		// there cannot be any more common elements.
		while (x < a1.length && y < a2.length && z < a3.length) {

			// Check whether the current elements of all
			// three arrays are equal.
			//
			// If they are equal, we found a common element.
			if (a1[x] == a2[y] && a2[y] == a3[z]) {

				// Add the common element to ArrayList
				arr.add(a1[x]);

				// Move all three pointers because
				// this element has already been processed.
				x++;
				y++;
				z++;

			}

			// If a1[x] is smaller than a2[y],
			// move x forward.
			//
			// Because the arrays are sorted, a1[x]
			// cannot become equal to a2[y] unless
			// we move to the next element in a1.
			else if (a1[x] < a2[y]) {

				x++;
			}

			// If a2[y] is smaller than a3[z],
			// move y forward.
			else if (a2[y] < a3[z]) {

				y++;
			}

			// If neither of the above conditions is true,
			// move z forward.
			//
			// This means a3[z] is the smallest/current
			// candidate that needs to be checked next.
			else {

				z++;
			}
		}

		// Print all common elements
		System.out.println("Common elements are: " + arr);
	}
}