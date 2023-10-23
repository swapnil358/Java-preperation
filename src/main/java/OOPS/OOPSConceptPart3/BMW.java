package OOPS.OOPSConceptPart3;

public class BMW extends Car {   //It is called Has-a relationship
	
	////Refer video  "https://www.youtube.com/watch?v=DWpYniQAVyI&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=13"
	
	
	
	/*Method Overriding - When same method present in Parent as well as in Child class with same name and same number of arguments is called 
	method overriding*/
	
	@Override
	public void tyre() {
		System.out.println("BMW-----------tyre");
	}

	@Override
	public void start() {
		System.out.println("BMW-----------Start");
	}

	public void theftsafty() {
		System.out.println("BMW-------------Theftsafty");
	}
	

	
}
