package JAVA_OOPS.OOPConceptPart2;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();

		

		int l = obj.pqr();
		System.out.println(l);

		String d = obj.qa();
		System.out.println(d);

		int m = obj.division(30, 10);
		System.out.println(m);

	}

	// Non static method
	// It return nothing, hence void identifier
	public void test() {
		System.out.println("Run test");
	}

	// It return integer, hence Int identifier
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	// It return String, hence String identifier
	public String qa() {
		System.out.println("qa method");
		String s = "swapnil";

		return s;
	}

	// It retur integer, hence Int identifier
	// X and Y is parameter or Argument
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;

		return d;
	}

}
