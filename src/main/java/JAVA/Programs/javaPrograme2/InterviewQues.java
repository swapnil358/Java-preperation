package JAVA.Programs.javaPrograme2;

import java.util.Arrays;

/*
 * Interview Question:
 *
 * Input:
 * tomorrow
 *
 * Output:
 * ooorrtmw
 *
 *
 * Logic:
 *
 * 1. Convert the String into a character array.
 * 2. Sort the character array.
 * 3. Store the first character in a temporary variable.
 * 4. Start traversing the sorted array.
 * 5. If the current character is not 't',
 *    replace it with the next character.
 * 6. When 't' is found, replace it with the
 *    character stored in temp.
 * 7. Stop the loop.
 *
 *
 * Example:
 *
 * Original:
 * tomorrow
 *
 * After sorting:
 * mooorrtw
 *
 * Move characters before 't':
 *
 * mooorrtw
 * ↓
 * ooorrtmw
 *
 */

public class InterviewQues {

	public static void main(String[] args) {

		String s = "tomorrow";

		System.out.println("Input :: " + s);

		// Convert String into character array
		char[] arr = s.toCharArray();

		// Sort the character array
		Arrays.sort(arr);

		System.out.println("After sorting :: " + new String(arr));

		// Store the first character
		char temp = arr[0];

		/*
		 * Traverse the array.
		 *
		 * If the current character is not 't',
		 * move the next character to the current position.
		 *
		 * When 't' is found, replace 't' with temp
		 * and stop the loop.
		 */

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 't') {

				arr[i] = arr[i + 1];

			} else {

				arr[i] = temp;

				break;
			}
		}

		// Convert character array back to String
		System.out.println("Output :: " + new String(arr)
		);
	}
}