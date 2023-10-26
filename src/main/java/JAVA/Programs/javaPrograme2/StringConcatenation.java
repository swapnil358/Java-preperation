package JAVA.Programs.javaPrograme2;

public class StringConcatenation {

	public static void main(String[] args) {

	//	String s1 = "Interview Questions In Java";
		
		String s1 = new String("Interview Questions In Java");
		s1.concat("hgfghf");
		System.out.println(s1);
		
		String s2 = " And Selenium";
		String s3 = s1.concat(s2);
		System.out.println("After concatenation: " + s3);
	}
}
