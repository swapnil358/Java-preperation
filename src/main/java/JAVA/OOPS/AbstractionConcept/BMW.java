package JAVA.OOPS.AbstractionConcept;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("Overridden----start");
		
	}

	@Override
	public void stop() {
		System.out.println("Overridden----stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("Overridden----refuel");
		
	}
	
	//Non overriden method
	//OR // BMW's own method
	
	public void theftsafety() {
		System.out.println("BMW-----theftsafety");
	}

	@Override
	public void abstractMethod() {
		System.out.println("Overidden-----abstractMethod");
		
	}

}
