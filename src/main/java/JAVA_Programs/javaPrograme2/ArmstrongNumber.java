package JAVA_Programs.javaPrograme2;

public class ArmstrongNumber {

	// A positive number is called armstrong number if it is equal to the sum of
	// cubes of its digits for example 0,

	/*
	 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So:
	 * 1+125+27=153
	 * 
	 */

	public static void findArmstrong(int num) {

		int r;
		int sum = 0;
		int temp;

		temp = num;

		while (num != 0) {
			r = num % 10;

			sum = sum + (r * r * r);

			num = num / 10;

		}
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong number");

		} else
			System.out.println(temp + " is not an Armstrong number\"");

	}

	public static void main(String[] args) {
		findArmstrong(65456);

	}

}
