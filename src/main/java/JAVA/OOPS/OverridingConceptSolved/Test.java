package JAVA.OOPS.OverridingConceptSolved;

public class Test {

	public static void main(String[] args) {

		Child obj = new Child();   //All parent and overridden method will be called
		obj.p();			//the overridden methods from the Child class will be called based on the actual type of the object.
		obj.p1();
		obj.p3();
		obj.p2();
		//These calls will invoke the methods from the Child class because the object is explicitly of type Child.
		// If a method is overridden in the Child class,
		// the overridden version in the Child class will be called.
		// If a method is not overridden, the version inherited from the Parent class will be called.



		System.out.println("*************************************/n");
// there is no method overriding happening because the object is explicitly declared as Parent
		Parent obj1 = new Parent(); //only parent method will be called
		obj1.p();
		obj1.p1();
		obj.p2();


		System.out.println("*************************************/n");



		Parent obj3 = new Child(); //only parent method will be called ...TopCasting

		/**
		 * If the methods are not overridden in the Child class:
		 *
		 * The methods from the Parent class will be called.
		 * If the methods are overridden in the Child class:
		 *
		 * The overridden methods from the Child class will be called.
		 */
		obj3.p();
		obj3.p1();
		obj3.p2();
		
		

	}

}
