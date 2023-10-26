package JAVA.OOPS.OOPSConceptPart3;

//ConnectWise interview question
//I have interface, it has 3 method, but i want to override only two method, i dont want to override 3rd method
//Answer - Make third method as default method, you can override whenever and whichever child class you want.
//Also you can make child class as abstract class, then it will not ask you to implement any interface methods

public interface interviewConnectWise {

	public void a1();
	public void a2();
	public default void a3() {
	}
	
}

class child implements interviewConnectWise {
	
	@Override
	public void a1() {	
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
	}
	
	
	public void a3() {
		// TODO Auto-generated method stub
	}
	
}










