package JAVA.Programs.javaPrograme2;

import java.util.Arrays;

/*				Input-tomorrow
				Output-ooorrtmw
				Can someone please help me with this program logic?

*/

public class InterviewQues {

	public static void main(String[] args) {

		String s = "tomorrow";
		System.out.println("input::" + " " + s);
		char[] arr = s.toCharArray();

		Arrays.sort(arr);
		System.out.println("After sorting::" + " " + new String(arr));
		char temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 't') {
				arr[i] = arr[i + 1];
			} else {
				arr[i] = temp;
				break;
			}

		}
		System.out.println("output::" + " " + new String(arr));

	}

}
