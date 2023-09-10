package Programs.javaPrograme1;

public class LargestAndSmallestOfArray {

	
	
	//To print smallest and largest array from given array
		
			
	public static void main(String[] args) {
		
		int[] a = new int[] { 1, 20, 15, 98, 50, 90 };
		
	//	System.out.println(a.length);
						
		int min = a[0];
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++ ) {
			
			if(a[i]>max) {
				
				max = a[i];		
			}
			
			if(a[i]<min) {
				
				min = a[i];	
			}	
			
		}

		System.out.println("Smallest Array is : "+min);
		System.out.println("Largest Array is : "+max);
		
		
		

	}

}
