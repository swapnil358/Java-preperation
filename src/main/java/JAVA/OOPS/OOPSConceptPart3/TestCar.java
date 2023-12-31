package JAVA.OOPS.OOPSConceptPart3;

public class TestCar {
	
	//Refer video  "https://www.youtube.com/watch?v=DWpYniQAVyI&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=13"
	
	
	public static void main(String[] args) {
		
		
		//static polymorphism ------------> compile time polymorphism
		
		System.out.println("********Creating BMW object************");
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafty();
		b.engine();
		b.tyre();


		System.out.println("********Creating Car object************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();



		System.out.println("*******//Top Casting*************");

		//Top Casting*****      //Only overridden method and parent will be called
		Car c1 = new BMW();  //Child class object can be referred by parent class reference variable---Dynamic Polymorphism --Run-time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.tyre();



		System.out.println("********************");


		Vehicle v1 = new Vehicle();
		v1.engine();


		System.out.println("********************");

		Vehicle v2 = new BMW();
		v2.engine();


		System.out.println("********down cast************");


		  BMW b5 = (BMW) new Vehicle();
		  b5.engine();








		//Down Casting*****
		//Parent class can be referred by chile class object reference variable? --Not possible -- it gives "ClassCastException"

		BMW b1 = (BMW)new Car();
		
		
		
	}

}
