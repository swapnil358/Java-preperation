package JAVA.Programs.javaPrograme2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharFromString {

	public static void main(String[] args) {

		removeDupChar();

	}
	
	
	

	private static void removeDupChar() {
		String str = "Maharaja";

		Set<Character> set = new HashSet<>();

		String s = "";
		StringBuffer dupChar = new StringBuffer();
		

		for (int i = 0; i < str.length(); i++) {
			char fstr = str.charAt(i);

			if (set.add(fstr)) {
				dupChar.append(fstr);
				//s=s+fstr;
			}

		}
		System.out.println(dupChar.toString());
		//System.out.println(s);

	}

}
