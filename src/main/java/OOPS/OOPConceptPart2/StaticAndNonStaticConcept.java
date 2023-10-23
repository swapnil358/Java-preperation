package OOPS.OOPConceptPart2;

public class StaticAndNonStaticConcept {

	//Scope of global variable will available across the functions/methods with some conditions.
	String name = "TOM";
	static int age = 25;
	
	public static void main(String[] args) {

		//Calling static variable and method
		
	
		
		//Calling directly
		System.out.println("Calling directly : "+age);  //You can not call 'name' directly because it is non static
		
		
		//Calling by classname
		System.out.println("Calling by classname: "+StaticAndNonStaticConcept.age); 
		
		//Calling directly
		sum();	
		
		//Calling by classname
		StaticAndNonStaticConcept.sum();
		
		//Calling non-static variable and method, we have to create object first.
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		String s = obj.name;
		System.out.println(s);
		obj.sendMail();
		
				
		
		//Can i access static method by using object reference ---->Yes we can use but it gives warning, and that is not good practice.
		
		obj.sum();
		

	}
	public void sendMail() {					//Non static method
		System.out.println("SendMail method");
	}
	
	public static void sum() {					//Static method
		System.out.println("sum method");
	}

	
	
	
	
	
}
