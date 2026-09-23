package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

/*
* Given an integer array, move all occurrences of the number 1 to the left side of the array while keeping all other elements on the right side. Do this in-place without using an additional array.
*
* */

public class ShiftAll1ToLeftSide {

	public static void main(String[] args) {

		int[] arr1 = {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};

		System.out.println("Original Array  : " + Arrays.toString(arr1));

		method1(arr1);

		System.out.println("Method 1 Output  : " + Arrays.toString(arr1));
		System.out.println("----------------------------------------");


		int[] arr2 = {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};

		method2(arr2);

		System.out.println("Method 2 Output  : " + Arrays.toString(arr2));
		System.out.println("----------------------------------------");


		int[] arr3 = {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};

		method3(arr3);

		System.out.println("Method 3 Output  : " + Arrays.toString(arr3));
	}


	/*
	 * Method 1:
	 * Two-pointer approach.
	 */
	private static void method1(int[] arr) {

		//	int[] arr1 = {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3};


		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (arr[left] == 1) {
				left++;
			} else if (arr[right] != 1) {
				right--;
			} else {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}
	}


	/*
	 * Method 2:
	 * Two-pointer approach using conditions.
	 */
	private static void method2(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (arr[left] != 1 && arr[right] == 1) {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;

			} else {

				if (arr[left] == 1) {
					left++;
				}

				if (arr[right] != 1) {
					right--;
				}
			}
		}
	}


	/*
	 * Method 3:
	 * Move all 1's to the left side.
	 *
	 * This is the simplest and most efficient approach.
	 */
	private static void method3(int[] arr) {

		int leftPointer = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {

				int temp = arr[i];
				arr[i] = arr[leftPointer];
				arr[leftPointer] = temp;

				leftPointer++;
			}
		}
	}
}