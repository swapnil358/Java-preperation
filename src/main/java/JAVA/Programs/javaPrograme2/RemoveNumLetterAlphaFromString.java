package JAVA.Programs.javaPrograme2;

public class RemoveNumLetterAlphaFromString {

	/*
	 * Write a program to separate alphabets, numbers
	 * and special characters from a String.
	 *
	 * Input:
	 * I123Love7You$%&@
	 *
	 * Output:
	 * Alphabets  : ILoveYou
	 * Numbers    : 1237
	 * Symbols    : $%&@
	 */

	public static void main(String[] args) {

		String str = "I123Love7You$%&@";

		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char Fstr = str.charAt(i);

			if (Character.isAlphabetic(Fstr)) {

				alphabets.append(Fstr);

			} else if (Character.isDigit(Fstr)) {

				numbers.append(Fstr);

			} else {

				symbols.append(Fstr);
			}
		}

		System.out.println("Alphabets in string: " + alphabets);

		System.out.println("Numbers in string: " + numbers);

		System.out.println("Special Symbols in string: " + symbols);
	}
}