package JAVA.OOPS.AbstractionConcept;


//Asked - ConnectWise 
//Can abstract class have constructor- if yes, Yes, it can have
// how to call it as we cannot create object of abstract class

public abstract class Interview1 {
	public Interview1() {
		this(10);
		System.out.println("Default Constructor");
	}
	
	private Interview1(int a) {
		System.out.println("Parametrised constructor");
	}

	
	
}

class child{
	
	public child(){
	super();
	}
	
}


class test{
	public static void main(String[] args) {
		child c = new child();
	}
}



