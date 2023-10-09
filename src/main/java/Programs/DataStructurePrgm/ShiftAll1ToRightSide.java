package Programs.DataStructurePrgm;

import java.util.Arrays;

public class ShiftAll1ToRightSide {

	public static void main(String[] args) {

		int a[] = {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};
		method3(a);


	}

	/**
	 * This is exactly opposite to LeftSide,
	 * Start rightPointer from the end
	 * Iterate reverse (end -> start)
	 * decrement rightPointer after swap
	 * @param array
	 */

	public static void method3(int[] array) {
		//This is correct solution
		int rightPointer = array.length - 1;

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 1) {
				// Swap 1 with the element at rightPointer
				int temp = array[i];
				array[i] = array[rightPointer];
				array[rightPointer] = temp;

				rightPointer--;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}