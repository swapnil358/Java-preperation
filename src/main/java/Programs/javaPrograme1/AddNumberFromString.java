package Programs.javaPrograme1;

public class AddNumberFromString {

	public static void main(String[] args) {

		/*
		 * Interview Question - Add the numbers from the String.
		 */

		String str = "My142Love786";

		String updatedStr = str.replaceAll("[aA-zZ]", " ");

		System.out.println(updatedStr);

		String[] splt = updatedStr.split(" ");
		

		System.out.println(splt);

		int sum = 0;

		for (String string : splt) {
			if (string.matches("[0-9]+")) {
				int i = Integer.parseInt(string);

				sum = sum + i; // 1,5,7,14,
			}
		}
		
		System.out.println("Addition of the numbers from the String: "+sum);
	
	}
	

}
