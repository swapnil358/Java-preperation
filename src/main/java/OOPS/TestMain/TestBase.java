package OOPS.TestMain;

public class TestBase {
	
	//https://youtu.be/YWL-FyLihE8
	
	//Can we overload a main() method in Java? || Java Interview Question
	//Answer - main method can be overloaded.
	//JVM will try find-- main(String[] args) first--"public static void main(String[] args)"

	public static void main(String[] args) {
		System.out.println("Main Method 1");
	
		main("testing");
		main(10);
		main(20,30);
	}
	
	
	public static void main(String args) {
		System.out.println("Main Method 2");
	}

	public static void main(int a) {
		System.out.println("Main Method 3");
	}
	

	public static void main(int a, int b) {
		System.out.println("Main Method 4");
	}
	
	
	

}
