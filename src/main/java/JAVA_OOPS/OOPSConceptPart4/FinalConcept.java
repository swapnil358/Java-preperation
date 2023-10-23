package JAVA_OOPS.OOPSConceptPart4;

//refer video- https://youtu.be/aqDiBybBRqM?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

/*	final  -- keyword -->if class is final --then inheritance is not possible 
 * 					  -->if method is final we can not override the method 
 * 					  -->if Variable is final - value can not be changed
	finally -- block
	finalize - method
*/

public class FinalConcept {

	public static void main(String[] args) {

		final int i = 10;
		
		/*
		 * Final keyword is used to define the constant values (Value can not change)
		 * Value can be assigned only once and after assignment, value of a constant
		 * can't be changed.
		 */
		
		System.out.println(i);

	     //i= 20; //giving an error
		
		
		/*
		 * 2.final method: final method is a Java method,it will not allow method
		 * overriding. In method overriding, we have to provide same method with
		 * different implementation at both super class and at sub class, where super
		 * class method never be declared as final irrespective of sub class method
		 * final.
		 */
	
	
	
	}
	

	
	
}
