package OOPS.Patterns;

/*
 * 			*
 *			* *
 *			* * *
 *			* * * *
 *
 */

public class patternOne {

	public static void main(String[] args) {
		System.out.println("pattern 1");
		pattern1();

		System.out.println("pattern 2");
		pattern2();

		System.out.println("pattern 1 + pattern2");
		pattern1PlusPattern2();

		System.out.println("pattern 3");
		pattern3();

		System.out.println("pattern 4");
		pattern4();
		
		System.out.println("pattern 3 + pattern4");
		pattern3PlusPattern4();

	}

	public static void pattern1() {
		int n = 4;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/*
	 * * * * * * *
	 *
	 */
	public static void pattern2() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern1PlusPattern2() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void pattern3() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

	public static void pattern4() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
	
	public static void pattern3PlusPattern4() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
