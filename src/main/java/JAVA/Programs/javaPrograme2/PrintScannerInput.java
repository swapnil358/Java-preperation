package JAVA.Programs.javaPrograme2;

import java.util.Scanner;

public class PrintScannerInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name below:" );
		String name = sc.nextLine();
		System.out.println("Entered Name is:" + name);

		System.out.println("Please enter age below:");
		int number = sc.nextInt();
		System.out.println("Entered age is:" + number);
	}

}
