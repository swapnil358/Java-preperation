package JAVA_OOPS.StringImmutableConcept;

public class StringExample {
	
	public static void main(String[] args) {
		
		
		StringBuffer sb1= new StringBuffer("abc");
		
		StringBuffer sb2=new StringBuffer("abc");
		
		System.out.println(sb1==sb2); 
		System.out.println(sb1.equals(sb2));
		
		////Output: false, false --here in StringBuffer--> euqals() method act similar '==' reference comparison
		

		/**
		 * Explain:
		 * 
		 * 1. sb1 == sb2: This comparison checks whether the two StringBuffer references 
		 * (sb1 and sb2) point to the same memory location. 
		 * In this case, sb1 and sb2 are separate StringBuffer objects created with the new keyword. 
		 * They do not share the same memory location. 
		 * Therefore, sb1 == sb2 will return false because sb1 and sb2 are two distinct objects.
		 * 
		 * 
		 * 2. sb1.equals(sb2): This comparison checks whether the content of the two StringBuffer objects is the same. 
		 * The equals() method for StringBuffer is not overridden to compare the content like it is for String. Instead, 
		 * it uses the default implementation from the Object class, which compares object references. 
		 * Since sb1 and sb2 are distinct objects with different memory locations, sb1.equals(sb2) will also return false.
		 * So, the output of your code will be:
		 * false
		 * false
		 * 
		 * Both == and equals() comparisons yield false because sb1 and sb2 are separate StringBuffer objects, 
		 * and they are not considered equal based on their object references.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
