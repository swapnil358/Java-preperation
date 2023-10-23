package OOPS.OOPConceptPart2;

public class LocalVsGlovalVariabe {
	
	String name = "Tom";				//Global Variable   //variable which are defined class level
	int age =25;
	
	public static void main(String[] args) {
		
		
		int i=10;					//Local variable   
		System.out.println(i);
	
		
		LocalVsGlovalVariabe l = new LocalVsGlovalVariabe();
		
		
		String s = l.name;
		System.out.println(s);
		int in = l.age;
		System.out.println(in);
		
		
	
		
		
	}
	
	public void sum() {
		
		//i and J is local variabe for Sum method 
		//Scope of i and j is always availble within sum() method
		int i=15;			
		int j=20;
		
				
				
	
		
		
	}

}
