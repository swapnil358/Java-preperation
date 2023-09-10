package Programs.javaPrograme1;

public class CountNumber {

	/*
	 * https://www.youtube.com/watch?v=xJ6SqygNjl0&list=
	 * PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa
	 * 
	 * Interview question : Count the number
	 * 
	 * Method 1: Iterative method
	 */

	static void CountNum1() {
		int number = 123456;
		
		int count = 0;

		while (number != 0) {

			number = number / 10;
			count++;
		}
		System.out.println("Method 1: Iterative method= " + count);

	}

	/*
	 * Method 2: Recursive method
	 */

	static int CountNum2(int n) {

		if (n == 0) {
			return 0;
		
		}
		return 1 + CountNum2(n / 10);
		}
	
	/*
	 * Method 3: By Coverting number into string
	 */
	
	static void countNum3(){
		
	    int count3 = String.valueOf(12345).length();
		System.out.println("Method 3: By Simple method:"+count3);
	}
	
	
	public static void main(String[] args) {
		CountNum1();
		System.out.println("Method 2: Recursive method= " +CountNum2(12345678));
		countNum3();
	}
}
