package JAVA.OOPS.OOPSConceptPart4;

//Call return statement or System.exit on try or catch block

public class FinallyBlock_InterviewQ {
	
/*
 * ---The finally block will not execute if System.exit(0) is called (since the JVM exits when that statement is called)
  
  ---it will execute when a return statement is called (since the Java VM does not exit when that statement is called).	
 */
	
	
	
	
	
	
	public static void main(String[] args) {

		try {
			int[] i = { 1, 2, 3 };
			int x = i[5];// Change to 2 to see "return" result
			return;
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
		
			System.exit(1);      //When you call System.exit(0) then Java VM exits hence finally will not execute
			
		} finally {
			System.out.println("finally");
		}
	}

}
