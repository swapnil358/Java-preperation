package JAVA_Programs.javaPrograme1;

public class MergeTwoArrays {
	
	//https://youtu.be/JeQtPl3nxu4

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };
		int[] b = { 70, 80, 90 };


		
		int a_len = a.length;
		System.out.println(a_len);
		
		int b_len = b.length;
		System.out.println(b_len);
		
		int c_len = a.length + b.length;  
		System.out.println(c_len);
		

		int[] c= new int[c_len];
		
		
		
		for(int i=0; i<a_len; i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b_len; i++) {
			c[a_len+i]=b[i];
		}
		for(int i=0; i<c_len; i++) {
			System.out.print(c[i]+" ");
		}
		
		
		
		
		
	}

}
