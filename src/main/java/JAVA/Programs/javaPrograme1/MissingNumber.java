
package JAVA.Programs.javaPrograme1;

//https://youtu.be/opJ0Vhok01U

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		// System.out.println(a.length);

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum1 = sum1 + a[i]; // 49

		}

		System.out.println("sum1 : " + sum1);

		int sum2 = 0;
		for (int j = 1; j <= 10; j++) {
			sum2 = sum2 + j;		//55
		}

		System.out.println("sum2 : " + sum2);

		System.out.println("missing number is" + " " + (sum2 - sum1));

	}

}
