package OOPS.OOPSConceptPart4;

//refer - https://youtu.be/XtrSoiFfTEQ?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx\

/*Constructors:
1.Constructor is a java feature, it can be used to to perform initialization of object or Instance variables .
2.The role of the constructors in Object creation is to provide initial values inside the object.
3.In java applications, Constructors are executed exactly at the time of creating objects, not before
creating objects and not after creating objects.
4.The main utilization of constructors is to provide initializations for class level variables mainly
instance variable.
5.Constructors must have same name of the respective class.
6.Constructors are not having return types.
7.Constructors are not allowing the access modifiers like static, final,...
8.Constructors are able to allow the access modifiers like public, protected,<default> and private.
9.Constructors are allowing 'throws' keyword in its syntax to bypass exceptions from present
constructor to the caller .

*/
//What is difference between method overloading and constructor overloading with example?

//--->If we want to have different ways of initializing an object using different number of parameters,
//then we must do constructor overloading and we do method overloading when we want different definitions of a method
//based on different parameters.

//This is constructor overloading

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("One para constructor" + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two params Contructot" + i);
		System.out.println("Two params Contructot" + j);
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20, 30);

	}

}
