package Programs.javaPrograme1;

public class CountComma {

	public static void main(String[] args) {

		String s = "testcases,,,,,,,,,,,passed,";

		int count = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			char c = s.charAt(i);

			if (c == ',') {
				count++;
			}

		}
		System.out.println("count is: " + count);
		
		
		// 2. method

		/*
		 * Explaination : 1. if original length is say 10 and if it has 3 commas. 2. We
		 * take length first.. which will give you 10. 3. Now I replace commas with
		 * blank. So length becomes 7. 4. And then take difference. So returns 3 as
		 * answer.
		 */

		int str1 = s.length();

		System.out.println("original string lengh s:" + s.length());

		String s2 = s.replaceAll(",", "");

		int str2 = s2.length();

		System.out.println("string lenght after replace s2:" + s2.length());

		int str3 = str1 - str2;

		System.out.println("comma are: " + str3);

	}
}
