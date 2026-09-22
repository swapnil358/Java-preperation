package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String[] args) {

		usingIfcondition();


	}

	private static void usingIfcondition() {
		int a=10;
		int b=20;
		int c=30;

		//a>b a>c     a is greater
		//b>a b>c     b greater
		//c>a c>b	  c greater


		if(a>b && a>c) {
			System.out.println(a+ " is largest number");
		}
		if(b>a && b>c) {
			System.out.println(b+" is largest number");
		}
		if(c>a && c>b) {
			System.out.println(c+" is largest number");
		}
	}


	/*
	* Math.max(a, b)
     		↓
   		    20

	  Math.max(20, c)
     		↓
    		30
    */
	private static void usingMathMaxFunction(){
		int a = 10;
		int b = 20;
		int c = 30;

		int largest = Math.max(Math.max(a, b), c);

		System.out.println(largest + " is largest number");
	}

//Using Java 8 Streams
	private static void usingStream() {
		int[] numbers = {10, 20, 30, 15, 25};

		int largest = Arrays.stream(numbers)
				.max()
				.getAsInt();

		System.out.println(largest + " is largest number");
	}




}
