package JAVA.OOPS.ExceptionHandling;

public class CheckedException {

	
	//The exception which checked by compiler for smooth execution of program at runtime is called Checked exception
	/*
	 * Example: - FIlenotFoundException is Checked exception
	 * IOException
	 * SQLException
	 * HallticketMissingexception
	 * PenNotWorkingException
	 * 
	 * 
	 * In Case of Checked exception -  Compiler will check whether the programmer is handling exception if programmer not handing
	 * exception the we will get Compile time error
	 */
	public static void main(String[] args) {
		
	//	PrintWriter pw = new PrintWriter("abc.txt");   //--Here Compiler throws  FilenotFoundException by default
	//	pw.println("Hello");
		
		System.out.println(10/0); 
		
		
		/*
		 * Unchecked Exception - The Exception which are not checked by compiler are called unchecked exception
		 * 
		 * Example:---
		 * NullPointerException
		 * ArrayOutofBoundException
		 * ArithmeticException
		 * BombBlastException
		 * NullPointerException
		
		In case of Unchecked Exception ---> Compiler won't check whether programmer handling exception or not
		*/
		
		
		/*
		 * Note-->Whether exception are Checked or Unchecked compulsory it will occur only at Runtime
		 * There is not chance of occurring any exception at compile time
		
		
		Note-2 ----->Runtime exception and its child classes, Error and it's child classes are unchecked exception
		and remaining are checked exception
		*/

	}

}
