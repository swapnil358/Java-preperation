package OOPS.OOPConceptPart2;

public class CallByValAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testsum(x, y); // Call by value OR pass by value
		System.out.println(obj.testsum(x, y));

		obj.p = 50;
		obj.q = 60;

		obj.swap(obj);
		System.out.println("P" + "=" + obj.p);
		System.out.println("q" + "=" + obj.q);
		
		

	}

	// Call by value
	public int testsum(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}

	// Call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // t.p = 60
		t.q = temp; // t.q= 50;

	}
	
	

}
