package JAVA.Programs.DataStructurePrgm;

import java.util.Arrays;

// Problem Statement:
//
// Write a Java program to move all occurrences of 1
// to the RIGHT side of an array.
//
// Example:
//
// Input:
// {1, 1, 4, 1, 7, 1, 82, 56, 1, 8, 0, 45, 1, 3}
//
// Expected Output:
// {4, 7, 82, 56, 8, 0, 45, 3, 1, 1, 1, 1, 1, 1}
//
// This class demonstrates TWO approaches:
//
// Approach 1:
// Start from the RIGHT and move 1s towards the right.
//
// Approach 2:
// Start from the LEFT and move non-1 elements towards the left.
//
// Both approaches:
// Time Complexity  -> O(n)
// Space Complexity -> O(1)

public class ShiftAll1ToRightSide {

	public static void main(String[] args) {

		// =====================================================
		// APPROACH 1
		// =====================================================

		int[] array1 = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(array1));

		method1(array1);

		System.out.println("Approach 1 - Right to Left:");
		System.out.println(Arrays.toString(array1));


		// =====================================================
		// APPROACH 2
		// =====================================================

		int[] array2 = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};

		method2(array2);

		System.out.println("Approach 2 - Left to Right:");
		System.out.println(Arrays.toString(array2));
	}


	// =========================================================
	// APPROACH 1
	// =========================================================
	//
	// Start rightPointer from the last index.
	//
	// Traverse the array from RIGHT to LEFT.
	//
	// Whenever we find 1:
	//     1. Swap it with the element at rightPointer.
	//     2. Decrement rightPointer.
	//
	// rightPointer represents the position where
	// the next 1 should be placed.
	//
	// Example:
	//
	// 1 4 7 1 8 1
	//           ↑
	//      rightPointer
	//
	// After processing:
	//
	// 4 7 8 1 1 1

	public static void method1(int[] array) {
		//int[] array2 = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};
		// Start from the last index because
		// we want to move 1s to the right.
		int rightPointer = array.length - 1;

		// Traverse from RIGHT to LEFT.
		for (int i = array.length - 1; i >= 0; i--) {

			// If current element is 1,
			// move it to the right side.
			if (array[i] == 1) {

				// Swap current 1 with the element
				// at rightPointer.
				int temp = array[i];

				array[i] = array[rightPointer];

				array[rightPointer] = temp;

				// This position now contains 1.
				// Move rightPointer one position left
				// for the next 1.
				rightPointer--;
			}
		}
	}


	// =========================================================
	// APPROACH 2
	// =========================================================
	// int[] array2 = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};
	// Instead of finding 1s, we find NON-1 elements.
	//
	// Start leftPointer from index 0.
	//
	// Traverse the array from LEFT to RIGHT.
	//
	// Whenever we find a non-1:
	//     1. Swap it with the element at leftPointer.
	//     2. Increment leftPointer.
	//
	// leftPointer represents the position where
	// the next non-1 element should be placed.
	//
	// Once all non-1 elements are placed on the left,
	// all 1s automatically remain on the right.
	//
	// Example:
	//
	// 1 4 7 1 8 1
	// ↑
	// leftPointer
	//
	// After processing:
	//
	// 4 7 8 1 1 1

	public static void method2(int[] array) {
		// int[] array2 = {1, 1, 4, 1, 7, 1, 82,56, 1, 8, 0, 45, 1, 3};
		// Start from the first index because
		// we want non-1 elements on the left.
		int leftPointer = 0;

		// Traverse from LEFT to RIGHT.
		for (int i = 0; i < array.length; i++) {

			// If current element is NOT 1,
			// it belongs on the left side.
			if (array[i] != 1) {

				// Swap current non-1 element
				// with the element at leftPointer.
				int temp = array[i];

				array[i] = array[leftPointer];

				array[leftPointer] = temp;

				// This position now contains a non-1.
				// Move leftPointer to the next position.
				leftPointer++;
			}
		}
	}
}