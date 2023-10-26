package JAVA_Programs.javaPrograme2;

public class StringEndWith {
	
	//9) How to find whether a String ends with a specific character or text using Java program?
	
	public static void main(String[] args) {
		
		String s1 = "java is programming language";
		
		
		boolean endWithCharacter = s1.endsWith("e");
		System.out.println("endWithCharacter : "+ endWithCharacter); //true
		
		boolean endWithWord = s1.endsWith("language");
		System.out.println("endWithWord : "+ endWithWord);
	}

}
