package Programs.DataStructurePrgm;

public class InsertElementInArray {
	
	//Insert An Element Into An Array In Java (Data Structure)
	//https://youtu.be/DZM0GyL8Ars?list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		int position = 3;
		int element = 100;


		for (int i=a.length-1; i>position-1; i--) {

			a[i] = a[i-1];

		}
		a[position - 1]=element;
		
		for(int j=0; j<a.length;j++) {
			System.out.println(a[j]);
		}
		

	}

}
