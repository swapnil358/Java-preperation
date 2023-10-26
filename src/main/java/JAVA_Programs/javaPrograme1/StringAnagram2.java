package JAVA_Programs.javaPrograme1;

public class StringAnagram2 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "avaj";
		
		
		int m = s1.length();
		int n = s2.length();

		System.out.println(m);
		System.out.println(n);

		String s3 = s1 + s1;

		if (s1.length() == s2.length()) {

			System.out.println("s1 is anagrame of s2");

		} else

		if (s3.contains(s2)) {
			System.out.println("\"s1 is anagrame of s2\"");

		} else {
			System.out.println("s1 is not anagrame of s2");
		}

	}

}
