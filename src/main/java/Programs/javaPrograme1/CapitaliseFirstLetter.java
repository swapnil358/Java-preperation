package Programs.javaPrograme1;

import java.util.Iterator;
import java.util.Scanner;

public class CapitaliseFirstLetter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		Scanner lineScan = new Scanner(line);
		
		String upper_case_line = "";
		
		while (lineScan.hasNext()) {
			String word = lineScan.next();
			String upper = Character.toUpperCase(word.charAt(0)) + word.substring(1);

			upper_case_line += upper + " ";
		}
		System.out.println(upper_case_line);

	}

}
