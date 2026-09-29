package JAVA.Programs.DataStructurePrgm;

/*
 * Problem Statement:
 * Move all occurrences of 1 to the LEFT side of the array.
 *
 * Example:
 *
 * Input:
 * 1 1 4 1 7 1 82 56 1 8 0 45 1 3
 *
 * Output:
 * 1 1 1 1 1 1 4 7 82 56 8 0 45 3
 *
 *
 * APPROACH:
 *
 * We use two pointers:
 *
 * 1. i
 *    - Used to traverse the array from left to right.
 *
 * 2. leftPointer
 *    - Represents the next position where a '1' should be placed.
 *
 * Initially:
 *
 *     leftPointer = 0
 *
 * Whenever we find arr[i] == 1:
 *
 *     1. Swap arr[i] with arr[leftPointer].
 *     2. Increment leftPointer.
 *
 * Why?
 *
 * Because leftPointer always points to the next available
 * position on the left side where we need to place a 1.
 *
 *
 * TIME COMPLEXITY:
 * O(n)
 *
 * We traverse the array only once.
 *
 * SPACE COMPLEXITY:
 * O(1)
 *
 * We use only a temporary variable and a pointer.
 *
 */

public class ShiftAll1ToLeftSide {

	public static void main(String[] args) {

		int[] array = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};

		System.out.println("Original Array:");

		for (int num : array) {
			System.out.print(num + " ");
		}

		System.out.println();

		System.out.println("Modified Array:");

		method3(array);
	}

	public static void method3(int[] arr) {

		/*
		 * leftPointer represents the next position
		 * where a 1 should be placed.
		 *
		 * Initially, the first 1 should be placed
		 * at index 0.
		 */
		int leftPointer = 0;

		/*
		 * Traverse the array from left to right.
		 */
		for (int i = 0; i < arr.length; i++) {

			/*
			 * Check whether the current element is 1.
			 */
			if (arr[i] == 1) {

				/*
				 * Swap the current 1 with the element
				 * at leftPointer.
				 *
				 * This places the 1 at the correct
				 * position on the left side.
				 */
				int temp = arr[i];

				arr[i] = arr[leftPointer];

				arr[leftPointer] = temp;

				/*
				 * The current leftPointer position
				 * now contains 1.
				 *
				 * Move leftPointer to the next position
				 * for the next 1.
				 */
				leftPointer++;
			}
		}

		/*
		 * Print the final array.
		 */
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}