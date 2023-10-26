package JAVA_Programs.javaPrograme1;

public class InterviewPgm {
	
	//Interview question asked in Persistent

	public static void main(String[] args) {

		String country = "I am from mumbai";
		
		String exp = country.replaceAll("I am from", "").trim();

		System.out.println(exp);

		method2();

	}

	public static void method2() {
		String name = "I am from chennai";
		String[] str = name.split(" ");

		System.out.println(str[3]);

	}

}
