package JAVA.OOPS.OOPSConceptPart4;

public class A {

	
	/*Constructor Concept
	 * 1. Class name and constructor name will be Same
	   2. No return type
	*/
	
	public A() {
		System.out.println("Parent Constructor");								
	}																			
																				
	public A(int i) {
		System.out.println(i);
	}

	public A(int i, int j) {
		System.out.println("Parent i" + i);
		System.out.println("Parent j" + j);
	}

	public static void main(String[] args) {
		A a =  new A(10,20);
	}

}
