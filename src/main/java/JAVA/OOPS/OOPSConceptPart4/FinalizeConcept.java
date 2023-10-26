package JAVA.OOPS.OOPSConceptPart4;

//refer video: https://youtu.be/aqDiBybBRqM?list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx

/*	final  -- keyword
	finally -- block
	finalize - method
*/

public class FinalizeConcept {
	
	
	public void finalize() {  // finalize method will be called just to clean up processing of object	
		
		System.out.println("finalize method");
	}

	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();        //this particular method called Garbage collector
		
		
	}

}
