package OOPS.StringImmutableConcept;

public class StringVsStringBuffer {

	public static void main(String[] args) {

		String s = new String("durga"); // Since String in immutable, it is not going to Concat
		s.concat("software");
		
		System.out.println("the value of s become:" +s);

		
		
		String s1 = new String("durga");

		System.out.println(s);
		
		
		//Expalain '==' operator and '.equal' method
		// '==' operator ------> meant for Reference comparison
		// '.equals()' method ------> meant for Content comparison

		System.out.println(s == s1); // O/P: false , '==' is reference comparison---but s and s1 both reference
										// variable pointing to two different string object

		System.out.println(s.equals(s1)); // true, equals() methos used to ---compare content comparison----, since S
											// and S1
											// contents are similar hence it is True

		StringBuffer sb = new StringBuffer("durga"); // Since it is mutable, it is going to append 'software'
		sb.append("software");
		System.out.println("StringBuffer concat:sb : "+sb);

		StringBuffer sb1 = new StringBuffer("durgasoftware");

		System.out.println("Using StringBuffer sb1 : " + sb1);

		System.out.println(sb == sb1); //pointing to different objects
		

		System.out.println(sb.equals(sb1));  //false --here in StringBuffer--> euqals() method act similar '==' reference comparison
		
	}

}
