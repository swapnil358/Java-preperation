package JAVA.Programs.javaPrograme1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {

		System.out.println("======================================");
		System.out.println("     MERGE TWO ARRAYS - 3 APPROACHES");
		System.out.println("======================================");

		usingSeparateLoops();

		usingOneLoop();

		usingStream();
	}


	/*
	 * =========================================================
	 * Approach 1: Using Separate Loops
	 * =========================================================
	 *
	 * Array A:
	 *
	 * [10, 20, 30]
	 *
	 * Array B:
	 *
	 * [70, 80, 90]
	 *
	 * Create a new array C:
	 *
	 * [10, 20, 30, 70, 80, 90]
	 *
	 * Step 1:
	 *
	 * Copy A into C.
	 *
	 * C:
	 *
	 * [10, 20, 30,  0,  0,  0]
	 *
	 * Step 2:
	 *
	 * Copy B into C starting from index a.length.
	 *
	 * C:
	 *
	 * [10, 20, 30, 70, 80, 90]
	 */
	private static void usingSeparateLoops() {

		System.out.println("\n***** Using Separate Loops *****");

		int[] a = {10, 20, 30};

		int[] b = {70, 80, 90};

		// Create a new array with enough space
		// to store both arrays.
		int[] c = new int[a.length + b.length];


		/*
		 * Copy elements of array A into C.
		 *
		 * a[0] -> c[0]
		 * a[1] -> c[1]
		 * a[2] -> c[2]
		 */
		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}


		/*
		 * Copy elements of array B into C.
		 *
		 * a.length = 3
		 *
		 * Therefore:
		 *
		 * b[0] -> c[3]
		 * b[1] -> c[4]
		 * b[2] -> c[5]
		 */
		for (int i = 0; i < b.length; i++) {

			c[a.length + i] = b[i];
		}


		// Print the complete merged array.
		System.out.println(Arrays.toString(c));
	}


	/*
	 * =========================================================
	 * Approach 2: Using One Loop
	 * =========================================================
	 *
	 * A:
	 *
	 * [10, 20, 30]
	 *
	 * B:
	 *
	 * [70, 80, 90]
	 *
	 * C:
	 *
	 * [10, 20, 30, 70, 80, 90]
	 *
	 * We use a single loop from:
	 *
	 * 0 -> c.length - 1
	 *
	 * If i < a.length:
	 *
	 *     take element from A
	 *
	 * Else:
	 *
	 *     take element from B
	 *
	 * Important:
	 *
	 * b[i - a.length]
	 *
	 * converts the C index into the correct B index.
	 *
	 * Example:
	 *
	 * i = 3
	 *
	 * 3 - 3 = 0
	 *
	 * So:
	 *
	 * c[3] = b[0]
	 */
	private static void usingOneLoop() {

		System.out.println("\n***** Using One Loop *****");

		int[] a = {10, 20, 30};

		int[] b = {70, 80, 90};

		int[] c = new int[a.length + b.length];


		for (int i = 0; i < c.length; i++) {

			if (i < a.length) {

				// Copy from array A.
				c[i] = a[i];

			} else {

				// Copy from array B.
				c[i] = b[i - a.length];
			}
		}


		System.out.println(Arrays.toString(c));
	}


	/*
	 * =========================================================
	 * Approach 3: Using Java 8 Stream
	 * =========================================================
	 *
	 * Arrays.stream(a)
	 *         |
	 *         v
	 *      [10,20,30]
	 *
	 * Arrays.stream(b)
	 *         |
	 *         v
	 *      [70,80,90]
	 *
	 *          |
	 *          v
	 *
	 *   IntStream.concat()
	 *
	 *          |
	 *          v
	 *
	 * [10,20,30,70,80,90]
	 *
	 *          |
	 *          v
	 *
	 *       toArray()
	 *
	 *          |
	 *          v
	 *
	 * int[]
	 */
	private static void usingStream() {

		System.out.println("\n***** Using Stream *****");

		int[] a = {10, 20, 30};

		int[] b = {70, 80, 90};


		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();


		System.out.println(Arrays.toString(c));
	}
}