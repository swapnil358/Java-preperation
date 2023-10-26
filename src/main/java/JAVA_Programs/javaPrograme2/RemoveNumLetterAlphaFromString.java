package JAVA_Programs.javaPrograme2;

public class RemoveNumLetterAlphaFromString {

	// write a program to separate alphabets and numbers and special characterfrom
	// string
	// https://stackoverflow.com/questions/15116705/how-to-separate-letters-and-symbols-from-string-almost-done

	public static void main(String[] args) {

		String str = "I123Love7You$%&@";
		StringBuffer alphabets = new StringBuffer();
		StringBuffer Numbers = new StringBuffer();
		StringBuffer symbols = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char Fstr = str.charAt(i);
			if (Character.isAlphabetic(Fstr)) {
				alphabets.append(Fstr);
			} else if (Character.isDigit(Fstr)) {
				Numbers.append(Fstr);
			} else {
				symbols.append(Fstr);
			}
		}
		System.out.println("Alphabets in string: " + alphabets.toString());
		System.out.println("Numbers in string: " + Numbers.toString());
		System.out.println("Special Symbols in string: " + symbols.toString());
	}
}
