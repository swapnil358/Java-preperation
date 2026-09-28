package JAVA.Programs.javaPrograme2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {

	public static void main(String[] args) {

		method1();
		method2();
		method3();
	}

	/*
	 * ============================================================
	 * Method 1: Using HashSet
	 * ============================================================
	 *
	 * HashSet does not allow duplicate values.
	 *
	 * Set.add() returns:
	 *
	 * true  -> element is added for the first time
	 * false -> element already exists in the Set
	 *
	 * Time Complexity  : O(n)
	 * Space Complexity : O(n)
	 */

	public static void method1() {

		int[] arr = {10, 50, 66, 50, 79, 10, 10};

		Set<Integer> dup = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (dup.add(arr[i]) == false) {

				System.out.println(
						"Found duplicate element in array: " + arr[i]
				);
			}
		}
	}

	/*
	 * ============================================================
	 * Method 2: Using Nested Loops
	 * ============================================================
	 *
	 * Compare every element with all elements to its right.
	 *
	 * If arr[i] == arr[j], the element is duplicate.
	 *
	 * Time Complexity  : O(n²)
	 * Space Complexity : O(1)
	 */

	public static void method2() {

		int[] arr = {10, 50, 66, 50, 79, 10, 10};

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
				}
			}
		}
	}

	/*
	 * ============================================================
	 * Method 3: Comparing Adjacent Elements
	 * ============================================================
	 *
	 * Compare the current element with the next element.
	 *
	 * arr[i] == arr[i + 1]
	 *
	 * This finds duplicates only when they are adjacent.
	 *
	 * For example:
	 *
	 * {10, 50, 66, 50, 79, 10, 10}
	 *
	 * The last two 10s are adjacent, so 10 is found.
	 *
	 * But 50 is not adjacent, so 50 is not found.
	 *
	 * Time Complexity  : O(n)
	 * Space Complexity : O(1)
	 */

	public static void method3() {

		int[] arr1 = {10, 50, 66, 50, 79, 10, 10};

		for (int i = 0; i < arr1.length - 1; i++) {

			if (arr1[i] == arr1[i + 1]) {

				System.out.println("my method: " + arr1[i + 1]);
			}
		}
	}
}