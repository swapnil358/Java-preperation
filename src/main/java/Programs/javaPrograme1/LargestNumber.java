package Programs.javaPrograme1;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		//a>b a>c     a is greater
		//b>a b>c     b greater
		//c>a c>b	  c greater
		
		
		if(a>b && a>c) {
			System.out.println(a+ " is largest number");
		}
		if(b>a && b>c) {
			System.out.println(b+" is largest number");
		}
		if(c>a && c>b) {
			System.out.println(c+" is largest number");
		}
		
		
	}

}
