package OOPS.OOPSConceptPart3;

public abstract class TestBank {
	
	//REfer -->https://youtu.be/ah0pn81IdDU?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

	
	public static void main(String[] args) {
		{
			
			HSBCBank hs = new HSBCBank();
			
			System.out.println(USBank.min_bal);        //min_bal will be called with Class name as "USBank.min_bal"
			
			
			hs.credit();
			hs.debit();
			hs.transferMoney();
			hs.educationLoan();
			hs.carLoan();
			hs.MutualFund();
			
			
			//dynamic polymorphism
			//Child class object can be referred by parent interface variables.
			//only and only overridden method will be called
			USBank us = new HSBCBank();

			us.credit();
			us.debit();
			us.transferMoney();
			
			
			
		}
	}

}
