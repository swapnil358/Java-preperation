package OOPS.AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
	
		
	//Dynamic polymorphism
		
		System.out.println("Child class object reffered by parent class variable--i.e //Dynamic polymorphism");
		
		Bank b = new HDFCBank();			//Child class object reffered by parent class variable--i.e //Dynamic polymorphism
		b.credit();
		b.debit();
		b.loan();
		
		
		
		//HDFCBank hd = new Bank();   //Upcasting is not possible
		
		
		
		
		  
		/*
		 * Bank b1 = new Bank(); *Can not create the object of Abstract class
		 */		 
		
	}

}
