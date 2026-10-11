package JAVA.Programs.javaPrograme1;

public class PrintIntegerFromString {

	
	public static void main(String[] args) {
		
		String str = "545qwert454";
		
	    String str1 = str.replaceAll("[a-z]", "").trim();

		System.out.println(str1);
	    //OR
	    String str2= str.replaceAll("[^0-9]", "").trim();

		System.out.println(str2);
		
	    int i = Integer.parseInt(str2);
	    
	    System.out.println(i);
		
	}	
}
