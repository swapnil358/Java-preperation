package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

/*
 * ============================================================
 * Interview Question:
 *
 * Input:
 *
 * a = [1, 2, 3]
 *
 * Output:
 *
 * b = [1*2, 2*3, 1*3]
 *
 * Result:
 *
 * b = [2, 6, 3]
 *
 * ============================================================
 */
public class Nice_interview_ques {

	public static void main(String[] args) {

		System.out.println("============================================");
		System.out.println("   ARRAY PAIR MULTIPLICATION PROGRAM");
		System.out.println("============================================");

		method1();

		method2();
	}


	/*
	 * ============================================================
	 * Method 1:
	 *
	 * Multiply current element with the next element.
	 *
	 * For the last element, multiply it with the first element.
	 *
	 * Input:
	 *
	 * a = [1, 2, 3]
	 *
	 * Index:
	 *        0  1  2
	 *
	 * Value:
	 *        1  2  3
	 *
	 * Calculation:
	 *
	 * i = 0
	 * 1 * 2 = 2
	 *
	 * i = 1
	 * 2 * 3 = 6
	 *
	 * i = 2
	 * 3 * 1 = 3
	 *
	 * Output:
	 *
	 * [2, 6, 3]
	 *
	 * Diagram:
	 *
	 * 1 ----> 2
	 * 2 ----> 3
	 * 3 ----> 1
	 *
	 * This is a circular/rotating pair approach.
	 * ============================================================
	 */
	private static void method1() {

		System.out.println("\n***** Method 1: Current + Next Element *****");

		int[] a = {1, 2, 3};

		int[] b = new int[a.length];


		for (int i = 0; i < a.length; i++) {

			/*
			 * For the last element,
			 * use the first element.
			 */
			if (i == a.length - 1) {

				b[i] = a[i] * a[0];

			} else {

				/*
				 * Multiply current element
				 * with the next element.
				 */
				b[i] = a[i] * a[i + 1];
			}
		}


		// Print complete output array.
		System.out.println("Input : " + Arrays.toString(a));
		System.out.println("Output: " + Arrays.toString(b));
	}


	/*
	 * ============================================================
	 * Method 2:
	 *
	 * Generate ALL unique pairs.
	 *
	 * Input:
	 *
	 * a = [1, 2, 3]
	 *
	 * Number of pairs:
	 *
	 * n * (n - 1) / 2
	 *
	 * For n = 3:
	 *
	 * 3 * 2 / 2 = 3 pairs
	 *
	 * Pairs:
	 *
	 * 1 * 2 = 2
	 * 1 * 3 = 3
	 * 2 * 3 = 6
	 *
	 * Output:
	 *
	 * [2, 3, 6]
	 *
	 * IMPORTANT:
	 *
	 * This is NOT a two-pointer technique.
	 *
	 * It is a nested-loop approach.
	 * ============================================================
	 */
	private static void method2() {

		System.out.println("\n***** Method 2: All Unique Pairs *****");

		int[] a = {1, 2, 3};


		/*
		 * Number of unique pairs:
		 *
		 * n * (n - 1) / 2
		 *
		 * For 3 elements:
		 *
		 * 3 * 2 / 2 = 3
		 */
		int size = a.length * (a.length - 1) / 2;

		int[] b = new int[size];


		// Index used to store result in output array.
		int k = 0;


		/*
		 * First loop selects the first element.
		 */
		for (int i = 0; i < a.length; i++) {


			/*
			 * Second loop selects the second element.
			 *
			 * j starts from i + 1
			 *
			 * This prevents duplicate pairs.
			 */
			for (int j = i + 1; j < a.length; j++) {

				/*
				 * Calculate product of the pair.
				 */
				b[k] = a[i] * a[j];

				k++;
			}
		}


		System.out.println("Input : " + Arrays.toString(a));
		System.out.println("Output: " + Arrays.toString(b));
	}
}