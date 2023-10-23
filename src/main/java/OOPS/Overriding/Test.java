package OOPS.Overriding;

public class Test {

	public static void main(String[] args) {

		Child obj = new Child();   //All parent and overridden method will be called
		obj.p();
		obj.p1();
		obj.p3();

		Parent obj1 = new Parent(); //only parent method will be called
		obj1.p();
		obj1.p1();
		

		Parent obj3 = new Child(); //only parent method will be called
		obj3.p();
		obj3.p1();
		
		

	}

}
