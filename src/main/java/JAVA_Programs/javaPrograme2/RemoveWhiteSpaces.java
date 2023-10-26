package JAVA_Programs.javaPrograme2;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String s = "I love you";
		String s1 = s.replaceAll(" ", "");
		System.out.println(s1);
		removeTrailingSpaces();
	}
	
	public static void removeTrailingSpaces() {
		String s = " I love you ";
		String s2 = s.trim();
		System.out.println(s2);
	}

}
