package JAVA_OOPS.OOPSConceptPart3;


//REfer -->https://youtu.be/ah0pn81IdDU?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

public interface USBank {

	
	int min_bal=100;				//Variable define in interface will static in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	//Only method declaration.
	//No method body
	//Only method prototype
	//in Interface, we can declare the variable, Variables are by default static in nature
	//Variable value will not be changed, its Final/Constant in nature
	//No static method in interface
	//No main method
	//Abstract in nature -- >we can not create/instantiate a object in interface
	//Interface is Abstract in nature
	
	
}
