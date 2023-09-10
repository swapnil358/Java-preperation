package Programs.javaPrograme2;

public class RemoveNumLetterAlphaFromString {

	// write a program to separate alphabets and numbers and special characterfrom
	// string
	// https://stackoverflow.com/questions/15116705/how-to-separate-letters-and-symbols-from-string-almost-done

	public static void main(String[] args) {

		String str = "I123Love7You$%&@";
		StringBuffer alphabetsBuild = new StringBuffer();
		StringBuffer NumberBuild = new StringBuffer();
		StringBuffer symbolBuild = new StringBuffer();

		// String[] newStr = str.split("");

		for (int i = 0; i < str.length(); i++) {
			char Fstr = str.charAt(i);
			if (Character.isAlphabetic(Fstr)) {
				alphabetsBuild.append(Fstr);
			} else if (Character.isDigit(Fstr)) {
				NumberBuild.append(Fstr);

				
			} else {
				symbolBuild.append(Fstr);
			}
		}

		System.out.println("Alphabets in string: " + alphabetsBuild.toString());
		System.out.println("Numbers in string: " + NumberBuild.toString());
		System.out.println("Special Symbols in string: " + symbolBuild.toString());

	}

}
