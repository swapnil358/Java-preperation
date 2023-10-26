package JAVA.OOPS.OOPConceptPart2;

public class Car {

	int mod;
	int wheel;
	
	
	public static void main(String[] args) {
		
		
		//new Car() ---> Represent Object	
		// a,b,c --> object reference variable	
		// 'New' keyword is used to create object.
		
		
	 Car a = new Car();
	 Car b = new Car();
	 Car c = new Car();
	 
	 
	 a.mod =2015; 
	 a.wheel = 4; 
	 
	 
	 b.mod=2014;
	 b.wheel=4;
	 
	 
	 c.mod=2013;
	 c.wheel=4;

	 
	 System.out.println("Before assigning the references");
	 
	 System.out.println(a.mod);
	 System.out.println(a.wheel);
	 
	 System.out.println(b.mod);
	 System.out.println(b.wheel);
		
	 System.out.println(c.mod);
	 System.out.println(c.wheel);
		
	
	 System.out.println("After shifting the references");
		
	 a=b;
	 b=c;
	 c=a;
	 
	 a.mod = 10;
	System.out.println(a.mod);    //=10
	 
	 c.mod=20;
	 System.out.println(c.mod);  //20
	 System.out.println(a.mod);
	 
	 b.mod=15;
	 System.out.println(b.mod);
	 System.out.println(c.mod);
	 
	}
	
	
}
