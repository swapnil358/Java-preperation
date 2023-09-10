package Programs.javaPrograme1;

public class CountOddEvenNumber {

	public static void main(String[] args) {
		
		//Count even and odd from the given number

		int num = 234873;

		int r = 0;
		int even = 0;
		int odd = 0;
		while (num != 0) {

			r = num % 10;

			if (r % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			num = num / 10;

		}

		System.out.println(even);
		System.out.println(odd);
	}

}
