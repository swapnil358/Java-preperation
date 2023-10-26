package JAVA_Programs.javaPrograme1;

public class SwapNumber {

	public static void main(String[] args) {
	
		
		int a=10;
		int b=20;
		
		System.out.println("-------------------- using third variable----------------------------");
		
		
		System.out.println("Value of a and b before swapping: " + a +" " +b);
		
		int t;
		
		t =a; 
		a=b; 
		b=t;
		
		
		System.out.println("Value of a and b after swapping: " + a +" " +b);
				
			
		//not using third variable
		System.out.println("--------------------not using third variable----------------------------");
		
		  int x = 10;
	         int y = 5;
	         x = x + y; //15
	         y = x - y; //10
	         x = x - y; //5
	         System.out.println("After swapping: " + " x is " + x + " and " + "y is "+ y);


		System.out.println("--------------------Swap string----------------------------");

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("Before swapping:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		str1 = str1 + str2;		//str1 = HelloWorld
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("\nAfter swapping:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}

}
