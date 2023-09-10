package Programs.javaPrograme1;

//Write a program to count each vowel

public class CountOfEachVowel {

	public static void main(String[] args) {

		String str = "abcdefghijklmnuopqrstuvwxyz";

		char[] ch = str.toCharArray();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}

		}
		System.out.println(count);

	}

}
