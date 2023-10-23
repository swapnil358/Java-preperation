package JAVA_OOPS.OOPSConceptPart3;

//REfer -->https://youtu.be/ah0pn81IdDU?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx


public class HSBCBank implements USBank,BrazilBank {    //We are achieving multiple inheritance
	//this concept called "is a relationship"`

	//if a class is implementing any interface then it is mandatory to define /override all the method of interface.
	
	//USBank method
	public void credit(){
		System.out.println("HSBC---------Credit");
		
	}
	public void debit() {
		System.out.println("HSBC--------debit");	
	}
	
	 
	public void transferMoney() {
		System.out.println("HSBC-------transferMoney");
	}
	//BrazilBank method
	public void MutualFund() {
		System.out.println("HSBC---------BrazilBank");
	}
	
	public void educationLoan() {
		System.out.println("HSBC--------educationLoan");
	}
 
	//Separate method
	public void carLoan() {
		System.out.println("HSBC------carLoan");
	}
}
