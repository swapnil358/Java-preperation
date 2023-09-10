package Programs.javaPrograme1;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "The Rains Started Here";
		
		String s2 = "The Rains started Here";
		
		System.out.println(s1.length());
				
		System.out.println(s1.charAt(10));   //return char present on index
		
		System.out.println(s1.indexOf("s"));
		
		System.out.println(s1.indexOf('S', s1.indexOf("s")+1));
		
		System.out.println(s1.indexOf("Here"));
		
		//String comparision
		System.out.println(s1.equals(s2));
	
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//substring
		System.out.println("substring: "+s1.substring(9, 18));
		
		//trim()
		String s3 = "   Hello world    ";
		
		System.out.println("trim: "+s3.trim());   //remove first and last space
		
		//replace
		System.out.println("replace: "+s3. replace(" ", ""));
		
		//split
		String s4 = "Hello_world_test_selenium";
		String [] str = s4.split("_");
		
		for (String str1 : str) {
			System.out.println(str1);
		}
		
		//concat
		String s5 = "care";
		System.out.println(s5.concat("s"));
		
		//important
		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		

	}

}
