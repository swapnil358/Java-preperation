package JAVA.OOPS.ExceptionHandling;

public class CheckedException {

	
	//The exception which checked by compiler for smooth execution of program at compile time is called Checked exception
	// Compile-Time Exceptions-- because this detects at Compile-time


	/*
	 * Example: - FIlenotFoundException is Checked exception
	 * IOException
	 * SQLException
	 * FileNotFoundException
	 * 
	 * 
	 * In Case of Checked exception  -  Compiler will check whether the programmer is handling exception if programmer not handing
	 * exception the we will get Compile time error
	 */
	public static void main(String[] args) {
		
	//	PrintWriter pw = new PrintWriter("abc.txt");   //--Here Compiler throws  FilenotFoundException by default
	//	pw.println("Hello");
		
		System.out.println(10/0); 
		
		
		/*
		 * (Runtime Exceptions (Unchecked Exceptions):) - The Exception which are not checked by compiler are called unchecked exception
		 * because this detects at Runtime-time
		 *
		 * Example:---
		 * NullPointerException
		 * ArrayOutOfBoundException
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
