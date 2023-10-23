package OOPS.AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.abstractMethod();

		
		System.out.println("********// dynamic poly or Top casting**************");
		
		Car c = new BMW(); // dynamic poly or Top casting
		c.start();
		c.stop();
		c.refuel();
		c.abstractMethod();
		
		
		
		
		
		

	}

}
