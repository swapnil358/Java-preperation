package JAVA.Programs.javaPrograme2;

public class ArmstrongNumber {

	/*
	 * Armstrong Number:
	 *
	 * A 3-digit number is called an Armstrong number if
	 * the sum of the cubes of its digits is equal to
	 * the original number.
	 *
	 * Example:
	 *
	 * 153 = (1*1*1) + (5*5*5) + (3*3*3)
	 *
	 *     = 1 + 125 + 27
	 *
	 *     = 153
	 *
	 * Therefore, 153 is an Armstrong number.
	 *
	 * Logic:
	 *
	 * 1. Store the original number in temp.
	 * 2. Extract the last digit using % 10.
	 * 3. Find the cube of the digit.
	 * 4. Add it to sum.
	 * 5. Remove the last digit using / 10.
	 * 6. Repeat until the number becomes 0.
	 * 7. Compare sum with the original number.
	 */

	public static void findArmstrong(int num) {

		int r;
		int sum = 0;
		int temp = num;

		while (num != 0) {

			// Get the last digit
			r = num % 10;

			// Add cube of the digit
			sum = sum + (r * r * r);

			// Remove the last digit
			num = num / 10;
		}

		// Compare original number with calculated sum
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}
	}

	public static void main(String[] args) {

		findArmstrong(153);
		findArmstrong(370);
		findArmstrong(371);
		findArmstrong(407);
		findArmstrong(654);
	}
}