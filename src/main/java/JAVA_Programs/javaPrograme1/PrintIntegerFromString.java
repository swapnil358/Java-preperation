package JAVA_Programs.javaPrograme1;

public class PrintIntegerFromString {

	
	public static void main(String[] args) {
		
		String str = "545qwert454";
		
	    String str1 = str.replaceAll("[a-z]", "").trim();
	    //OR
	    String str2= str.replaceAll("[^0-9]", "").trim();
		
	    int i = Integer.parseInt(str2);
	    
	    System.out.println(i);
		
	}	
}
