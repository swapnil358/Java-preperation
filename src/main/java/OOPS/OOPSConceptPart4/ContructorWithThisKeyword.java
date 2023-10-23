package OOPS.OOPSConceptPart4;


//refer - https://youtu.be/XtrSoiFfTEQ?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

//Durga- https://youtu.be/Jll2gxAdfxI

//Smart programming - https://youtu.be/Imy9TEJkKa8
					  //https://youtu.be/Imy9TEJkKa8?t=414

//Constructor is used to initialize the object

public class ContructorWithThisKeyword {

	String name;
	int age;
	
	public ContructorWithThisKeyword(String name, int age) {
		
		this.name =name;
		this.age =age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
	
	public static void main(String[] args) {

		ContructorWithThisKeyword obj = new ContructorWithThisKeyword("test", 20);
		ContructorWithThisKeyword obj1 = new ContructorWithThisKeyword("test2", 30);
	}

}
