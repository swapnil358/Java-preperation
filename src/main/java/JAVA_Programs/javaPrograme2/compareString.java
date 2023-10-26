package JAVA_Programs.javaPrograme2;

public class compareString {

	public static void main(String[] args) {

		String s1 = "i am the best";
		String s2 = "i am the best";

		if (s1.compareToIgnoreCase(s2) == 0) {
			System.out.println("Stings are equal");
		} else {
			System.out.println("Stings are not equal");
		}

		System.out.println("-------------------------------Method2----------------------------------------");

		if (s1.equalsIgnoreCase(s2)) {

			System.out.println("equal");
		} else
			System.out.println("not equal");
	}
}
