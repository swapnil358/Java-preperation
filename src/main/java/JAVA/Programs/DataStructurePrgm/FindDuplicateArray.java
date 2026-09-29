package JAVA.Programs.DataStructurePrgm;

import java.util.HashSet;

// Find duplicate elements in an array.
//
// This program demonstrates two approaches:
//
// Method 1:
// Brute Force approach.
// Compare every element with every other element.
//
// Method 2:
// HashSet approach.
// HashSet stores unique elements.
// If add() returns false, it means the element
// already exists in the HashSet, so it is a duplicate.
//
// Time Complexity:
// Brute Force -> O(n²)
// HashSet      -> O(n) average
//
// Space Complexity:
// Brute Force -> O(1)
// HashSet      -> O(n)

public class FindDuplicateArray {

	// Find the duplicate values

	// https://youtu.be/Y1xfMU4xyDE?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

	public static void main(String[] args) {

		int[] a = {3, 7, 8, 9, 3, 5, 6, 5, 77, 34, 8};

		// =====================================================
		// METHOD 1: BRUTE FORCE
		// =====================================================

		System.out.println("Method one - Brute Force");

		// Outer loop selects one element at a time.
		for (int i = 0; i < a.length; i++) {

			// Inner loop compares the selected element
			// with the elements that come after it.
			//
			// We start from i + 1 so that:
			// 1. We don't compare an element with itself.
			// 2. We don't print the same duplicate twice.
			for (int j = i + 1; j < a.length; j++) {

				// If both values are equal,
				// we found a duplicate.
				if (a[i] == a[j]) {

					System.out.print(a[j] + ", ");
				}
			}
		}

		System.out.println();
		System.out.println("---------------------------------------------");

		// =====================================================
		// METHOD 2: HASHSET
		// =====================================================

		System.out.println("Method two - HashSet");

		// HashSet stores only UNIQUE elements.
		HashSet<Integer> set = new HashSet<>();

		// Traverse the array one element at a time.
		for (int i = 0; i < a.length; i++) {

			// add() returns:
			//
			// true  -> element was not present and was added.
			// false -> element already exists.
			//
			// Therefore, false means we found a duplicate.
			if (set.add(a[i]) == false) {

				System.out.print(a[i] + ", ");
			}
		}
	}
}