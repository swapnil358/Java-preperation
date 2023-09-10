package Programs.javaPrograme2;

import java.util.Scanner;

public class PrintScannerInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter Name:" + name);

		int number = sc.nextInt();
		System.out.println("Enter Number:" + number);
	}

}
