package Programs.javaPrograme1;

public class Nice_interview_ques {

//2. Write a program as follows:	
	// Input - a[1,2,3]
	//Output - b[1*2, 2*3, 1*3]

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };

		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				b[i] = a[i] * a[0];
			} else {
				b[i] = a[i] * a[i + 1];
			}

		}
		for (int j : b) {
			System.out.println(j);
		}
		
		
//		//print b array
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
	}
}
