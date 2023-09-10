package Programs.javaPrograme1;

public class GetNumberFromString {

	public static void main(String[] args) {

		
	     	String str= "2019\ncurrent";
		   
		   String numberOnly = str.replaceAll("[^0-9]", "");
		   
		  int i =  Integer.parseInt(numberOnly);
		 
		   System.out.println(i);
		   
		   method1();
	}
	
	
	public static void method1() {
		String str= "20191225-0001";
		
		String replaceAll = str.replaceAll("[^0-9]", "");
		System.out.println("Method 2: "+replaceAll);
		
	}

}
