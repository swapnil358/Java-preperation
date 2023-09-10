package Programs.javaPrograme2;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String s = "I love you";
		
		String s1 = s.replaceAll(" ", "");
		
		System.out.println(s1);
		
		
		method2();
	}
	
	public static void method2() {
		String s = " I love you ";
		
		String s2 = s.trim();
	
		System.out.println(s2);
	}

}
