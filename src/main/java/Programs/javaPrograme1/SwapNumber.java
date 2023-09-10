package Programs.javaPrograme1;

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
		

	}

}
